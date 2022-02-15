package Assignment4;

import java.util.HashSet;

public class CopyElementsOfHashSetToArray {

	public static void main(String[] args) {
		//create object of HashSet						
	    HashSet hSet = new HashSet();						
	   						
	    //add elements to HashSet object						
	    hSet.add(new Integer("1"));						
	    hSet.add(new Integer("2"));						
	    hSet.add(new Integer("3"));						
	   						
	    /*						
	      To copy all elements of java HashSet object into array use						
	      Object[] toArray() method.						
	    */						
	   						
	    Object[] objArray = hSet.toArray();						
	   						
	    //display contents of Object array						
	    System.out.println("HashSet elements are copied into an Array.Now Array Contains..");						
	    for(int index=0; index < objArray.length ; index++)						
	      System.out.println(objArray[index]);						
	  }					

}
