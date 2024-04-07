package number;

public class PalindromeOrNotString {

	public static void main(String[] args) {

		// Q Write a program to check if a string is palindrome or not.
		// (if you reverse a string and if it's the same as the original string
		// then the string is a palindrome. E.g: level, 121 ect.)

		// String str="nitin";

		//String str = "nitin";
		
		
		String str = "level";

		int start = 0;
		int end = str.length() - 1;

		boolean isPalindrom = true;
		while (start < end) {

			if (str.charAt(start) != str.charAt(end)) {

				isPalindrom = false;
				break;

			}

			start++;
			end--;

		}

		if (isPalindrom) {

			System.out.println(" Palindrom");

		} else {

			System.out.println(" not Palindrom");

		}

	}

}
