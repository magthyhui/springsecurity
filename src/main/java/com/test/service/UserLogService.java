package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserLogDao;
import com.test.entity.User;
import com.test.utils.Common;

@Transactional
@Service
public class UserLogService {
	
	@Resource
	private UserLogDao userLogDao;
	
	public void addLog(User user, String ip, String action) {
		String time = Common.getCurrentTime2MysqlDateTime();
		Number id = userLogDao.addLog(user,ip,time,action);
	}
}
