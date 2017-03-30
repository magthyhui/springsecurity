package com.test.api;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    
   /* @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;
    
   */
    
    @RequestMapping("/helloss")
    public String indexs() throws Exception {
        /*String sql ="select bt from fm_recgl where id = '20'";
        String ls = jdbcTemplate1.queryForObject(sql,String.class);
        return ls;*/
        return null;
    }

    
}