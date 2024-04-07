package number;

import java.util.HashMap;

public class FindPasswordOfUserName {

	public static void main(String[] args) {

		
		  
		  HashMap<String,Integer> userNamePass= new HashMap<>();
		  
		  
		  userNamePass.put("shahin123",12345); userNamePass.put("saiful41",7869);
		  userNamePass.put("nazmul23",43012); userNamePass.put("nafiz1",80976);
		  
		  //System.out.println(userNamePass);
		  
		  System.out.println(userNamePass.get("saiful41"));
		  
		  
		  System.out.println(userNamePass.containsKey("nafiz1"));
		  System.out.println(userNamePass.remove("shahin123"));
		  System.out.println(userNamePass);
		  
		 

	}

}
