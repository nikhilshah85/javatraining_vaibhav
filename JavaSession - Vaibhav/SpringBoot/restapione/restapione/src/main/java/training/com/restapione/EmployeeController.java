package training.com.restapione;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller("/employee")
@RequestMapping("/employee")
public class EmployeeController {


	
	@GetMapping("/greet")
	public String Greet()
	{
		return "Hello Employee Welcome to Office";
	}
	
	
	@GetMapping("/schedule")
	public List<String> TodaysSchedule()
	{
		List<String> schedule = new ArrayList<>();
		schedule.add("Daily Meet");
		schedule.add("Client Calls");
		schedule.add("Sprint Meet 4");
		schedule.add("Team Lunch");
		
		return schedule;
				
	}
	
	
}
