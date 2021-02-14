package com.highradius.manager.impl;

import java.util.List;

import com.highradius.dao.MovieDao;
import com.highradius.manager.CommonUseManager;
import com.highradius.model.*;
public class CommonUseManagerImpl implements CommonUseManager {

	private MovieDao movieDao;
	
	@Override
	public List<MapAccountFeature> getCLSTovoUIAccountConfig(Integer accountId, List<String> features)
			throws Exception {
		return movieDao.getCLSTovoUIAccountConfig(accountId, features);
	}

	public CommonUseManagerImpl(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	public CommonUseManagerImpl() { }

	public boolean writeToDB() throws Exception {
		return movieDao.writeToDBUsingHibernate();
	}

	public boolean deleteDataFromDB() throws Exception {
		return movieDao.deleteDataFromDB();
	}

	public MovieDao getMovieDao() {
		return movieDao;
	}

	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	@Override
	public CMSUserCallerID getCountry(Integer id) throws Exception {
		return movieDao.getCountry(id);
	}
	
	//Manage CallerId Masking
		/**
		 * @param fkAccountId
		 * @param userId
	     * @return User Caller Id and Virtual Number Details
	     * @throws HighRadiusException
	     */
		@Override
		public List<CmsCustomerAgentDerivedFields> getUserVirtualAndCallerIdDetails(Integer accountId, Integer userId) throws Exception {
			return movieDao.getUserVirtualAndCallerIdDetails(accountId, userId);
		}
		
		/**
		 * @param CMSUserCallerID
	     * @throws HighRadiusException
	     */
		@Override
		public void saveCMSUserCallerID(CMSUserCallerID cmsUserCallerID) throws Exception{
			movieDao.saveCMSUserCallerID(cmsUserCallerID);
		}
		
		/**
		 * @param fkAccountId
		 * @param userId
		 * @param ststus
		 * @param userName
	     * @return Update Status
	     * @throws HighRadiusException
	     */
		@Override
		public boolean updateUserCallerMasking(Integer accountId,Integer userId,boolean status,String userName) throws Exception{
			return movieDao.updateUserCallerMasking(accountId, userId, status, userName);
		}
		
		/**
		 * @param fkAccountId
		 * @param userId
	     * @return CMSUserCallerID
	     * @throws HighRadiusException
	     */
		@Override
		public CMSUserCallerID getUserCallerIdDetails(Integer accountId,Integer userId) throws Exception{
			return movieDao.getUserCallerIdDetails(accountId, userId);
		}

}
