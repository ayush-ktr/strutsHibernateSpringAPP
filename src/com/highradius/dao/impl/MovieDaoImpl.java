package com.highradius.dao.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.highradius.dao.MovieDao;
import com.highradius.helper.FileHandlingHelper;
import com.highradius.helper.HibernateUtils;
import com.highradius.model.CMSUserCallerID;
import com.highradius.model.CMSUserVirtualNumber;
import com.highradius.model.CmsCustomerAgentDerivedFields;
import com.highradius.model.MapAccountFeature;
import com.highradius.model.Movie;

public class MovieDaoImpl implements MovieDao {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/smirnoff";

	private static final String USER = "root";
	private static final String PASS = "root";
	
	public List<MapAccountFeature> getCLSTovoUIAccountConfig(Integer accountId, List<String> features)
			throws Exception {
		List<MapAccountFeature> mapAccountFeatures = new ArrayList<MapAccountFeature>();
		Session session = HibernateUtils.getSessionFactory().openSession();
//		Using fkDataTypeId for filtering corresponding to specific product
		String hqlQuery = 
				"FROM MapAccountFeature maf where maf.fkAccountId IN (:accountId, -1) and "
				+ "maf.luFeature.featureName IN (:features) and maf.luFeature.fkDataTypeId = :dataTypeId";
		try {
			Query query = session.createQuery(hqlQuery);
			query.setParameter("accountId", accountId);
			query.setParameterList("features", features);
			query.setParameter("dataTypeId", 62);
			mapAccountFeatures = (List<MapAccountFeature>)query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return mapAccountFeatures;
	}

	public boolean writeToDBUsingHibernate() throws Exception {

		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			ArrayList<Movie> movies = FileHandlingHelper.readFromAFile();
			for (Movie movie : movies) {
				session.save(movie);
			}
			tx.commit();
			return true;
		} catch (Exception e) {
			try {
				tx.rollback();
				throw e;
			} catch (Exception re) {
				re.printStackTrace();
				throw re;
			}
		} finally {
			try {
				session.close();
			} catch (Exception re) {
				re.printStackTrace();
				throw re;
			}
		}
	}

	public boolean deleteDataFromDB() throws Exception {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String deleteDataFromMovie = "delete from movies";
		String deleteDataFromRatings = "delete from ratings";
		try {
			Query query = session.createSQLQuery(deleteDataFromRatings);
			query.executeUpdate();
			query = session.createSQLQuery(deleteDataFromMovie);
			query.executeUpdate();
			session.close();
			return true;
		} catch (Exception e) {
			try {
				tx.rollback();
				session.close();
				throw e;
			} catch (Exception re) {
				re.printStackTrace();
				throw re;
			} finally {
				try {
					session.close();
				} catch (Exception re) {
					re.printStackTrace();
					throw re;
				}
			}
		}
	}
	
	public static int safeInt(Object object) {
        if (object == null) {
            return 0;
        }

        if (object instanceof BigInteger) {
            return ((BigInteger) object).intValue();
        } else if (object instanceof BigDecimal) {
            return ((BigDecimal) object).intValue();
        } else if (object instanceof Integer) {
            return (Integer) object;
        } else if (object instanceof Long) {
            return ((Long) object).intValue();
        }else {
            throw new IllegalArgumentException("Cannot convert to integer");
        }
    }
	
