package number;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {


		
		
		 // Take two string as input
		 //Converting both the string to lower case. 
		 //Checking for the length of strings 
		 //convert two strings to character array
		 //Short two character arrays using array.short() method
		 //Compare two character array if they are equal thay are anagram otherwise not
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		    String str1="Brag";  
	        String str2="Grabb";  
	  
	        //Converting both the string to lower case.  
	        str1 = str1.toLowerCase();  
	        str2 = str2.toLowerCase();  
	  
	        //Checking for the length of strings  
	        if (str1.length() != str2.length()) {  
	            System.out.println("Both the strings are not anagram");  
	        }  
	        else {  
	            //Converting both the arrays to character array  
	            char[] string1 = str1.toCharArray();  
	            char[] string2 = str2.toCharArray();  
	  
	            //Sorting the arrays using in-built function sort ()  
	            Arrays.sort(string1);  
	            Arrays.sort(string2);  
	  
	            //Comparing both the arrays using in-built function equals ()  
	            if(Arrays.equals(string1, string2) == true) {  
	                System.out.println("Both the strings are anagram");  
	            }  
	            else {  
	                System.out.println("Both the strings are not anagram");  
	            }  
	        } 	
		
		

	}

}
