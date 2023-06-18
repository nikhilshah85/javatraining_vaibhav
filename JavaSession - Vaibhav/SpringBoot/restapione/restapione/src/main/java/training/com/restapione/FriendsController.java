package training.com.restapione;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("/friends")
public class FriendsController {
	
	
	static ArrayList<String> friendsList = new ArrayList<String>();
	
	public FriendsController() {
		friendsList.add("Rahul");
		friendsList.add("Manish");
		friendsList.add("Karan");
		friendsList.add("Mohan");
		friendsList.add("Rohan");
		friendsList.add("Aditi");
		friendsList.add("Roshni");
		friendsList.add("Kriti");
	}

	
	@GetMapping("/list")
	public ArrayList<String> FriendList()
	{
		return friendsList;
	}
	
	@GetMapping("/list/{idx}")
	public String friendByIndex(@PathVariable int idx)
	{
		try
		{
		String friend = friendsList.get(idx);
		return friend;
		}
		catch(IndexOutOfBoundsException er)
		{
			return "Sorry Friend not in list, please try value less than " + friendsList.size();
			
		}
		catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	
	
	@PostMapping("/list/add/{newFriendName}")
	public String AddFriend(@PathVariable String newFriendName)
	{
		friendsList.add(newFriendName);
		return "Friend Added";
	}
	
	@PutMapping("/list/edit/{idx}/{editValue}")	
	public String EditFriend(@PathVariable int idx,@PathVariable String editValue)
	{
		friendsList.set(idx, editValue);
		return "Friend Name Edited";
	}
	
	@DeleteMapping("list/delete/{idx}")
	public String DeleteFriend(@PathVariable int idx)
	{
		friendsList.remove(idx);
		return "Friend Removed";
	}
	
}

















