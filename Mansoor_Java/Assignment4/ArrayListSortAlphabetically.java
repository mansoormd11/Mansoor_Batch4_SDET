package Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortAlphabetically {

	public static void main(String[] args) {					
		   ArrayList<String> listofcountries = new ArrayList<String>();					
		   listofcountries.add("APPLE");					
		   listofcountries.add("PINEAPPLE");					
		   listofcountries.add("GRAPES");					
		   listofcountries.add("ORANGE");					
		   					
		   System.out.println("Before Sorting:");					
		   for(String counter: listofcountries){					
				System.out.println(counter);			
			}				
							
		   				
		   Collections.sort(listofcountries);					
	       System.out.println("After Sorting:");					
		   for(String counter: listofcountries){					
				System.out.println(counter);			
			}				
		}					

}
