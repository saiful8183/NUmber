package number;

public class TotalOfOneToTenOdd {

	public static void main(String[] args) {

		// Q //Total of 1 to 10 0dd number

		int sum = 0;

		for (int i = 0; i <= 10; i++) {

			if (i % 2 != 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);

	}

}
