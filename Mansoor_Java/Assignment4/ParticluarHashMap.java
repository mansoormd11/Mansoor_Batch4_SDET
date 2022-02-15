package Assignment4;

import java.util.HashMap;

public class ParticluarHashMap {

	public static void main(String[] args) {
		{						
				
	        // Create a HashMap						
	        HashMap<Integer, String>						
	            map = new HashMap<>();						
	  						
	        // Populate the HashMap						
	        map.put(1, "Geeks");						
	        map.put(2, "ForGeeks");						
	        map.put(null, "GeeksForGeeks");						
	  						
	        // Get the key to be removed						
	        int keyToBeChecked = 2;						
	  						
	        // Print the initial HashMap						
	        System.out.println("HashMap: "						
	                           + map);						
	  						
	        // Check is key exists in the Map						
	        boolean isKeyPresent = map.containsKey(keyToBeChecked);						
	  						
	        // Print the result						
	        System.out.println("Does key "						
	                           + keyToBeChecked						
	                           + " exists: "						
	                           + isKeyPresent);						
	    }						
}
}