	public ArrayList<Movie> readFromDBUsingHibernate(Movie keyMovie) throws Exception {
		Session session = HibernateUtils.getSessionFactory().openSession(); 
//		Criteria criteria = session.createCriteria(Movie.class);
		
		String query = "SELECT tracking_information_id,acct_doc_header_id FROM invoice_tracking_xref WHERE acct_doc_header_id = 15387936";
		
		Query queryObj = session.createSQLQuery(query);
		
		List<Object> list = queryObj.list();
		System.out.println(list.size());
		List<Integer> trackingIdList = new ArrayList<>();
		for(Object obj : list) {
			System.out.println(obj);
			trackingIdList.add(safeInt(obj));
		}
		int x= 12;
		return null;
		/*
		 * Session session = HibernateUtils.getSessionFactory().openSession(); Criteria
		 * criteria = session.createCriteria(Movie.class); if (keyMovie.getTitle() !=
		 * null && !keyMovie.getTitle().isEmpty())
		 * criteria.add(Restrictions.like("title", "%" + keyMovie.getTitle() + "%")); if
		 * (keyMovie.getReleaseYear() != 0) criteria.add(Restrictions.eq("releaseYear",
		 * keyMovie.getReleaseYear())); if (keyMovie.getCategory() != null &&
		 * !keyMovie.getCategory().isEmpty()) criteria.add(Restrictions.like("category",
		 * "%" + keyMovie.getCategory() + "%")); if (keyMovie.getLanguage() != null &&
		 * !keyMovie.getLanguage().isEmpty()) criteria.add(Restrictions.like("language",
		 * "%" + keyMovie.getLanguage() + "%"));
		 * 
		 * @SuppressWarnings("unchecked") List<Movie> returnList = criteria.list();
		 * session.close(); if (returnList.size() != 0) return (ArrayList<Movie>)
		 * returnList; else return new ArrayList<Movie>();
		 */
	}

