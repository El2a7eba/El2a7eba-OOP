package Hospital_Abdallah;
import java.util.ArrayList;

public class Department {

        private String name;
        private String departmentId;
        private String depLocation;
        private Doctor headofDep;

        private ArrayList<Doctor> Doctors; // test
        private ArrayList<Nurse> Nurses;

        public Department(String name, String departmentId, Doctor headofDep, ArrayList<String> employees) {

            this.name = name;
            this.departmentId = departmentId;
            this.headofDep = headofDep;
            this.Doctors = new ArrayList<>();
            this.Nurses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
        }

        public String getDepLocation() {
            return depLocation;
        }

        public void setDepLocation(String depLocation) {
            this.depLocation = depLocation;
        }

        public Doctor getHeadofDep() {
            return headofDep;
        }

        public void setHeadofDep(Doctor headofDep) {
            this.headofDep = headofDep;
        }
        public ArrayList<Doctor> getDoctors() {        //here write the Employee class instead of string.
            return Doctors; //to string or sys out ??
        }

        public void addDoctors(Doctor d) {    // object as parameter    //here write the Employee class instead of string.
            if (!Doctors.contains(d)) {   // cant understand condition ?
                Doctors.add(d);
            }

            else {
                System.out.print("Employee already exists"); //purpose ?
            }
        }

        public void removeDoctors(Doctor d) { //object as parameter        //here write the Employee class instead of string.
            if (Doctors.contains(d)) {
                Doctors.remove(d);
            }

            else {
                System.out.print("Employee doesnt exist exists");
            }
        }

		public ArrayList<Nurse> getNurses() {
			return Nurses;
		}

		public void setNurses(ArrayList<Nurse> nurses) {
			Nurses = nurses;
		}
		
		public void addDoctors(Nurse n) {
            if (!Nurses.contains(n)) {
                Nurses.add(n);
            }

            else {
                System.out.print("Nurse already exists");
            }
        }

        public void removeDoctors(Nurse n) {
            if (Nurses.contains(n)) {
                Nurses.remove(n);
            }

            else {
                System.out.print("Nurse doesn't exist");
            }
        }
        
        
}
