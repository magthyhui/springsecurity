package com.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.MainDao;
import com.test.entity.Role;
import com.test.entity.User;
import com.test.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Resource
	MainDao mainDao;
	
	@Override
	public List<Role> getRolesByUser(String username) {
		// TODO Auto-generated method stub
		return mainDao.getUserRoles(username);
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return mainDao.getUser(username);
	}

}
