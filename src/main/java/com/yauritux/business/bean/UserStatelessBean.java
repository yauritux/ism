package com.yauritux.business.bean;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.yauritux.business.iface.RemoteUser;
import com.yauritux.domain.User;
import com.yauritux.domain.UserService;
import com.yauritux.factory.UserServiceFactory;

@Stateless
@Remote(RemoteUser.class)
public class UserStatelessBean implements RemoteUser {
	
	@Override
	public User getUserById(String userId) {
    	UserServiceFactory userServiceFactory = new UserServiceFactory();
    	UserService userService = userServiceFactory.create();
    	return userService.getUserById(userId);
	}
}
