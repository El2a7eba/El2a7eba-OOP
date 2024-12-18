package Hospital_Abdallah;

public class Prescription {
    
    private String medication;
    private String dosage;
    private String instructions;
    
    private Patient p;
    
    public Prescription() {
        
        this.medication="";
        this.dosage="";
        this.instructions="";
        
    }
    
    public Prescription(String medication, String dosage, String instructions, Patient p) {
        
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
        this.p = p;
    }
    
    public String getMedication() {
        return medication;
    }
    
    public void setMedication(String medication) {
        this.medication = medication;
    }
    
    public String getDosage() {
        return dosage;
    }
    
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    public String getInstructions() {
        return instructions;
    }
    
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    

}
