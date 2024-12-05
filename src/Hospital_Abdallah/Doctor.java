package Hospital_Abdallah;
import java.util.ArrayList;

public class Doctor extends Employee{
	
	private int doctorID;
	private String specialization;
	private String experience;
	
	private ArrayList<Patient> patients = new ArrayList<>();
	
	public Doctor() {
		
		super();
		this.doctorID=0;
		this.specialization="";
		this.experience="";
		
    }
	
	public Doctor(String name, int age, String gender, String address, String email, long phone,
			String position, String dateOfHire, double salary, String shift, String employmentStatus, int doctorID,
			String specialization, String experience) {
		
		super(name, age, gender, address, email, phone, position, dateOfHire, salary, shift, employmentStatus);
		this.doctorID = doctorID;
		this.specialization = specialization;
		this.experience = experience;
    
	}
 
	
	public int getDoctorID() {
		return doctorID;
	}
	
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String getExperience() {
		return experience;
	}
	
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public void setMedication(Patient p, String med) {
		p.getPrescription().setMedication(med); 
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	
	public void addPatient(Patient p) {
		if(!patients.contains(p))
			patients.add(p);
		
		else
			System.out.print("Patient already exists");
	}
	
	public void removePatients(Patient p) {
		if(patients.contains(p))
			patients.remove(p);
		
		else
			System.out.print("Patient doesn't exist");
	}
}

