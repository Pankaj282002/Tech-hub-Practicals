import java.util.*;
class SmallestMissingElement{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter a size of array : ");
		int size = in.nextInt();
		int array[] = new int[size];
	
		System.out.printf("\nEnter a element values in array.\n");
		for(int i=0; i<size; i++)
		{
			System.out.printf("Enter a %d element of array : ", i);
			array[i] = in.nextInt();
		}
		
		System.out.printf("\nDisplay the Array.\n");
		System.out.printf("Array [] : ");
		for(int i=0; i<size; i++)
		{
			System.out.printf("%d  ", array[i]);
		}
	
		for(int i=0; i<size - 1; i++)
		{
			if(array[i] > array[i+1])
			{
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				i = -1;
			}
		}

		boolean flag = false;
		for(int i=0; i<=array[size-1]; i++)
		{
			if(i != array[i])
			{
				flag = true;
				
			}
			
			if(flag)
			{
				System.out.printf("\nThe missing smallest element is : %d\n", i);
				break;
			}
		}
	System.out.println();
		
	}
}