import java.util.*;
class clinic
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("\nEnter a age : ");
		int age = in.nextInt(); // 50
		
		if(age>0 && age<=5){		// age above 0 to 5 years
			
			System.out.printf("fees : no fees\n");
		}
		else if(age>5 && age<=10){	// age above 5 to 10 years
			System.out.printf("fees : 50 Rs");
		}
		else if(age>10 && age<=18){	// age above 10 to 18 years
			
			System.out.printf("fees : 100 Rs");
		}
		else if(age>18 && age<=40)  	// age above 18 to 40 years
		{
			System.out.printf("fees : 200 Rs");
		}
		else if(age>40 && age<=60)	// age above 40 to 60 years
		{
			System.out.printf("fees : 150 Rs");
		}
		else if(age>60 && age<=100)	//age above 60 to 100 years
		{
			System.out.printf("fees : no fees Rs");
		}else{			// age less than 0 and more than 100
			
			System.out.println("Enter a valid age");
		}
	}
}