package com.struts.training.action;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.highradius.manager.CommonUseManager;
import com.highradius.model.CMSUserCallerID;
import com.highradius.model.CMSUserVirtualNumber;
import com.highradius.model.CustomerContact;
public class Test {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		CommonUseManager manager = (CommonUseManager) appContext.getBean("commonUtilsImpl");
		try {
			List<Object> hello = null;//manager.getUserVirtualAndCallerIdDetails(75, 17);
			CustomerContact cc = (CustomerContact) hello.get(0);
//			Boolean value = manager.updateUserCallerMasking(5, 17, true, "Ayush");
//			CMSUserCallerID CMSuserVirtualNumber = manager.getCountry();
//			System.out.println(CMSuserVirtualNumber.get(0).toString());
			JsonObject jsonObjectForHoldData = new JsonObject();
			JsonArray jsonArray = new JsonArray();
//			jsonArray.
//			 jsonObjectForHoldData.put("results", CMSuserVirtualNumber.size());
//		     jsonObjectForHoldData.put("rows", CMSuserVirtualNumber);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
