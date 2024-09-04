import java.util.*;
class FacorsOfNumber
{
	public static void main(Stirng pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();
		
		System.out.printf("Factor of %d is : \n", num);
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.printf("\t%d", i);
			}
		}
	}
}