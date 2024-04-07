package number;

public class TotalOfEvenOddNumber {

	public static void main(String[] args) {

		// Q //Calculate the Sum of an Array
		// Get the sum of array elements:
		/*
		 * int[] myArray = {1, 5, 10, 25}; int sum = 0; int i;
		 * 
		 * // Loop through the array elements and store the sum in the sum variable for
		 * (i = 0; i < myArray.length; i++) { sum += myArray[i]; }
		 * 
		 * System.out.println("The sum is: " + sum);
		 */

		// Q //Array[] numbers= new Array{1,2,3,4,5,6,7,8,9,10};
		// Write a program to find out the total of all even numbers.

		// int[] myArray = {1, 5, 10, 25};

		/*
		 * int sum = 0;
		 * 
		 * // Loop through the array elements and store the sum in the sum variable for
		 * (int i = 1; i <= 10; i++) { if (i % 2 == 0) { sum = sum + i;
		 * 
		 * }
		 * 
		 * } System.out.println(sum);
		 */

		
		
		
		
		
		
		
		
		
		
		// Q // Total of 1 to 10 Number

		
		  int sum =0;
		  
		  // Loop through the array elements and store the sum in the sum variable for
		 for (int i =1; i <= 10; i++) { 
			 if (i % 1 == 0) { 
				 sum = sum + i;
		  
		  }
		  
		  } System.out.println(sum);
		 

		// Q //Total of 1 to 10 0dd number

		/*
		 * int sum = 0;
		 * 
		 * 
		 * for (int i =1; i<= 10; i++) { if (i % 2 != 0) { sum = sum + i;
		 * 
		 * }
		 * 
		 * } System.out.println(sum);
		 * 
		 */

		// Q //Reverse a String
		// You can easily reverse a string by characters with the following example

		/*
		 * 
		 * String originalStr = "Hello"; String reversedStr = "";
		 * 
		 * for (int i = 0; i < originalStr.length(); i++) { reversedStr =
		 * originalStr.charAt(i) + reversedStr; }
		 * 
		 * System.out.println("Reversed string: "+ reversedStr);
		 * 
		 */

		// Q Write a program to check if a string is palindrome or not.
		// (if you reverse a string and if it's the same as the original string
		// then the string is a palindrome. E.g: level, 121 ect.)

		/*
		 * 
		 * 
		 * //String str="nitin"; String str="Forida";
		 * 
		 * int start=0; int end=str.length()-1;
		 * 
		 * 
		 * 
		 * boolean isPalindrom=true; while(start<end) {
		 * 
		 * 
		 * if(str.charAt(start)!=str.charAt(end)) {
		 * 
		 * isPalindrom=false; break;
		 * 
		 * }
		 * 
		 * start++; end--;
		 * 
		 * }
		 * 
		 * if( isPalindrom) {
		 * 
		 * System.out.println( "Palindrom");
		 * 
		 * }else {
		 * 
		 * System.out.println("not a Palindrom");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 */

		// Q Find out Even and odd number of an array

		/*
		 * int a[]= {1,2,3,4,5,6};
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // int sum = 0;
		 * 
		 * 
		 * 
		 * System.out.println("Even number an array"); for (int i=0; i<a.length; i++) {
		 * if (a[i]% 2==0) { System.out.println(a[i]);
		 * 
		 * } }
		 * 
		 * 
		 */

		// odd number of an array

		/*
		 * 
		 * System.out.println("Odd number an array"); for (int j=0; j<a.length; j++) {
		 * if (a[j]%2!=0) { System.out.println(a[j]);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 */

		// Q find out even and odd numbers in java.

		/*
		 * 
		 * int number=100;
		 * 
		 * for (int i=1; i<=number; i++) { if (i%2==0) { System.out.println(i); }
		 * 
		 * }
		 */

		/*
		 * 
		 * int number=100;
		 * 
		 * for (int i=1; i<=number; i++) { if (i%2!=0) { System.out.println(i); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */

		// Q// Count Even and Odd  (HowMany)

		/*int num = 12345;

		int even_num = 0;
		int odd_num = 0;

		while (num > 0) 
		{
			int rem = num % 10;

			if (rem % 2 == 0) 
			{

				even_num++;

			} else {

				odd_num++;

			}
			num = num/10;
		}

		
		System.out.println(even_num);
		System.out.println(odd_num);*/
	}

}
