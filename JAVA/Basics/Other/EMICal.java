import java.util.*;
import java.lang.*;
public class EMICal{
	public static void main(String x[]){
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a principal : ");
		int principal = in.nextInt();
		System.out.print("Enter Intrest rate : ");
		int rate = in.nextInt();
		System.out.print("enter time period in months : ");
		int period = in.nextInt();

		double emi = (principal * rate * Math.pow(1 + rate, period)) / (Math.pow(1 + rate, period) -1);

		System.out.print("Montly EMI is : " + emi);


}
}