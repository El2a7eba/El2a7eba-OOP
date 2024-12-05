package Hospital_Abdallah;

public class Patient extends Person {
	
    private long National_ID;
    private String MedicalHistory;
    private String EmergencyPhone;
    private boolean PrimaryCare;
    
    private String Guardian;
    private boolean chronic;
    private int patientID;
    private String allergies;
    
    private Doctor d;
    private Nurse n;
    
    private boolean needPrescription = false;
    private Prescription p;

    public Patient() {
        super();
        this.patientID = 0;
        this.MedicalHistory = "";
        this.allergies = "";
        this.EmergencyPhone = "0";
    }

    // Parameterized constructor
    public Patient(String name, int age, String gender, String address, String email,
    		long phone, long national_ID, String medicalHistory, String emergencyPhone,
                   boolean primaryCare, String guardian, int patientID, String allergies, boolean needPrescription, Prescription p, Doctor d, Nurse n) {
    	
        super(name, age, gender, address, email, phone);
        
        this.National_ID = national_ID;
        this.MedicalHistory = medicalHistory;
        this.EmergencyPhone = emergencyPhone;
        this.PrimaryCare = primaryCare;
        this.Guardian = guardian;
        this.patientID = patientID;
        this.allergies = allergies;
        this.d = d;
        this.n = n;
        
        if(needPrescription)
        	this.p = p;
        
    }   
    
    public Doctor getD() {
		return d;
	}

	public void setD(Doctor d) {
		this.d = d;
	}

	public Nurse getN() {
		return n;
	}

	public void setN(Nurse n) {
		this.n = n;
	}

	public void setNational_ID(long national_ID) {
		National_ID = national_ID;
	}

	public long getNational_ID() {
        return National_ID;
    }

    public void setNational_ID(int national_ID) {
        National_ID = national_ID;
    }

    public String getMedicalHistory() {
        return MedicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        MedicalHistory = medicalHistory;
    }

    public String getEmergencyPhone() {
        return EmergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        EmergencyPhone = emergencyPhone;
    }

    public boolean isPrimaryCare() {
        return PrimaryCare;
    }

    public void setPrimaryCare(boolean primaryCare) {
        PrimaryCare = primaryCare;
    }

    public String getGuardian() {
        return Guardian;
    }

    public void setGuardian(String guardian) {
        Guardian = guardian;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
    public void makePrescription() {
    	p = new Prescription();
    }

    public Prescription getPrescription() {
        return p;
    }
    
    
    
}
