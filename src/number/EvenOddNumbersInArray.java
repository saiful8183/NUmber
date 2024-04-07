package number;

public class EvenOddNumbersInArray {

	public static void main(String[] args) {

		// Q Find (print all )out Even and odd number of an array

		// int a[]= {1,2,3,4,5,6};

		// int sum = 0;

		/*
		 * System.out.println("Even number an array"); for (int i=0; i<a.length; i++) {
		 * if (a[i]% 2==0) { System.out.println(a[i]);
		 * 
		 * } }
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
		 */

		/*
		 * 
		 * int a[]= {1,4,6,8,9,3};
		 * 
		 * System.out.println("Even number an array");
		 * 
		 * for (int i=0; i<a.length; i++) { if (a[i]% 2==0) { System.out.println(a[i]);
		 * } } System.out.println("Odd number an array"); for (int j=0; j<a.length; j++)
		 * { if (a[j]%2!=0) { System.out.println(a[j]); }
		 * 
		 * }
		 * 
		 */

		/*
		 * 
		 * int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 * 
		 * System.out.println("Even numbers in array are");
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * if (a[i] % 2 == 0) {
		 * 
		 * System.out.println(a[i]);
		 * 
		 * }
		 * 
		 * }
		 */

		int a[] = {  1,4,6,8,9,3};

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);

			}

		}

	}

}
