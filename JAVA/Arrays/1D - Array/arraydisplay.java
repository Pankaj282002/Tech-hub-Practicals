import java.util.*;
public class arraydisplay
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner (System.in);
		System.out.printf("\nArray\n");
		int a []= new int[5];

		for(int i=0; i<a.length; i++)
		{
			System.out.printf("Enter a %d value in array : ",i);
			a[i] = in.nextInt();
		}
		for(int j=0; j<a.length; j++)
		{
			System.out.printf("\na = [%d] = %d\n ", j, a[j]);
		}
	}
}