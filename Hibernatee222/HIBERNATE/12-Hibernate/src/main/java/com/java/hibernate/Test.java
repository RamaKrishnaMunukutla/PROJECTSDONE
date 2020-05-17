package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	public static void main(String[] args) {
		Transaction tx = null;
		// try with resource
		try (Session ses = HibernateUtil.getSf().openSession()) {
			// ses.flush();
			tx = ses.beginTransaction();

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
		 
			
			
			
			
			
			
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			tx.commit();
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
