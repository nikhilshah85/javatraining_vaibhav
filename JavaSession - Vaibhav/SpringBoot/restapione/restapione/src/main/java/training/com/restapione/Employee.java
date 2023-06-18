package training.com.restapione;

public class Employee {

	
		int v_empNo;
		String v_empName;
		double v_empSalary;
		String v_empDesgination;
		Boolean v_empIsPermenant;
		
		public void setName() {
			this.v_empName = "Nikhil Shah";
			this.v_empDesgination = "Consultant";
		}
		
		
		public Employee EmployeeDetails() {
			
			Employee empObj = new Employee();
			empObj.setName();
			
			return empObj;
		}
		
		
	
}
