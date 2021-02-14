package com.struts.training.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.JSONResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.highradius.manager.CommonUseManager;
import com.highradius.manager.MovieListManager;
import com.highradius.model.CMSUserCallerID;
import com.highradius.model.CMSUserVirtualNumber;
import com.highradius.model.Movie;
import com.highradius.model.NumberDTO;

public class DBSearchAction {
	private static CommonUseManager manager;
	static{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		manager = (CommonUseManager) appContext.getBean("commonUtilsImpl");
	}
	private ArrayList<Movie> listFromAction;

	private String title;
	
	private String category;
	
	private String language;
	
	private int releaseYear;
	
	private static final String SUCCESS ="success";
	
	private MovieListManager movieListService;
	
	private String output;
	
	private String rows;
	
	private String results;
	
	private Boolean maskingStatus;

	public void setMaskingStatus(Boolean maskingStatus) {
		this.maskingStatus = maskingStatus;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public DBSearchAction() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		CommonUseManager manager = (CommonUseManager) appContext.getBean("commonUtilsImpl");
		((ConfigurableApplicationContext)appContext).close();
	}
	
	public DBSearchAction(MovieListManager movieListService) {
		this.movieListService = movieListService;
	}
	
	public String get() {
		try {
			ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:application_context.xml");
			CommonUseManager manager = (CommonUseManager) appContext.getBean("commonUtilsImpl");
			CMSUserCallerID CMSuserVirtualNumber = manager.getCountry(99);
			JsonObject jsonObjectForHoldData = new JsonObject();
			JsonElement js;
			setRows("1");
			List<Object> list = new ArrayList<>();
			HashMap<String,Object> hMap = new HashMap<>();
			NumberDTO x = new NumberDTO();
//			x.setVirtualNumber(CMSuserVirtualNumber.getVirtualNumber());
			x.setUserName(CMSuserVirtualNumber.getLuUser().getUserName());
			x.setCallerID(null);//CMSuserVirtualNumber.getIncomingNumber());
			x.setMaskingEnabled(false);
			list.add(x);
			hMap.put("results", 1);
			hMap.put("rows", list);
//			setResults(new Gson().toJson(CMSuserVirtualNumber));
//			jsonObjectForHoldData.addProperty("results", 1);
//		     jsonObjectForHoldData.addProperty("rows", new Gson().toJson(CMSuserVirtualNumber));
			System.out.println(new Gson().toJson(hMap));
		     setOutput(new Gson().toJson(hMap).toString());
		     
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String getUserMaskingDetails() {
//		LOGGER.info("Inside getUserMaskingDetails() with user: ");
		CMSUserVirtualNumber cmsVirtualNumber = null;
		CMSUserCallerID cmsUserCallerID = null;
		List<Object[]> cmsUserCall = null; 
		Map<String,Object> objectForHoldData = new HashMap<>();
		List<Map<String,Object>> jsonArray = new ArrayList<Map<String,Object>>();
		Map<String,Object> jsonObject = new HashMap<>();
		try {
//			cmsUserCall = manager.getUserVirtualAndCallerIdDetails(5, 17);
//			cmsVirtualNumber = (CMSUserVirtualNumber) cmsUserCall.get(0)[0];
//			cmsUserCallerID = (CMSUserCallerID) cmsUserCall.get(0)[1];
//			if(cmsVirtualNumber != null) {
//				jsonObject.addProperty("userName", cmsVirtualNumber.getLuUser().getFullName());
//				jsonObject.addProperty("virtualNumber", cmsVirtualNumber.getVirtualNumber());
//				if(cmsUserCallerID != null) {
//					if(cmsUserCallerID.getIsActive()) {
//						jsonObject.addProperty("callerID", cmsUserCallerID.getCallerId());
//						jsonObject.addProperty("maskingEnabled", cmsUserCallerID.getIsActive());
//						jsonObject.addProperty("isVerified", true);
//					}else {
//						jsonObject.addProperty("callerID", cmsVirtualNumber.getIncomingNumber());
//						jsonObject.addProperty("maskingEnabled", cmsUserCallerID.getIsActive());
//						jsonObject.addProperty("isVerified", true);
//					}
//					
//				}else {
//					jsonObject.addProperty("callerID", cmsVirtualNumber.getIncomingNumber());
//					jsonObject.addProperty("maskingEnabled", false);
//					jsonObject.addProperty("isVerified", false);
//				}
//			}
			jsonObject.put("userName", "Ayush Kumar");
			jsonObject.put("virtualNumber", "0123456789");
			jsonObject.put("callerID", "54321");
			jsonObject.put("maskingEnabled", false);
			jsonObject.put("isVerified", true);
			
			
			jsonArray.add(jsonObject);
		
			objectForHoldData.put("results", 1);
			objectForHoldData.put("rows", jsonArray);
			setOutput(new Gson().toJson(objectForHoldData));
			Thread.sleep(1000);
			
		}catch(Exception e) {
			e.printStackTrace();
//			LOGGER.error("Error while fetching userMaskingDetails ",e);
		}
		return SUCCESS;
	}
 
	public String updateMaskingStatus() {
//		LOGGER.info("Inside updateMaskingStatus() with user: "+ getUserFromSession().getUserId());
//		JSONResult result = new JSONResult();
		Map<String,Object> objectForHoldData = new HashMap<>();
		boolean result = false;
		System.out.println("sssssssssssss"+maskingStatus);
		try {
//				result = true;
//				if(null != maskingStatus) {
//					result = manager.updateUserCallerMasking(5, 17, maskingStatus, "Ayush");
//				}else {
//					result = false;
////					LOGGER.info("Update masking status Couldn't updated for the user");
//				}
		}catch(Exception e) {
//			LOGGER.error("Error while updating userMaskingStatus ",e);
//			result = false;
		}finally {
			objectForHoldData.put("success", maskingStatus);
			System.out.println(objectForHoldData);
			setOutput(new Gson().toJson(objectForHoldData));
		}
		return SUCCESS;
	}
	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
}
