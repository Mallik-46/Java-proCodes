package com.hospital.management.entity;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
 
public class DeleteMethod {

	public static void main(String[] args) {
		Session session = new Configuration()
				.configure()
				.addAnnotatedClass(PatientDetails.class)
				.addAnnotatedClass(Appointment.class)
				.buildSessionFactory().getCurrentSession();
		         
		session.beginTransaction();
		PatientDetails pdetials = session.get(PatientDetails.class, 1);
		
	
	 
		
		//ans.getQueation().setAnswer(null);;
		session.delete(pdetials);
		session.getTransaction().commit();
		 
		System.out.println(pdetials.getName()+" deleted successfully");
		
		

	}

}
