package number;

public class TotalOfAllEvenInArray {

	public static void main(String[] args) {


		// Q //Array[] numbers= new Array{1,2,3,4,5,6,7,8,9,10};
				// Write a program to find out the total of all even numbers.

		
					 int[] myArray = {1, 5, 10, 25};

				
				  int sum = 0;
				  
				  // Loop through the array elements and store the sum in the sum variable 
				  for(int i = 1; i <myArray.length; i++) { 
					  if (myArray[i] % 2 == 0) { 
						  sum = sum + myArray[i];
				  
				  }
				  
				  } 
				  System.out.println(sum);
				 

				
		
		
		/*

		// Q //Array[] numbers= new Array{1,2,3,4,5,6,7,8,9,10};
				// Write a program to find out the total of all even numbers.

				// int a[] = new int[]{1, 5, 10, 25};
				 int a[] ={1, 5, 10, 25};

				
				  int sum =0;
				  
				  // Loop through the array elements and store the sum in the sum variable 
				  for(int i = 0; i<a.length;i++) { 
					  if (a[i]% 2 != 0) { 
						  sum = sum + a[i];
				  
				  }
					
				  } 
				  System.out.println(sum);
				 
*/
				

	}

}
