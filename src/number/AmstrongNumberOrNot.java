package number;

public class AmstrongNumberOrNot {

	public static void main(String[] args) {


		int num=154,result=0,rem;
		
		int temp=num;
		
		while(num>0) {
			
			
		rem=num%10;
		num=num/10;
		
		result=result+(rem*rem*rem);	
		}
		
		if(result==temp) {
			
		System.out.println(" armstrong");	
			
			
			
			
		}else {
			System.out.println("Not armstrong");	
			
			
		}
		
		
		
		
		
		
		
	}

}
