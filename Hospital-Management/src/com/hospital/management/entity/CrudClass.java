package com.hospital.management.entity;
 import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CrudClass {

	public static Session connection() {
		Session session = new Configuration().configure().addAnnotatedClass(PatientDetails.class)
				.addAnnotatedClass(Appointment.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session;
	}

	static Scanner input = new Scanner(System.in);

	static int id;

	public static void insert() {

		PatientDetails patient = new PatientDetails();

		System.out.print("Enter your name: ");
		patient.setName(input.next());
		System.out.print("Enter your age: ");
		patient.setAge(input.nextInt());
		System.out.print("Enter your Address: ");
		patient.setAddress(input.next());
		System.out.print("Enter your Number: ");
		patient.setNumber(input.next());
		System.out.print("Enter your email: ");
		patient.setEmail(input.next());
		System.out.print("Enter your bloodGroup: ");
		patient.setBloodGroup(input.next());
		Appointment appoint = new Appointment();
		System.out.println("\n\n\n1->>>dr.manohar  ,fees->300rs");
		System.out.println("2->>>dr.arun    ,fees->500rs\"");
		System.out.println("3->>>dr.sakshi    ,fees->600rs");

		int choose = input.nextInt();
		String column = "";
		switch (choose) {
		case 1:
			column = "dr.manohar ";
			break;
		case 2:
			column = "dr.arun";
			break;
		case 3:
			column = "dr.sakshi";
			break;

		}

		appoint.setDoctorName(column);
		appoint.setPatient(patient);
		System.out.print("Enter your deceaced: ");
		appoint.setDeceaced(input.next());
		Session session = connection();
		session.save(patient);
		session.save(appoint);
		session.getTransaction().commit();
		session.close();
		input.close();
		System.out.println(patient.getName() + " is successfully added\n\nyour id is -> " + patient.getPatientId());
	}

	public static void delete() {

		System.out.println("enter patient id");
		id = input.nextInt();
		Session session = connection();
		PatientDetails pdetials = session.get(PatientDetails.class, id);
		session.delete(pdetials);
		session.getTransaction().commit();
		System.out.println(pdetials.getName() + " deleted successfully");

	}

	public static void select() {
		System.out.println("enter patient id");
		id = input.nextInt();
		Session session = connection();
		PatientDetails patient = session.get(PatientDetails.class, id);
		System.out.println("\n\n\n\n--- ---patient deatils--- --\n\n\n\n");
		System.out.println(patient);
		System.out.println("\n\n" + patient.getAppointment());

	}

	public static void update() {
		System.out.println("enter patient id");
		id = input.nextInt();
		Session session = connection();
		PatientDetails patient = session.get(PatientDetails.class, id);
		System.out.println("enter deceaced");
		patient.getAppointment().setDeceaced(input.next());
		session.getTransaction().commit();
		session.close();
		System.out.println("updating....");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean temp = true;

		while (temp) {
			System.out.println("\n\n\n1->>> create");
			System.out.println("2->>> update");
			System.out.println("3->>> delete");
			System.out.println("4->>> select");
			System.out.println("5->>> for exit");
			int choose = input.nextInt();

			if (choose == 5) {
				temp = false;
				break;
			}

			if (choose == 1) {
				insert();

			}
			if (choose == 2) {
				update();

			}
			if (choose == 4) {
				select();
			}
			if (choose == 3) {
				delete();
			}

		}

	}
}