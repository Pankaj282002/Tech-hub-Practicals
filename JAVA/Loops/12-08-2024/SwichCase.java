import java.util.*;
public class SwichCase{
public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nSelect the Case : between 1 to 5 \nPress 1 for display the 1 to nth Prime numbers. \nPress 2 for display the 1 to nth Perfect number. \nPress 3 for display the 1 to nth Duck number. \nPress 4 for display the 1 to nth Strong number. \nPress 5 for display the 1 to nth armstrong number.");
	
	System.out.printf("\nEnter a number : ");
	int choice = in.nextInt();

	switch(choice) { 
	

	case 1 : 	
		System.out.printf("\nEnter a number : ");
		int primeNum = in.nextInt();
		System.out.printf("Prime numbers from 1 to %d\n", primeNum);
		for(int i=2; i<=primeNum; i++){
		boolean primeFlag = true;

			for(int j = 2; j<i; j++){
				int mod = i%j;
				if(mod == 0){
					primeFlag = false;
					break;
				}
			} // inner loop closed 
			if(primeFlag){
				System.out.printf("%d \t", i);
				}	
		} // outer loop closed
		break; // end of case 1.
	case 2 :
		System.out.printf("\nEnter a positive integer number : ");
		int perfectNum = in.nextInt();
		int perfectTemp = perfectNum;
	
		for(int i =1; i<perfectTemp; i++){
			int divisors = 0;
			for(int j = 1; j<i; j++){
			
				if(i%j == 0){
				divisors = divisors + j;
				}
			} // inner loop closed
			if(divisors == i){
				System.out.printf("%d",i);
				}
				
		}	// outer loop closed.
		break; // end of case 2.
	case 3 : 
		System.out.printf("\nEnter a positive number : ");
		int duckNum = in.nextInt();   
		boolean duckFlag = false;

		for(int i =1; i<duckNum; i++){ 
		int j = i;
		while(j>0){				
		 	int digit = j % 10;		
			if(digit == 0){
				duckFlag = true;
			}
			j /= 10;
		} // inear while loop closed.

		if(duckFlag){
			System.out.printf("%d \t", j);
		}
		}// outher for  loop closed.
		break; // end of case 3.
		
	default : 

		System.out.println("Please choose valid number bitween 1 to 5.");
		} // swich case closed
	}
}