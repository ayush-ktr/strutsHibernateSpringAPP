package com.highradius.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.highradius.dao.UserDao;
import com.highradius.helper.HibernateUtils;
import com.highradius.model.LuUser;
import com.highradius.model.Movie;

public class UserDaoImpl implements UserDao {

	private static final String INVALID_PARAMS = "invalid params";

	private static final String SUCCESS = "success";

	private static final String FAILURE = "failure";

	@Override
	public String userLogin(LuUser user) throws Exception {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(LuUser.class);
		if (user.getUserName() != null && !user.getUserName().isEmpty() && user.getPassword() != null
				&& !user.getPassword().isEmpty()) {
			criteria.add(Restrictions.like("userName", user.getUserName()));
			criteria.add(Restrictions.like("password", user.getPassword()));
		} else {
			return INVALID_PARAMS;
		}
		criteria.setMaxResults(1);
		List<Movie> returnList = criteria.list();
		session.close();
		if (returnList.size() == 1)
			return SUCCESS;
		else
			return FAILURE;
	}

	@Override
	public String createUser(LuUser user) throws Exception {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(user);
			tx.commit();
			return SUCCESS;
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

	@Override
	public LuUser isUserLoggedIn() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkUserNameAvailability(String username) throws Exception {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(LuUser.class);
		if (username != null && !username.isEmpty()) {
			criteria.add(Restrictions.like("userName", username));
		} else {
			return false;
		}
		List<Movie> returnList = criteria.list();
		session.close();
		if (returnList.size() != 0)
			return false;
		else
			return true;
	}

}
