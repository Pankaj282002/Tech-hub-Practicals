import java.util.*;
class ElementAppearInArray
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a size of first array : ");
		int size1 = in.nextInt();
		System.out.printf("\nEnter a size of second array : ");
		int size2 = in.nextInt();

		int array1 [] = new int[size1];
		int array2 [] = new int[size2];
		int merge [] = new  int [size1 + size2];
		
		System.out.printf("\nEnter a values of first array.\n");
		for(int i=0; i<size1; i++)
		{
			System.out.printf("Enter a %d value of array : ", i);
			array1[i] = in.nextInt();
		}

		System.out.printf("\nEnter a values of first array.\n");
		for(int i=0; i<size2; i++)
		{
			System.out.printf("Enter a %d value of array : ", i);
			array2[i] = in.nextInt();
		}

		System.out.printf("\n Merge array : ");
		for(int i=0; i<merge.length; i++)
		{
			if(i<size1)
			{
				merge[i] = array1[i];
			}else{
				merge[i] = array2 [size1 -i];
			}
		}
		
		
	}
}