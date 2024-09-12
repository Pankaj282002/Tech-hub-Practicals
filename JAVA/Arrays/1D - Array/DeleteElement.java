import java.util.*;
public class DeleteElement
{
    	public static void main(String pankaj[])    
 	{
        		int array[] = new int[5];
        		Scanner in = new Scanner(System.in);

        		System.out.println("Enter a Values in Array.\n");
        		for(int i=0; i<array.length; i++)
        		{
            			System.out.printf("Enter %d Element in Array : ", i+1);
            			array[i] = in.nextInt();
        		}

		System.out.printf("\nEnter a Position where to delete : ");
        		int Position = in.nextInt();

        		

		if(Position>=0 && Position<array.length)
		{
			System.out.printf("Orignal Array \t\t: ");
        			for(int i=0; i<array.length; i++)
        			{
            				System.out.printf("%d ", array[i]);
        			}
        			for(int i=Position-1; i<array.length -1; i++)
        			{
            				array[i] = array[i+1];
        			}
			System.out.printf("\nAfter deleting element  : ");
        			for(int i=0; i<array.length -1; i++)
        			{
            				System.out.printf("%d ", array[i]);
        			}
		}else{
			System.out.printf("\nEnter a Valid position.");
		}

        		
        		System.out.println();

    	}
}
