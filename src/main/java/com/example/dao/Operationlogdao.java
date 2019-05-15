package com.example.dao;

import com.example.bean.Operationlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface Operationlogdao
        extends JpaRepository<Operationlog,Integer> {




    public List<Operationlog> findByOlContextLike(String context);

    @Query("select log from Operationlog log where user_code=?1")
    public List<Operationlog> findSearch(String context);

   /* select * from operationlog where ol_context like '%成功%'
    and user_code='15848635817@qq.com' and ol_date BETWEEN '2019-05-11' AND '2019-05-13'*/

    @Query("select log from Operationlog log where log.userCode like %?1% and log.olDate between ?2 and ?3  and log.olContext like %?4%")
    public List<Operationlog> findSearchPlus(String usercode, Date start,Date end,String context);

}
