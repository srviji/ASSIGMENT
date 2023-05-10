package week1.day4;

public class EmployeeDetails {

	public void  empName(String empName) {
		 System.out.println("Employe Name :" + empName);}
	
	public void empId(int empId) {
		System.out.println("employe ID :" + empId);}
	
	public void empAddress(String empAddress) {
		System.out.println("Employe Address :" + empAddress);}
	public void empSalary(double empSalary) {
		System.out.println("Employe Salary :"+ empSalary);}
	public void empNumber(long empNumber) {
		System.out.println("Employe Phone Number:" + empNumber);}
	
		public static void main(String[] args) {
			EmployeeDetails emp = new EmployeeDetails ();
			emp.empName("vijay");
			emp.empId(23);
			emp.empAddress("Chennai");
		    emp.empSalary(12000.0);
		    emp.empNumber(123445678);
		    
		}
		
	}

