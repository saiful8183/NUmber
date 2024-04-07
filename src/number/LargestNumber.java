package number;

public class LargestNumber {

	 static public void main(String[] args) {
		 
		 
		 
// To find out largest number
		int a=30;
		int b=40;
		int c= 50;

		int largest1=a>b?a:b;
		
		
		int largest2=c>largest1?c:largest1;
		System.out.println(largest2+"is largest number");
		
		
		
		//int largest1=a>b?a:b;
		
		
		//int largest2=c>(a>b?a:b)?c:(a>b?a:b);
		
		
		//System.out.println(largest2+ "is alrgest number");
	}

}
