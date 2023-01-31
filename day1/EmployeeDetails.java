package week2.day1;

public class EmployeeDetails {
		public void empName(String a,int b) {
			System.out.println("Emp Name : "+a+"\nEmp ID : "+b);
		}
	
		public void empAddress(String c) {
			System.out.println("Emp Address : "+c);	
		}
		public void empSalary(double d) {
			System.out.println("Emp Salary : "+d);
		}
	
		public void empMobileNumber(long e) {
			System.out.println("Emp Mobile No : "+e);
		}
		public static void main(String []args) {
			EmployeeDetails empl=new EmployeeDetails();
			empl.empName("Anish",156240);
			empl.empAddress(" Testleaf Chennai");
			empl.empSalary(35000);
			empl.empMobileNumber(9626202638l);
		}


}
