package com.highradius.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
    @SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
        try {
            Configuration cfg = new Configuration();
            return cfg.configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
        getSessionFactory().close();
    }
    
}
