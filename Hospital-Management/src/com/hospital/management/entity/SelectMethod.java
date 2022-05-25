package com.hospital.management.entity;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

 
public class SelectMethod {

	public static void main(String[] args) {
		 
		 
        Session session=new Configuration()
        		.configure()
        		.addAnnotatedClass(PatientDetails.class)
        		.addAnnotatedClass(Appointment.class)
        		.buildSessionFactory()
        		.getCurrentSession();
       session.beginTransaction();
       PatientDetails patient= session.get(PatientDetails.class, 1);
   System.out.println("\n\n\n\n--- ---patient deatils--- --\n\n\n\n");
       System.out.println(patient);
       System.out.println("\n\n"+patient.getAppointment());
       
	}

}
