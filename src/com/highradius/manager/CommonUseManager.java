package com.highradius.manager;
import com.highradius.model.*;
import java.util.List;

public interface CommonUseManager {

	public boolean writeToDB() throws Exception;

	public boolean deleteDataFromDB() throws Exception;
	
	public List<MapAccountFeature> getCLSTovoUIAccountConfig(Integer accountId, List<String> features) throws Exception;
	
	public CMSUserCallerID getCountry(Integer id) throws Exception;
	
	//Manage CallerId Masking
		/**
		 * @param fkAccountId
		 * @param userId
	     * @return User Caller Id and Virtual Number Details
	     * @throws Exception
	     */
		public List<CmsCustomerAgentDerivedFields> getUserVirtualAndCallerIdDetails(Integer accountId,Integer userId) throws Exception;
		
		/**
		 * @param fkAccountId
		 * @param userId
	     * @return Update Status
	     * @throws Exception
	     */
		public boolean updateUserCallerMasking(Integer accountId,Integer userId,boolean status,String userName) throws Exception;
		
		/**
		 * @param  CMSUserCallerID
	     * @throws Exception
	     */
		public void saveCMSUserCallerID(CMSUserCallerID cmsUserCallerID) throws Exception;
		
		/**
		 * @param fkAccountId
		 * @param userId
	     * @return CMSUserCallerID
	     * @throws Exception
	     */
		public CMSUserCallerID getUserCallerIdDetails(Integer accountId,Integer userId) throws Exception;
}
