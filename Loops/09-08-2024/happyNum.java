import java.util.*;
public class happyNum{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a number : ");
	int num = in.nextInt();
	int sum = 0;
	
	while(num!=0 && num!=4){
	
	while(num!=0){
			int digit = num%10;
			sum = sum + (digit*digit);
			num = num/10;
		}
	num = sum;
	}
	if(sum == 1){
	System.out.println("Number is a happy number.");
	}
	else{
	System.out.println("Number is not a happy number.");
	}
}
}