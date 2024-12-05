package Hospital_Abdallah;
import java.util.Date;

public class MedicalReport {
	
	private Date date = new Date();
	private Patient p;
	private Doctor d;
	private Department dept;
	private Guardian g;
	
	private String contactNumber;
	private String medicalRecordNumber;
	private String patientRelationship;
	private String address;
	private String guardianContact;
	
	private boolean medication;
	private String medicationDescription;  // available in prescription class
	private boolean allergy;
	private String allergyType;
	private String problem;
	private String cause;
	private String diagnosis;
	
	
	public MedicalReport(Date date, Patient p, Doctor d, Department dept, Guardian g, String contactNumber,
			String medicalRecordNumber, String patientRelationship, String address, String guardianContact,
			boolean medication, String medicationDescription, boolean allergy, String allergyType, String problem,
			String cause, String diagnosis) {

		this.date = date;
		this.p = p;
		this.d = d;
		this.dept = dept;
		this.g = g;
		this.contactNumber = contactNumber;
		this.medicalRecordNumber = medicalRecordNumber;
		this.patientRelationship = patientRelationship;
		this.address = address;
		this.guardianContact = guardianContact;
		this.medication = medication;
		this.medicationDescription = medicationDescription;
		this.allergy = allergy;
		this.allergyType = allergyType;
		this.problem = problem;
		this.cause = cause;
		this.diagnosis = diagnosis;
	}

	public void displayReport() { 
		System.out.println("Medical Report"); 
		System.out.println("Patient Name: " + p.getName()); 
		System.out.println("Patient Age: " + p.getAge()); 
		System.out.println("Patient Contact Number: " + contactNumber);
		System.out.println("Patient address: " + address);
		System.out.println("Guardian Contact: " + guardianContact);
		
		System.out.println();
		
		if(allergy == true)
			System.out.println("Allergy Status: " + allergyType);
		else
			System.out.println("Allergy Status: No allergy");
		 
		System.out.println("Problem: " + problem);
		System.out.println("Cause of problem: " + problem);
		System.out.println("Diagnosis: " + diagnosis);
		
		System.out.println();
		
		if(medication == true)
			System.out.println("Treatment: " + medication);
		else
			System.out.println("Treatment: No required treatment");
		System.out.println("Doctor Name: " + d.getName()); 
		System.out.println("Department: " + dept.getName()); 
		System.out.println("Report Date: " + date);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Patient getP() {
		return p;
	}

	public void setP(Patient p) {
		this.p = p;
	}

	public Doctor getD() {
		return d;
	}

	public void setD(Doctor d) {
		this.d = d;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Guardian getG() {
		return g;
	}

	public void setG(Guardian g) {
		this.g = g;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMedicalRecordNumber() {
		return medicalRecordNumber;
	}

	public void setMedicalRecordNumber(String medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}

	public String getPatientRelationship() {
		return patientRelationship;
	}

	public void setPatientRelationship(String patientRelationship) {
		this.patientRelationship = patientRelationship;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGuardianContact() {
		return guardianContact;
	}

	public void setGuardianContact(String guardianContact) {
		this.guardianContact = guardianContact;
	}

	public String getMedicationDescription() {
		return medicationDescription;
	}

	public void setMedicationDescription(String medicationDescription) {
		this.medicationDescription = medicationDescription;
	}

	public String getAllergyType() {
		return allergyType;
	}

	public void setAllergyType(String allergyType) {
		this.allergyType = allergyType;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	
	
}
