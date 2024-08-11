import java.util.*;
public class Wages{

public static void main(String x[]){
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a age : ");
		int age = in.nextInt();
		System.out.print("Enter a gender : ");
		char gender = in.next().charAt(0);
		System.out.print("Enter a no.of days : ");
		int days = in.nextInt();
	
		String genVar = gender == 'm' ? "male" : "female";

		int result = (age>=18 && age<30 && gender == 'm') ? days*700 : 
			(age>=18 && age<30 && gender == 'f') ? days*750 :

			(age>=30 && age<=40 && gender == 'm') ? days*800 : 
			(age>=30 && age<=40 && gender == 'f') ? days*850 :

			(age>=40 && age<=50 && gender == 'm') ? days*900 : 
			(age>=40 && age<=50 && gender == 'f') ? days*950 :

			(age>50 && age<=60 && gender == 'm' || gender == 'f') ? days*1000 :
			days - days;
			

		System.out.printf("\n%d days works of %s worker and wages is %d\n", days, genVar, result);
	}
}	