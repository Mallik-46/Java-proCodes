package com.hospital.management.entity;

import javax.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appoint_id")
    private int id;
	@Column(name = "doctor_name")
	private String doctorName;
	private String deceaced;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_details")
    private PatientDetails patient;
	
	
	
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment( String doctorName, String dececed, PatientDetails patient) {
		super();
		 
		this.doctorName = doctorName;
		this.deceaced = dececed;
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Appointment [Appointment_id=" + id + ", doctorName=" + doctorName + ", dececed="
	+ deceaced + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDeceaced() {
		return deceaced;
	}
	public void setDeceaced(String deceaced) {
		this.deceaced = deceaced;
	}
	public PatientDetails getPatient() {
		return patient;
	}
	public void setPatient(PatientDetails patient) {
		this.patient = patient;
	}
	
	
	
}
