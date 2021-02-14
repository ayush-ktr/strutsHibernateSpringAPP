package com.struts.training.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.manager.CommonUseManager;

public class WriteToDBAction {

	private static final String SUCCESS = "success";

	private static final String FAILURE = "failure";
	
	private boolean isDbActionSuccess = false;
	
	private CommonUseManager commonUtils;
	
	public WriteToDBAction() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		setCommonUtils((CommonUseManager) appContext.getBean("commonUtilsImpl"));
		((ConfigurableApplicationContext)appContext).close();
	}

	public WriteToDBAction(CommonUseManager commonUtils) {
		this.commonUtils = commonUtils; 
	}

	public String execute() {
		try {
			if (commonUtils.writeToDB()) {
				setIsDbActionSuccess(true);
				return SUCCESS;
			}
			else
				return FAILURE;
		} catch (Exception e) {
			e.printStackTrace();
			return FAILURE;
		}
	}

	public String deleteDataFromDB() {
		try {
			if (commonUtils.deleteDataFromDB()) {
				setIsDbActionSuccess(true);
				return SUCCESS;
			}
			else
				return FAILURE;
		} catch (Exception e) {
			e.printStackTrace();
			return FAILURE;
		}
	}

	public boolean getIsDbActionSuccess() {
		return isDbActionSuccess;
	}

	public void setIsDbActionSuccess(boolean isDbActionSuccess) {
		this.isDbActionSuccess = isDbActionSuccess;
	}

	public CommonUseManager getCommonUtils() {
		return commonUtils;
	}

	public void setCommonUtils(CommonUseManager commonUtils) {
		this.commonUtils = commonUtils;
	}
	
}