package number;

import java.util.Scanner;

public class TotalNumberOfWordsInString {

	public static void main(String[] args)

	{

		
		
		// With Scanner Class
		
		
		
		
		
		
		
		
		/*
		 * 
		 * System.out.println("Enter the string");
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String s = sc.nextLine();
		 * 
		 * int count = 1;
		 * 
		 * for (int i = 0; i < s.length() - 1; i++) {
		 * 
		 * if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
		 * 
		 * count++;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("Number of words in a String:" + count);
		 */

		// System.out.println(str.length());
		
		
		
		
		
		
		
		
		//Without ScannerClass
		
		
		
		
		/*

		String str = "Programming is fun jun";
		
		System.out.println(countword(str));
	}

	private static int countword(String str) {
			
			int wordCount=1;
			
			
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == ' ' && i<str.length()-1 && str.charAt(i + 1) != ' ') {

					wordCount++;
			
			
				}
			
			}
			return wordCount++;
			
			
			*/
		
		
		
		
		//OR
		
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
