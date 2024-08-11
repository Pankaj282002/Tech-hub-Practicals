/* Accept the age, gender ('M', 'F' ) no.of day and display the wages accordingly

Age			gender		wage/day

>=18 and < 30		m		700
			f		750

>=30 and <=40		m		800
			f		850

>=40 and <=50		m		900
			f		950

>50 and <=60		m		1000
			f		1000

above 60			---		Shoul be reire from work and take rest.
---------------------------------------------------------------------------------------------------------------------------------------------
*/


import java.util.*;
public class WageCal {
	public static void main(String x[]){

		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a gender type m or f : ");
		String gender = in.nextLine();
		System.out.print("Enter a age : ");
		int age = in.nextInt();
		System.out.print("Enter a no.of days of working : ");
		int days = in.nextInt();

		System.out.println(gender);
		System.out.println(age);
		System.out.print(days);
		
	}

}
