package com.hospital.management.entity;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class UpdateMethod {

	public static void main(String[] args) {

		 Session session=new Configuration()
	        		.configure()
	        		.addAnnotatedClass(PatientDetails.class)
	        		.addAnnotatedClass(Appointment.class)
	        		.buildSessionFactory()
	        		.getCurrentSession();
	       session.beginTransaction();
	       PatientDetails patient= session.get(PatientDetails.class, 1);
		 
       patient.getAppointment().setDeceaced("headache");

		session.getTransaction().commit();

		session.close();
		 
	}

}
