package employeemanagement.employeemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employeemanagement.employeemanagement.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
