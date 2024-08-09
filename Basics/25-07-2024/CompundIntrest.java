
import java.util.*;
public class CompundIntrest{
	public static void main(String x[]){
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\nPrincipan Amount : ");
		int principal = in.nextInt();
		System.out.print("Total Amount : ");
		int total = in.nextInt();

		int result = total - principal;
		
		System.out.printf("Compound Intrest is %d \n", result);

	}
}