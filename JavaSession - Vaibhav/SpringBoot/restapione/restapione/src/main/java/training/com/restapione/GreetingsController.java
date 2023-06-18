package training.com.restapione;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Controller("/greetings")
@RequestMapping("/greetings")
public class GreetingsController {

	
	@GetMapping("/greet")
	public String Greet()
	{
		return "Hello and Welcome to the world of REST API created useing SpringBoot";
	}
	
	@GetMapping("/greet/{guestName}")
	public String Greet(@PathVariable String guestName)
	{
		return "Hello and Welcome " + guestName;
	}
	
	 List<String> techList = new ArrayList<>();
	 
	 
	 
	 @GetMapping("/techlist")
	 public List<String> GetTechnologyList()
	 {
		 techList.add("Angular");
		 techList.add("Java");
		 techList.add("Spring Boot");
		 techList.add("SQL Server");
		 techList.add("React");
		 techList.add("Azure");
		 
		 return techList;
	 }

	
}









