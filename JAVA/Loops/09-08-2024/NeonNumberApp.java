import java.util.*;
public class NeonNumberApp{

    public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a number : ");
	int num = in.nextInt(); 
	int sum = 0;
	int square = num*num; 

	while(square>0)
	{
		int digit = square%10;  
		sum = sum + digit;
		square = square/10;
	}

	if(sum == num)
	{
		System.out.println("Number is Neon number.");
	}
	else{
		System.out.println("Number is not Neon number.");
	}
       }
}