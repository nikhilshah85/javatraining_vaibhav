package springsqlemployee.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/emp")

public class EmployeeController {

	
	@GetMapping("/helloemp")
	public String GetGreetings()
	{
		return "Hello and welcome to Employee Controller in package";
	}
}
