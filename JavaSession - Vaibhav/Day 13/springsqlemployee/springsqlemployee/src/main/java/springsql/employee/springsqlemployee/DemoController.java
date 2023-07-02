package springsql.employee.springsqlemployee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springsqlemployee.Models.*;
@RestController
@CrossOrigin
public class DemoController {

	@GetMapping("/demo")
	public String DemoGreet()
	{
		return "Hello and Welcome to New Controller";
	}
	
	@GetMapping("/demo/{name}")
	public String DemoGreet(@PathVariable String name)
	{
		return name;
	}
	
	@Autowired
	private JdbcTemplate _jdbctemp;
	
	@GetMapping("/emp")
	public List<employeeDetails> GetAllEmployess()
	{
		String sqlquery = "Select * from employeeDetails";
		List<employeeDetails> allEmp = _jdbctemp.query(sqlquery, BeanPropertyRowMapper.newInstance(employeeDetails.class));		
		return allEmp;		
		
	}	
	
	
	@GetMapping("/emp/{id}")
	public employeeDetails GetEmpbyId(@PathVariable int id)
	{
		String query = "select * from employeeDetails where empNo =" + id;
		List<employeeDetails> emp;		
		emp = (List<employeeDetails>) _jdbctemp.query(query, BeanPropertyRowMapper.newInstance(employeeDetails.class));	
		
		employeeDetails empData = emp.get(0);
		return empData;
	}
	
	@PostMapping("/emp/add")
	public String AddNewEmployee()
	{
		String newEmp = "insert into employeeDetails values(110,'','Accounts',14000,1200)";
		
		_jdbctemp.query(newEmp, BeanPropertyRowMapper.newInstance(employeeDetails.class));
		
		return "Employee Added Successfully";
		
		
	}
	
	
}



