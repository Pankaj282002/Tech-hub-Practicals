import java.util.*;
public class strongNum{

	public static  void main(String x[])
	{
		
		int strong=0;
		int temp = num;
	for(int i=1; i<=100; i++){
		while(num!=0){

			int digit = num%10;
			int fact=1;

			for(int i = 1; i<=digit; i++){
			fact = fact * i;
		
			}
		strong = strong + fact;
		num = num/10;
		}

		if(strong == temp){
			System.out.println("\nThe number is Strong Number");
		flag = true;
		}
		else{
			System.out.println("The number is Not a Strong Number");
		}
	}
 	}
}