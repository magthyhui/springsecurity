package com.test.dao;

import java.util.List;

import com.test.entity.Role;
import com.test.entity.User;

public interface MainDao {

	List<Role> getUserRoles(String username);

	User getUser(String username);

}
