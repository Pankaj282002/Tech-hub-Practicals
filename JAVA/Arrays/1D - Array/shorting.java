import java.util.*;
class shorting
{
	public static void main(String panka[])
	{
		int array[] = new int[5];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a vlues of array.");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("Enter a %d element of array : ", i+1);
			array[i] = in.nextInt();
		}
		for(int i=0; i<array.length-1; i++)
		{
			if(array[i] > array[i+1])
			{
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				i = -1;
			}
		}
		System.out.printf("\nShorted array is : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("%d ", array[i]);
		}
	}
}