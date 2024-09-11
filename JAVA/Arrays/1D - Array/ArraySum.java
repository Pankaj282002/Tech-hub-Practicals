import java.util.*;	
class ArraySum
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		int array[] = new int[5];
		int sum = 0;
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("Enter a %d element of array : ", i);
			array[i] = in.nextInt();
			sum = sum+array[i];
		}
		
		System.out.println();
		System.out.printf("Array : ");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("%d\t", array[i]);
		}
		System.out.printf("\nSum : %d", sum);	
	}

}