package com.highradius.dao;

import java.util.ArrayList;
import java.util.List;

import com.highradius.model.CMSUserCallerID;
import com.highradius.model.CMSUserVirtualNumber;
import com.highradius.model.CmsCustomerAgentDerivedFields;
import com.highradius.model.MapAccountFeature;
import com.highradius.model.Movie;

public interface MovieDao {

	public boolean writeToDBUsingHibernate() throws Exception;

	public boolean deleteDataFromDB() throws Exception;

	public ArrayList<Movie> readFromDBUsingHibernate(Movie keyMovie) throws Exception;

	public ArrayList<Movie> readFromDBUsingJDBC() throws Exception;
	
	public List<MapAccountFeature> getCLSTovoUIAccountConfig(Integer accountId, List<String> features) throws Exception;
	
	public CMSUserCallerID getCountry(Integer id) throws Exception;
	
	public List<CmsCustomerAgentDerivedFields> getUserVirtualAndCallerIdDetails(Integer accountId, Integer userId)throws Exception;
	public boolean updateUserCallerMasking(Integer accountId, Integer userId, boolean status, String userName)throws Exception;
	public void saveCMSUserCallerID(CMSUserCallerID cmsUserCallerID) throws Exception;
	public CMSUserCallerID getUserCallerIdDetails(Integer accountId,Integer userId) throws Exception;
}
