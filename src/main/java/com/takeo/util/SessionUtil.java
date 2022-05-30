package com.takeo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	
	public static Session getSession() {
		
		Configuration cfg = new Configuration();
    	
    	cfg.configure("com/takeo/config/hibernate.cfg.xml");
    	
    	//Step 2 : Build Session Factory
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	
    	return factory.openSession();
	}
	
	public static void closeSession(Session ses) {
		if(ses != null)
		{
			ses.close();
		}
	}

}
