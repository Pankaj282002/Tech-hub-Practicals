import java.util.*;
public class primeNum{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a number : ");
	int num = in.nextInt();
	boolean primeFlag = false;
	
	for(i=2; i<=num-1; i++){
	prime = num%i;
		if(prime!=0){
		primeFlag = 0;
		}
	}
	if(primeFlag){
	System.out.print("Number is prime");
	}
	else{
	System.out.print("Number is not prime");
	}
}
}