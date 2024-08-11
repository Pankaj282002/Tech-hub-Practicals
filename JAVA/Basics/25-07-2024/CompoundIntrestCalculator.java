
import java.util.*;
public class CompoundIntrestCalculator {
	public static void main(String x[]) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a Principal Amount : ");
	int p= sc.nextInt();
	System.out.print("Enter a Rate of Interest : ");
	int r= sc.nextInt();
	System.out.print("Enter a Time Period in monts : ");
	int t= sc.nextInt();

	double CompoundIntrest = p*Math.pow(1.0+r/100.0,t)-p;
	double TotalAmount = CompoundIntrest + p;
	System.out.println("Compound Intrest : "+CompoundIntrest);
	System.out.print("Total Amount : "+ TotalAmount);
}
}
