package com.example.aop;


import com.example.bean.Operationlog;
import com.example.bean.User;
import com.example.service.OperationlogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Aspect
@Component
public class LogAspect {

    @Resource
    private OperationlogService logService;

    /**
     * 日志切入点
     */
    @Pointcut("@annotation(com.example.aop.Log)")
    public void logPointCut(){}



    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //常见日志实体对象
        Operationlog log=new Operationlog();
        //获取登录用户账号
        HttpServletRequest request=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        User user=(User)request.getSession().getAttribute("user");
        System.out.println(user.getUserCode()+"-------------------------------");
        //添加用户账号
        //log.setUserCode(user.getUserCode());
        //添加用户单位
        log.setUserCode(user.getUserCode());

        log.setOlCompany("单位");
        //添加当前时间
        log.setOlDate(new Date());
        //方法通知前获取时间,为什么要记录这个时间呢？当然是用来计算模块执行时间的
        long start = System.currentTimeMillis();
        // 拦截的实体类，就是当前正在执行的controller
        Object target = pjp.getTarget();
        // 拦截的方法名称。当前正在执行的方法
        String methodName = pjp.getSignature().getName();
        // 拦截的方法参数
        Object[] args = pjp.getArgs();
        // 拦截的放参数类型
        Signature sig = pjp.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Class[] parameterTypes = msig.getMethod().getParameterTypes();
        Object object = null;
        // 获得被拦截的方法
        Method method = null;
        try {
            method = target.getClass().getMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        } catch (SecurityException e1) {
            e1.printStackTrace();
        }
        if (null != method) {
            // 判断是否包含自定义的注解，说明一下这里的SystemLog就是我自己自定义的注解
            if (method.isAnnotationPresent(Log.class)) {
                //获取操作日志
                Log operationlog = method.getAnnotation(Log .class);
                log.setOlModule(operationlog.module());
                log.setOlType(operationlog.type());
                try {
                    log.setOlContext(operationlog.content());
                    object = pjp.proceed();
                    long end = System.currentTimeMillis();
                    //保存进数据库
                    logService.addLog(log);
                } catch (Throwable e) {
                    log.setOlContext("操作失败！方法名："+methodName+"方法参数:"+args);
                    logService.addLog(log);
                }
            } else {//没有包含注解
                object = pjp.proceed();
            }
        } else { //不需要拦截直接执行
            object = pjp.proceed();
        }
        return object;
    }


}
