import java.util.*;
class electricity
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("\nEnter a units : ");
		int unit = in.nextInt();
		double total, addCharge, bill;
		
		
		if(unit>0 && unit<=50){
			bill = unit*0.50;			// calculate bill from unit.
			addCharge = (bill*0.2);		// 20% of bill charges.
			total = bill + addCharge;		// calculate sum with charges
			
			System.out.printf("units = %d \nBill = %.2f Rs", unit, total);
		}
		else if(unit<100){
			bill = unit*0.75;
			addCharge = (bill*0.2);
			total = bill + addCharge;
			System.out.printf("units = %d \nBill = %.2f Rs", unit, total);
		}
		else if(unit<150){
			bill = unit*1.20;
			addCharge = (bill*0.2);
			total = bill + addCharge;
			System.out.printf("units = %d \nBill = %.2f Rs", unit, total);
		}
		else if(unit>250)
		{
			bill = unit*1.50;
			addCharge = (bill*0.2);
			total = bill + addCharge;
			System.out.printf("units = %d \nBill = %.2f Rs", unit, total);
		}else{
			
			System.out.println("Enter a valid units");
		}
	}
}