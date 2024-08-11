import java.util.*;
public class DuckApp{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.print("\nEnter a number : ");
	int num = in.nextInt();
	boolean flag = false;
	
	while(num>0){
		int digit = num%10;
		if(digit == 0){
			flag = true;
			break;
		}
		num = num/10;
	}
	if(flag){
	System.out.println("Given number is Duck number.");
	}
	else{
	System.out.println("Given Number is not a Duck Number.");
	}
}
}