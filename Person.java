
package Hospital_Abdallah;

public class Person {
    protected String name;
    protected int age;	//change to byte
    protected String gender;
    protected String address;
    protected String email;
    protected long phone;  // Changed to long
    
    public Person() {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.address = "";
        this.email = "";
        this.phone = 0;
    }
    
    public Person(String name, int age, String gender, String address, String email, long phone) {  // Changed to long
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public long getPhone() {  // Changed to long
        return phone;
    }
    
    public void setPhone(long phone) {  // Changed to long
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", email=" + email
                + ", phone=" + phone + "]";
    }
}


