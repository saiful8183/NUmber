package number;

import java.util.Scanner;

public class PalindromNumberOrNot {

	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * 
		 * int num = 1211; int rev = 0; int temp = num;
		 * 
		 * while (num > 0) { rev = rev * 10; rev = rev + num %10; num = num / 10;
		 * 
		 * }
		 * 
		 * if (rev == temp) {
		 * 
		 * System.out.println("It is Palindrom");
		 * 
		 * } else { System.out.println("It is not Palindrom");
		 * 
		 * }
		 */
		
		
		//Or Using ScannerClass
		
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int num = sc.nextInt();

		int org_num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

			 System.out.println(rev);

		}
		if(org_num==rev) {
			
		System.out.println(org_num+"Palindrom");	
			
			
		}else {
			
			System.out.println(org_num+"not Palindrom");	
			
		}

	}

}
