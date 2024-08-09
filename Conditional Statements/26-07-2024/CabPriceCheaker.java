import java.util.*;
public class CabPriceCheaker{

	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a price of first cab : ");
	int firstCab = in.nextInt();
	System.out.print("Enter a price of second cab : ");
	int secondCab = in.nextInt();
	int save;
	
	if(firstCab == secondCab )
	{
		System.out.print("both cab are same price. you can chose anyone of them.\n");
	}
	else if(firstCab < secondCab )
	{
		save = secondCab - firstCab;
		System.out.printf("first cab is the cheaper than second cab. You save %d Rs.\n", save);
	}
	else if(secondCab < firstCab)
	{
		save = firstCab - secondCab;
		System.out.printf("second cab is the cheaper than first cab. you save %d Rs.\n", save);
	}
	else{
		System.out.print("Somting is wrong. ! ");	
	}
	}
}