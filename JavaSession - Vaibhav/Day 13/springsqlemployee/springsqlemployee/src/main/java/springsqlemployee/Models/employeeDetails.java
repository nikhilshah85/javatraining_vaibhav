package springsqlemployee.Models;

public class employeeDetails {

	private int empNo;
	private String empName;
	private String empDesignation;
	private int empSalary;
	private Boolean empIsPermanent;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Boolean getEmpIsPermanent() {
		return empIsPermanent;
	}
	public void setEmpIsPermanent(Boolean empIsPermanent) {
		this.empIsPermanent = empIsPermanent;
	}
	@Override
	public String toString() {
		return "employeeDetails [empNo=" + empNo + ", empName=" + empName + ", empDesignation=" + empDesignation
				+ ", empSalary=" + empSalary + ", empIsPermanent=" + empIsPermanent + "]";
	}
	
	
	
}
