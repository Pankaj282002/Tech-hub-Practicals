import java.util.*;
public class demo{
	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a number : ");
                flag = true;
	int num = in.nextInt();
	int i = 2;
	
	while(i<num)
	{
              		int rem=num%i;
                
                 	if(rem==0)
                	 {
             			flag=false;
			temp = 1;
              		 }
		i++;	
	}
if(flag)
{
System.out.println("number is prime");
}
else{
System.out.println("number is not prime");
	}
}
}