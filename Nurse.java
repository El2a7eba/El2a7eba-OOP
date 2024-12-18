package Hospital_Abdallah;

import java.util.ArrayList;

public class Nurse extends Employee {
	private String Specialization;
	private String clinicalSkills;
	private String medicalProcedures;
	private String careExperience;
	private String certificate;
	private String patientLoad; // int ?
	private String medLicenseNumber;
	// add nurse id here ?
	
	private ArrayList<Patient> patients = new ArrayList<>();
	
	public Nurse() {
		super();
		this.Specialization = "";
		this.clinicalSkills ="";
		this.medicalProcedures = "";
		this.careExperience = "";
		this.certificate = "";
		this.patientLoad = "";
		this.medLicenseNumber = "";
	}
	
	public Nurse(String name, int age, String gender, String address, String email, long phone,
			String position, String dateOfHire, double salary, String shift, String employmentStatus, 
			String specialization, String clinicalSkills, String medicalProcedures, String careExperience,
	        String certificate, String patientLoad, String medLicenseNumber) {
		
	    super(name, age, gender, address, email, phone, position, dateOfHire, salary, shift, employmentStatus);
	    
	    Specialization = specialization;
	    this.clinicalSkills = clinicalSkills;
	    this.medicalProcedures = medicalProcedures;
	    this.careExperience = careExperience;
	    this.certificate = certificate;
	    this.patientLoad = patientLoad;
	    this.medLicenseNumber = medLicenseNumber;
	}
	
	public String getSpecialization() {
	    return Specialization;
	}
	
	public void setSpecialization(String specialization) {
	    Specialization = specialization;
	}
	
	public String getClinicalSkills() {
	    return clinicalSkills;
	}
	
	public void setClinicalSkills(String clinicalSkills) {
	    this.clinicalSkills = clinicalSkills;
	}
	
	public String getMedicalProcedures() {
	    return medicalProcedures;
	}
	
	public void setMedicalProcedures(String medicalProcedures) {
	    this.medicalProcedures = medicalProcedures;
	}
	
	public String getCareExperience() {
	    return careExperience;
	}

	public void setCareExperience(String careExperience) {
	    this.careExperience = careExperience;
	}
	
	public String getCertificate() {
	    return certificate;
	}
	
	public void setCertificate(String certificate) {
	    this.certificate = certificate;
	}
	
	public String getPatientLoad() {
	    return patientLoad;
	}
	
	public void setPatientLoad(String patientLoad) {
	    this.patientLoad = patientLoad;
	}
	
	public String getMedLicenseNumber() {
	    return medLicenseNumber;
	}
	
	public void setMedLicenseNumber(String medLicenseNumber) {
	    this.medLicenseNumber = medLicenseNumber;
	}
	
	public void administerMedication(Patient patient, Prescription prescription) {
	    System.out.println("Administering medication to patient: " + patient.getName());
	    System.out.println("Medication: " + prescription.getMedication());
	    System.out.println("Dosage: " + prescription.getDosage());
	    System.out.println("Instructions: " + prescription.getInstructions());
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

	@Override
	public String toString() {
		return "Nurse [Specialization=" + Specialization + ", clinicalSkills=" + clinicalSkills + ", medicalProcedures="
				+ medicalProcedures + ", careExperience=" + careExperience + ", certificate=" + certificate
				+ ", patientLoad=" + patientLoad + ", medLicenseNumber=" + medLicenseNumber + ", patients=" + patients
				+ ", position=" + position + ", dateOfHire=" + dateOfHire + ", salary=" + salary + ", shift=" + shift
				+ ", employmentStatus=" + employmentStatus + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}
