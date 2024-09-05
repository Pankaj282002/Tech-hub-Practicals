import java.util.*;
class MobileNumberPattern
{
	public static void main(String pankaj[])
	{
 		Scanner in = new Scanner(System.in);
		int MoNum[] = new int[10];
		System.out.printf("\nEnter a Mobile Number : ");
		for(int i=0; i<MoNum.length; i++)
		{
			MoNum[i] = in.nextInt();
		}
	
		Star(MoNum);
		hash(MoNum);
		evenStar(MoNum);
	}
	public static void Star(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			
				System.out.printf("%d", a[i]);
			
		}
		System.out.println();
	}

	public static void hash(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<4 && a[i]>7)
			{
				System.out.printf("%d", a[i]);
			}else{
				System.out.printf("#");
			}
		}
		System.out.println();
	}

	public static void evenStar(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.printf("*");
			}else{
				System.out.printf("%d", a[i]);
			}
		}
	}
}