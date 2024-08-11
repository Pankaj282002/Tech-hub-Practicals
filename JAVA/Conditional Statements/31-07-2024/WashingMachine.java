import java.util.*;
public class WashingMachine{
	public static void main(String x[]){
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter a weight of clothes : ");
		int weight = in.nextInt();
		

		if(weight >= 0 ){
		 	if(weight == 0){
				System.out.println("Time Estimate : 0 minutes.");
			}
			else if(weight > 0 && weight <= 2000){

				System.out.println("Low level water.");
				System.out.println("Time Estimated : 25 minutes.");
			}
			else if(weight > 2000 && weight <= 4000){

				System.out.println("Medium level water.");
				System.out.println("Time Estimated : 35 minutes.");
			}
			else if(weight > 4000 && weight <= 7000){

				System.out.println("Hegh level water.");
				System.out.println("Time Estimated : 45 minutes.");
			}
			else{
				System.out.println("OVERLOADED !");
			}
		}
		else{

		System.out.println("INVALID INPUT !");

		}

	}
}