import java.util.*;
class functionality
{
	double balance;
	functionality(double balance)
	{
		if(balance < 0)
		{
			this.balance = 0;
		}else{
			this.balance = balance;
		}
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		if(amount > 0 ){
			balance += amount;
		}else{
			
			System.out.println("Amount deposited Successfully.");
		}
	}
	public void withdraw(double amount)
	{
		if(amount <= balance && amount > 0)
		{
			balance -= amount;
			System.out.println("Amount widthdrwal Successfully.");
		}
	}
}
class fucntion extends functionality
{
	public void loop(){
	
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the ATM Service.");
		System.out.println("Press 1 for Balace Inquiry : ");
		System.out.println("Press 2 for Deposit Amount : ");
		System.out.println("Press 3 for Withdraw Amount : ");
		System.out.println("Press 4 for Exit From Service : ");
		
		System.out.println("Enter a number : ");
		int num = in.nextInt();
		
		if(num>0 && num<5){
		Switch(num) 
		{
			case 1: 
				System.out.println("Balance Inquiry Service.");
				System.out.println("Your Bank Balance is : " + getBalance());
				break;
			case 2:
				System.out.println("Deposit Amount Service.");
				System.out.println("Enter a Amount : ");
				deposit(in.nextInt());
				System.out.println("Current Balance : " + getBalance());
				break;
			case 3:
				System.out.println("Withdrawal Amount Service.");
				System.out.println("Enter a Amount : ");
				withdraw(in.nextInt());
				System.out.println("Current Balance : " + getBalance());
				break;
			case 4:
				System.out.println("Successfully Exited from Services.");
				return;
		}
		}else{
			System.out.println("Please Enter a valid number.");
		}
		loop();

	}
}
public class ATM
{
	public static void main(String pankaj [])
	{
			fucntion f = new fucntion();
			f1.loop();
	}
}