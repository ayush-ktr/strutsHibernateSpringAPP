package com.struts.training.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.manager.UserManager;
import com.highradius.model.LuUser;

public class UserAction {

	private String password;

	private String userName;
	
	private String output;

	private static final String SUCCESS = "success";

	private static final String FAILURE = "failure";

	UserManager userManager;

	public UserAction() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		setUserManager((UserManager) appContext.getBean("userManagerImpl"));
		((ConfigurableApplicationContext) appContext).close();
	}
	
	public String openHomePage() {
		return SUCCESS;
	}

	public String openLoginPage() {
		return SUCCESS;
	}
	
	public String createANewUser() {
		LuUser user = new LuUser();
		try {
			user.setUserName(userName);
			user.setPassword(password);
			setOutput(userManager.createUser(user));
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return FAILURE;
		}
	}
	
	public String login() {
		LuUser user = new LuUser();
		try {
			user.setUserName(userName);
			user.setPassword(password);
			setOutput(userManager.userLogin(user));
			return SUCCESS;
		}
		catch(Exception e) {
			e.printStackTrace();
			return FAILURE;
		}
	}
	
	public String isUserNameAvailable() {
		try {
			setOutput(String.valueOf(userManager.checkUserNameAvailability(userName)));
			return SUCCESS;
		}
		catch(Exception e) {
			e.printStackTrace();
			return FAILURE;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

}
