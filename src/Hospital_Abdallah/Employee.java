package Hospital_Abdallah;
import java.util.ArrayList;

public class Employee extends Person {
	
    protected String position;
    protected String dateOfHire;
    protected double salary;
    protected String shift;
    protected String employmentStatus;
    
    private ArrayList<Employee> employees = new ArrayList<>();
    
    public Employee() {
        this.position = "employee";
        this.dateOfHire = "";
        this.salary = 0.0;
        this.shift = "";
        this.employmentStatus = "";
    }
    
    public Employee(String name, int age, String gender, String address, String email, long phone, String position, String dateOfHire, double salary, String shift, String employmentStatus) {
        super(name, age, gender, address, email, phone);
        this.position = position;
        this.dateOfHire = dateOfHire;
        this.salary = salary;
        this.shift = shift;
        this.employmentStatus = employmentStatus;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getDateOfHire() {
        return dateOfHire;
    }
    
    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;    
    }
    
    public String getShift() {
        return shift;
    }
    
    public void setShift(String shift) {
        this.shift = shift;
    }
    
    public String getEmploymentStatus() {
        return employmentStatus;
    }
    
    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
    
    public void addEmployees(Employee e) {
    	if(!employees.contains(e))
    		employees.add(e);
    		
    	else
    		System.out.print("Patient already exists");
    }
    
    public void removeEmployees(Employee e) {
    	if(employees.contains(e))
    		employees.remove(e);
    		
    	else
    		System.out.print("Patient doesn't exist");
    }
}
