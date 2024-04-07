package number;

public class Pattern {

	public static void main(String[] args) {

		
		/*
                 //Pyramid Star Pattern
		
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
	}
	
	*/
		
		
		
		
		/*
		
		
		//Reverse Pyramid Star Pattern
  
		
		
		
		int rows=8;  
		for (int i= 0; i<= rows-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=rows-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		} 
		
		 */
		
		
		
		
		//Number Pattern-3
  
		int n = 8;    //n is the number of rows you want to print  
		for (int i = 0; i < n; i++)   
		{  
		int number = 1;  
		System.out.printf("%" + (n - i) * 2 + "s", "");  
		for (int j = 0; j <= i; j++)   
		{  
		System.out.printf("%4d", number);  
		number = number * (i - j) / (j + 1);  
		}  
		System.out.println();  
		}  
		}  
		}  
		
		
		
		
		
		
		
		
		

