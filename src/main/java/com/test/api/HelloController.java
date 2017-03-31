package com.test.api;

import java.util.Map;
import java.util.concurrent.Future;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.config.Constants;
import com.test.entity.AuthRequest;

@RestController
@RequestMapping(value = Constants.URI_API_PREFIX)
public class HelloController {
    
    
   /* @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;
    
   */
    
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ResponseEntity<?> test(@RequestBody Map<String,Object> param) throws AuthenticationException{
		
		return ResponseEntity.ok("ok");
		
	}
    
}