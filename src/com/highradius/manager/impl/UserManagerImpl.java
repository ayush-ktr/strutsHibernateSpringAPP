package com.highradius.manager.impl;

import com.highradius.dao.UserDao;
import com.highradius.manager.UserManager;
import com.highradius.model.LuUser;

public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	
	public UserManagerImpl(UserDao userDao){
		this.userDao = userDao;
	}
	
	private static final String SUCCESS = "success";

	private static final String FAILURE = "failure";
	
	private static final String USER_NAME_NOT_AVAILAIBLE = "username not available";

	@Override
	public String userLogin(LuUser user) throws Exception {
		return userDao.userLogin(user);
	}

	@Override
	public String createUser(LuUser user) throws Exception {
		if(userDao.checkUserNameAvailability(user.getUserName())) {
			return userDao.createUser(user);
		}
		else {
			return USER_NAME_NOT_AVAILAIBLE;
		}
	}

	@Override
	public LuUser isUserLoggedIn() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUserNameAvailability(String username) throws Exception {
		return userDao.checkUserNameAvailability(username);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

}
