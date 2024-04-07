package number;

public class CountEvenOdd {

	public static void main(String[] args) {

		//How many even how many odd
		
		
		int num = 12345;

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
		System.out.println(odd_num);
	}
}

