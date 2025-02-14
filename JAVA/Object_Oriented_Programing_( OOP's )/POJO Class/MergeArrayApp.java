import java.util.*;
class MergeArray
{
	private int a [];
	private int b[];
	private int c[];
	//private int [] a,b,c;
	void setArray(int a[], int b[])
	{
		this.a=a;
		this.b=b;
	}
	void performMerge()
	{
		int len = a.length+b.length;
		c = new int[len];

		int i=0;
		while(i<a.length){
			c[i]=a[i];
			i++;
		}
		
		for(int j=0; j<b.length; j++){
			c[i] = b[j];
			i++;
		}		
	}
	int []  getMergeArray()
	{
		return c;
	}
}
public class MergeArrayApp
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);

		System.out.printf("\nEnter a size of array : ");
		int size1 = in.nextInt();
		int array1[] = new int[size1];
		System.out.printf("\nEnter a values of array1 : ");
		input(array1, in);
		
		System.out.printf("\nEnter a size of array2 : ");
		int size2 = in.nextInt();
		int array2[] = new int[size2];
		System.out.printf("\nEnter a values of array2 : ");
		input(array2, in);
		
		System.out.printf("\nDisplay array1 : \n");
		display(array1);
		System.out.println();
		System.out.printf("\nDisplay array2 : \n");
		display(array2);

		MergeArray ma = new MergeArray();
		
		ma.setArray(array1, array2);
		ma.performMerge();
		

		System.out.printf("\nDisplay array3 : \n");
		display(ma.getMergeArray());
		
		
		
	}
	public static void input(int a[], Scanner in)
	{
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("Enter a %d value of array : ", i+1);
			a[i] = in.nextInt();
		}
	}
	public static void display(int a[])
	{
		for(int i=0; i<a.length; i++)
		{	
			System.out.print( a[i] + " ");
		}
	}
}