	public ArrayList<Movie> readFromDBUsingJDBC() throws Exception {
		Connection conn = null;
		Statement stmt = null;
		try {

			Class.forName(JDBC_DRIVER);

			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();
			String sql;
			sql = "SELECT * from movies";
			ResultSet rs = stmt.executeQuery(sql);

			System.out.print("result set created: " + rs.toString());

			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {

			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public CMSUserCallerID getCountry(Integer accountId) throws Exception {
//		List<Object> country = null;
//		Session session = HibernateUtils.getSessionFactory().openSession();
//		String HQLquery = "FROM CMSUserVirtualNumber";
//		try {
//			Query query = session.createQuery(HQLquery);
//			country = query.list();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return country;
		CMSUserCallerID cmsUserVirtualNumber=null;
		try{
			Session session = HibernateUtils.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			String selectQuery="FROM CMSUserCallerID WHERE fkAccountId = "+accountId;
			Query query = session.createQuery(selectQuery);
			cmsUserVirtualNumber = (CMSUserCallerID) query.list().get(0);
//			tx.commit();
//			cmsUserVirtualNumber = (CMSUserCallerID) query.uniqueResult();
//			if (cmsUserVirtualNumber == null) {
//				//As entry with this userId does not exist we are getting the entry where userId = -1
//				selectQuery="FROM CMSUserCallerID WHERE fk_user_id = -1";
//				query = session.createQuery(selectQuery.toString());
//				cmsUserVirtualNumber = (CMSUserCallerID) query.uniqueResult();	
//			}
		}catch (Exception ex){
			ex.printStackTrace();
			}				
		return cmsUserVirtualNumber;
	}
	
	/**
	 * @param fkAccountId
	 * @param userId
     * @return User Caller Id and Virtual Number Details
     * @throws HighRadiusException
     */
	@Override
	public List<CmsCustomerAgentDerivedFields> getUserVirtualAndCallerIdDetails(Integer accountId, Integer userId)
			throws Exception {
//		LOG.info("Entered getUserVirtualAndCallerIdDetails() method with params: "+accountId+" "+userId);
		List<CmsCustomerAgentDerivedFields> userVirtualAndCallerIdDetail = null;
		String hqlQuery = "SELECT cdh.docHeaderId, cdh.actualOpenAmount, cdh.currentOpenAmount,cdh.documentNumber, "
				+ "cdh.salesInvoiceNumber, cdh.openAmount, cdh.currency, cdh.customerCurrency,cdh.customerActualOpenAmount, "
				+ "(CASE WHEN high_value IS NOT NULL THEN CONCAT(low_value, '-', high_value) WHEN (high_value IS NULL "
				+ "AND low_value IS NOT NULL) THEN CONCAT('>', low_value) ELSE 'Current Due' END) AS bucket_name "
				+ "FROM CMSDocHeader cdh LEFT JOIN CMSStrategyBucket csb ON cdh.strategyAgingBucketId = csb.agingBucketId AND "
				+ "cdh.fkAccountId = csb.accountId WHERE cdh.isOpen=1 AND cdh.fkAccountId=21505 AND cdh.pkCustomerMapId = 105803802 "
				+ "AND cdh.documentNumber LIKE '%5%'";
		System.out.println(hqlQuery);
		try {
			Session session = HibernateUtils.getSessionFactory().openSession();
			Query query = session.createQuery(hqlQuery);
			List<Object[]> result = query.list();
			userVirtualAndCallerIdDetail = (List<CmsCustomerAgentDerivedFields>) query.list();
		}catch(Exception e) {
			e.printStackTrace();
//			LOG.error("Exception occurred while fetching callerId details in getUserVirtualAndCallerIdDetails() ",e);
		}
		return userVirtualAndCallerIdDetail;
	}
	
	/**
	 * @param fkAccountId
	 * @param userId
	 * @param maskingStatus
	 * @param userName
     * @return Masking update Status
     * @throws HighRadiusException
     */
	@Override
	public boolean updateUserCallerMasking(Integer accountId, Integer userId,boolean maskingStatus, String userName) throws Exception {
//		LOG.info("Entered updateUserCallerMasking() method with params: "+accountId+" "+userId);
		boolean updateStatus = false;
		String updateQuery = "UPDATE CMSUserCallerID SET isActive =:maskingStatus, updateUser =:updateUser, updateTime = sysdate() WHERE fkAccountId =:accountId AND luUser.pkUserId =:userId";
//		LOG.info("Final Query: "+updateQuery.toString());
		try {
			Session session = HibernateUtils.getSessionFactory().openSession();
			Query query = session.createQuery(updateQuery);
			query.setInteger("accountId", accountId);
			query.setInteger("userId", userId);
			query.setBoolean("maskingStatus", maskingStatus);
			query.setString("updateUser", userName);
			if(query.executeUpdate() > 0)
				updateStatus = true;
		}catch(Exception e) {
			e.printStackTrace();
//			LOG.error("Exception occurred while updating masking status in updateUserCallerMasking() ",e);
		}
		
		return updateStatus;
	}
	
	/**
	 * @param fkAccountId
	 * @param userId
	 * @param maskingStatus
     * @return Masking update Status
     * @throws HighRadiusException
     */
	@Override
	public void saveCMSUserCallerID(CMSUserCallerID cmsUserCallerID) throws Exception {
//		LOG.info("Entered saveCMSUserCallerID() for saving callerId Details");
		try {
//			realSaveOrUpdate(cmsUserCallerID);
		}catch(Exception e) {
//			LOG.error("Exception occurred while caller Id details in saveCMSUserCallerID() ",e);
			throw new Exception("Unable to save or update CMSUserCallerID due to"+e.getMessage(), e);
		}
	}
	
	/**
	 * @param fkAccountId
	 * @param userId
     * @return CMSUserCallerID
     * @throws HighRadiusException
     */
	@Override
	public CMSUserCallerID getUserCallerIdDetails(Integer accountId, Integer userId)
			throws Exception {
//		LOG.info("Entered getUserCallerIdDetails() method with params: "+accountId+" "+userId);
		List<CMSUserCallerID> cmsUserCallerId = null;
		CMSUserCallerID callerDetails = null;
		String hqlQuery = "FROM CMSUserCallerID WHERE fkAccountId =:accountId AND luUser.pkUserId =:userId";
//		LOG.info("Final Query: "+hqlQuery.toString());
		try {
			Session session = HibernateUtils.getSessionFactory().openSession();
			Query query = session.createQuery(hqlQuery);
			query.setInteger("accountId", accountId);
			query.setInteger("userId", userId);
			cmsUserCallerId = query.list();
			if(cmsUserCallerId.size()>0) {
				callerDetails = cmsUserCallerId.get(0);
			}
		}catch(Exception e) {
			e.printStackTrace();
//			LOG.error("Exception occurred while fetching callerId details in getUserCallerIdDetails() ",e);
		}
		return callerDetails;
	}

}
