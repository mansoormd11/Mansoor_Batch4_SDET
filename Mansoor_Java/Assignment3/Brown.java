package Assignment3;

public class Brown {

	public static void main(String[] args) {							
        String haystack = "A brown fox ran away fast ";							
		
       						
        String needle = "Brown";							
        if (haystack.indexOf(needle) != -1) {							
            System.out.println("Found the word " + needle +							
                    " at index number " + haystack.indexOf(needle));							
        } else {							
            System.out.println("Can't find " + needle);							
        }							
							
        					
        if (haystack.contains(needle)) {							
            System.out.println("Found brown!");							
        }							
    }							

}
