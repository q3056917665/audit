package com.example.aop;


import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {


    String module() default "";
    String type() default  "";
    String content() default "";

}
