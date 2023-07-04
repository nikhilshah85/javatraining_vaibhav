package employeemanagement.employeemanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/greetings")
public class TestController {

	@GetMapping("/greet")
	public String Greeetings()
	{
		return "Hello and welcome to my REST APi application";
	}
}
