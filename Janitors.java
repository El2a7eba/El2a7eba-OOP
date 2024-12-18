package Hospital_Abdallah;

public class Janitors extends Employee{
	
	private String assignedArea;
	private String cleaningEquipmentProficiency;
	private String Type;
	public Janitors() {
		super();
	    this.Type="";
	    this.assignedArea = "";
	    this.cleaningEquipmentProficiency = "";
	}


	public Janitors(String assignedArea, String cleaningEquipmentProficiency, String Type) {
	    super();
	    this.Type = Type;
	    this.assignedArea = assignedArea;
	    this.cleaningEquipmentProficiency = cleaningEquipmentProficiency;
	}

	public String getAssignedArea() {
	    return assignedArea;
	}

	public void setAssignedArea(String assignedArea) {
	        this.assignedArea = assignedArea;
	    }

	    public String getCleaningEquipmentProficiency() {
	        return cleaningEquipmentProficiency;
	    }

	    public void setCleaningEquipmentProficiency(String cleaningEquipmentProficiency) {
	        this.cleaningEquipmentProficiency = cleaningEquipmentProficiency;
	    }

	    public String getType() {
	        return Type;
	    }


	    public void setType(String type) {
	        Type = type;
	    }


	    @Override
	    public String toString() {
	        return "Janitor [shift=" + shift + ", assignedArea=" + assignedArea + ", cleaningEquipmentProficiency=" + cleaningEquipmentProficiency + "]";
	    }
}

