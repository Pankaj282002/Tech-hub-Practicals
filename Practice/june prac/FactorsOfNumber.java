import java.util.*;
class FactorsOfNumber
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt();
		System.out.println();
		
		
		for(int i=1; i<=num; i++)
		{
			System.out.printf("Even factor of %d is : ", i);
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{	if(i%2==0){
						
						System.out.printf("%d, ", j);
					}
				}
			}
			System.out.printf("\n\n");
		}
		System.out.println();
	}
}