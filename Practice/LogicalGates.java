import java.util.*;
class LogicalGates
{
	public static void main(String pankaj[])
	{
		Scanner pavan = new Scanner(System.in);
		
		System.out.printf("\nEnter 1 for the AND gate.");
		System.out.printf("\nEnter 2 for the OR gate.");
		System.out.printf("\nEnter 3 for NOT gate.");
		System.out.printf("\nEnter 4 for All Gates.\n");

		System.out.printf("\nEnter a number for logical gate swich : ");
		int num = pavan.nextInt();
	
		if(num<1 && num>4)
		{
			System.out.println("Choose a valid option between 1 to 4 only.");
		}else{
			gates(num);
		}
		
	}
	public static void gates(int x)
	{
		switch(x)
		{
			case 1 : 
				AND();
				break;
			case 2 : 
				OR();
				break;
			case 3 : 
				NOT();
				break;
			case 4 :
				System.out.printf("-----------------------------------------------------------------------------------------------------------------------");
				AND();
				System.out.printf("-----------------------------------------------------------------------------------------------------------------------");
				OR();
				System.out.printf("-----------------------------------------------------------------------------------------------------------------------");
				NOT();
				System.out.printf("-----------------------------------------------------------------------------------------------------------------------");
				break;
		}
	}

	public static void AND()
	{
				System.out.println("\n\tAND Gate\n");
				System.out.printf("\tInput 1\t\tInput 2\t\tOutput\n");
				for(int i=0; i<=1; i++)
				{
					for(int j=0; j<=1; j++)
					{
						System.out.printf("\t%d\t\t%d\t\t%d\n", i, j, i & j);
					}
				}
	}

	public static void OR()
	{
				System.out.println("\n\tOR Gate\n");
				System.out.printf("\tInput 1\t\tInput 2\t\tOutput\n");
				for(int i=0; i<=1; i++)
				{
					for(int j=0; j<=1; j++)
					{
						System.out.printf("\t%d\t\t%d\t\t%d\n", i, j, i | j);
					}
				}
	}

	public static void NOT()
	{
				System.out.println("\n\tNOT Gate\n");
				System.out.printf("\tInput\t\tOutput\n");
				for(int i=0; i<=1; i++)
				{
						int output = (i == 0) ? 1 : 0; 
						System.out.printf("\t%d\t\t%d\n", i, output);
				}
	}
}