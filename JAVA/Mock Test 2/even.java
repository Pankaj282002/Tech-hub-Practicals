import java.util.*;
class even
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");		
		int num = in.nextInt(); // case 1: 8  && case 2: 3

		if(num%2==0) //case 1: 8%2==0  --> true  
		{
			System.out.printf("%d is a even number.", num);	
		}else{	// case 2: 3%2==0 --> false 
	
			System.out.printf("%d is a odd number.", num);
		}
	}
}