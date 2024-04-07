package number;

public class ShortingInAssendingOrder {

	public static void main(String[] args) {

		
		
		// ASSENDING ORDER
		
		
		
		int arr[] = new int[] { 3, 2, 5, 4, 6, 7, 8, 10, 1, 9 };

		//for (int i = 0; i < arr.length; i++) {

			//System.out.println(arr[i]);

		//}
		
		
		
		
		
		int temp;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}

		}
		
		for(int a:arr) {
			
			
		System.out.println(a);	
		}

	}

}


		
		
		


//DESCENDING ORDER






//int arr[] = new int[] { 3, 2, 5, 4, 6, 7, 8, 10, 1, 9 };

//for (int i = 0; i < arr.length; i++) {

	//System.out.println(arr[i]);

//}



/*

int temp;
for (int i = 0; i < arr.length; i++) {

	for (int j = i; j < arr.length; j++) {

		if (arr[i] < arr[j]) {

			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}

	}

}

for(int a:arr) {
	
	
System.out.println(a);	
}

}

}

*/







