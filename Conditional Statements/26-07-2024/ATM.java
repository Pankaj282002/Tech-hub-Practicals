import java.util.*;
public class ATM{
	public static void main(String x[]){

		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a widrawal Amount : ");
		int widrawal = in.nextInt();
		System.out.print("Enter a bank balance : ");
		int balance = in.nextInt();
		double avalableBalance = balance - widrawal - (widrawal*0.5)/100;
		
		if(avalableBalance>=0){
			System.out.println("Transation sucessfully");
			System.out.printf("Rs. %d is debited from your account\nAvalable Balance is  Rs. %lf", widrawal, avalableBalance);
		}
		else {
			System.out.print("transation faild !\nYou don't have sufficent amout for widrawal.");
		}
}
}