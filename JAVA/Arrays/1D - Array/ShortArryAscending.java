import java.util.*;
public class ShortArryAscending
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		int array[] = new int[5];
		System.out.printf("Enter values of array.\n");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("\nEnter %d elemnt of array : ", i+1);
			array[i] = in.nextInt();
		}
		
		Asending(array);
		
		System.out.printf("Shorted in Asending order :-  ");
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("%d\t ", array[i]);
		}
		
	}
	public static void Asending(int a[])
	{
		for(int i=0; i<a.length-2; i++)
		{
			if(a[i] > a[i+1])
			{
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				 i = -1;
			}
		}
		
	}
}