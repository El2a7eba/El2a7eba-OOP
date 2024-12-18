package Hospital_Abdallah;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee doctor1 = new Doctor("ahmed", 69,"male", "cairo", "bduhgiwy@.com", 01263764764, 
				"surgeon", "01/04/2011", 30000, "6hours", "fulltime", 1, "heart", "12 years");
		Employee doctor2 = new Doctor("ahmed", 69,"male", "cairo", "bduhgiwy@.com", 01263764764, 
				"surgeon", "01/04/2011", 30000, "6hours", "fulltime", 2, "heart", "12 years");
		//String name, int age, String gender, String address, String email, long phone,
		//String position, String dateOfHire, double salary, String shift, String employmentStatus, 
		//String specialization, String clinicalSkills, String medicalProcedures, String careExperience,
        //String certificate, String patientLoad, String medLicenseNumber
		
		Employee nurse1 = new Nurse("hala", 68,"female", "giza", "djhgufhtf@fesf.com", 01757635, 
				"head", "01/2/1037", 40000, "7hours", "part time", "care", "insertion", "dosage", "12 years",
				"graduation", "60", "1e");
		Employee nurse2 = new Nurse("mona", 68,"female", "giza", "djhgufhtf@fesf.com", 01757635, 
				"head", "01/2/1037", 40000, "7hours", "part time", "care", "insertion", "dosage", "12 years",
				"graduation", "60", "1e");
		//String name, int age, String gender, String address, String email,
		//long phone, long national_ID, String medicalHistory, String emergencyPhone,
        //boolean primaryCare, int patientID, String allergies, 
        //boolean needPrescription, Doctor d, Nurse n
		Person patient1 = new Patient("yazan",70,"male","cairo","s",234234,2342342,"none","27657654",
				1,1,"peanut",doctor1,nurse1);
		
		
		doctor1.addEmployees(doctor1);
		doctor2.addEmployees(doctor2);
		
		nurse1.addEmployees(nurse1);
		nurse2.addEmployees(nurse2);
		
		

	}

}
