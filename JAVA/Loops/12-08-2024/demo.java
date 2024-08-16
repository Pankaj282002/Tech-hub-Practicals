import java.util.*;
public class SwichCase{
public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nSelect the Case : between 1 to 5 \n
			Press 1 for display the 1 to nth Prime numbers. \n
			Press 2 for display the 1 to nth Perfect number. \n
			Press 3 for display the 1 to nth Duck number. \n
			Press 4 for display the 1 to nth Strong number. \n 
			Press 5 for display the 1 to nth armstrong number.");
	
	System.out.printf("\nEnter a number : ");
	int choice = in.nextInt();

	swich(choice) {
	

	case 1 : 	
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();
		for(int i=2; i<=num; i++){
		boolean flag = true;

			for(int j = 2; j<i; j++){
				int mod = i%j;
				if(mod == 0){
					flag = false;
					break;
				}
			} // inner loop closed 
			if(flag){
				System.out.printf("%d \t", i);
				}	
		} // outer loop closed
		break;
	default : 

		System.out.println("Please choose valid number bitween 1 to 5.");
		} // swich case closed
	}
}