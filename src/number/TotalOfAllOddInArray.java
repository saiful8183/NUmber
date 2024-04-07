package number;

public class TotalOfAllOddInArray {

	public static void main(String[] args) {


		// Q //Array[] numbers= new Array{1,2,3,4,5,6,7,8,9,10};
				// Write a program to find out the total of all even numbers.

				 int[] myArray = {1, 5, 10, 25};

				
				  int sum = 0;
				  
				  // Loop through the array elements and store the sum in the sum variable 
				  for(int i = 1; i <= 10; i++) {
					  if (i % 2 != 0) {
						  sum = sum + i;
				  
				  }
				  
				  } 
				  System.out.println(sum);
				 

				

	}

}
