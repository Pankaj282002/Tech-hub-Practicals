import java.util.*;
public class primeNum{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a number : ");
	int num = in.nextInt();
	int check = 0;

	for(int i = 1; i<=num; i++){
	
	if(num%i==0){
		check++;
	    }
	}
	
	if(check == 2){
		System.out.print("Number is prime.");
	}
	else{
	System.out.print("Number is not prime.");
	}
	
}
}