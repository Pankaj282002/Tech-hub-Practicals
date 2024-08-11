import java.util.*;
public  class perfectNum{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a number : ");
	int num = in.nextInt();
	int sum = 0;

	for(int i = 1; i<num; i++){
	 	if(num%i == 0){
			sum = sum + i;
	}
	}
	if(sum == num){
	System.out.println("Number is perfect number.");
	}
	else{
	System.out.println("Number is not a perfect number.");
	}
	}	
}