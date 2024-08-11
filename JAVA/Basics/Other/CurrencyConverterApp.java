// indian rupee to Us dollar converter
import java.util.*;
public class CurrencyConverterApp{
	public static void main(String x[]){
		Scanner in = new Scanner(System.in);
		System.out.printf("Eneter a ruppes : ");
		int rupee = in.nextInt();

		double dollar = rupee*0.012;
		System.out.printf("%d rupees in Us dollar %f\n", rupee, dollar);
}

}