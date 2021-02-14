package com.highradius.manager;

import com.highradius.model.LuUser;

public interface UserManager {
	public String userLogin(LuUser user) throws Exception;
	
	public String createUser(LuUser user) throws Exception;
	
	public LuUser isUserLoggedIn() throws Exception;
	
	public boolean checkUserNameAvailability(String username) throws Exception;
}
