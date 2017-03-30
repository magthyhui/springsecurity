package com.test.service;

import java.util.List;

import com.test.entity.Role;
import com.test.entity.User;

public interface UserService {

	List<Role> getRolesByUser(String username);

	User getUser(String username);

}
