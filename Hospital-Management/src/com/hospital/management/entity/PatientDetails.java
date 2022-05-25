package com.hospital.management.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient_details")
public class PatientDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private int patientId;
	private String name;
	private String address;
	private int age;
	private String number;
	private String email;
	private String bloodGroup;
	@OneToOne(mappedBy = "patient" ,cascade = CascadeType.ALL)
	private Appointment appointment; 
	@Override
	public String toString() {
		return "PatientDetails [patientId=" + patientId + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", number=" + number + ", email=" + email + ", bloodGroup=" + bloodGroup  
				+ "]";
	}
	
	public PatientDetails( String name, String address, int age, String number, String email,
			String bloodGroup) {
		super();
	 
		this.name = name;
		this.address = address;
		this.age = age;
		this.number = number;
		this.email = email;
		this.bloodGroup = bloodGroup;
		 
	}
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	} 
 
	
	
}
