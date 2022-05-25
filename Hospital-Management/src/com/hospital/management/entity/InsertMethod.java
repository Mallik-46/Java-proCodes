package com.hospital.management.entity;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class InsertMethod {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass( Appointment.class)
				.addAnnotatedClass(PatientDetails.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		session.beginTransaction();
		PatientDetails pd=new PatientDetails("guru","mysore",22,"8123456","guru@gmail.com","b+");
		
		Appointment app=new Appointment("dr.manohar","fever",pd);
	 
		session.save(app);
		session.save( pd);
		 
		

		session.getTransaction().commit();

		session.close();
		 
		
		System.out.println(pd.getName()+" added successfully");
	}

}
