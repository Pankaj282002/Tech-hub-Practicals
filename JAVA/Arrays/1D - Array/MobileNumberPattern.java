
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

		System.out.printf("Mo. no                   : ");
		for(int i=0; i<MoNum.length; i++)
		{
			System.out.printf("%d", MoNum[i]);
		}
		System.out.println();
		Star(MoNum);
		hash(MoNum);
		evenStar(MoNum);
	}
	public static void Star(int a[])
	{
		System.out.printf("Mo. no with star pattern : ");
		for(int i=0; i<a.length; i++)
		{
			if(i>2 && i<7)
			{
				System.out.printf("%d", a[i]);
			}else{
				System.out.printf("*");
			}
			
		}
		System.out.println();
	}

	public static void hash(int a[])
	{
		System.out.printf("Mo. no with hash pattern : ");
		for(int i=0; i<a.length; i++)
		{
			if(i>2 && i<7)
			{
				System.out.printf("#");
			}else{
				System.out.printf("%d",a[i]);
			}
		}
		System.out.println();
	}

	public static void evenStar(int a[])
	{
		System.out.printf("Mo. no with mix pattern  : ");
		for(int i=0; i<a.length; i++)
		{
			if(i%2 == 0)
			{
				System.out.printf("%d",a[i]);
			}else{
				System.out.printf("*");
			}
		}
	}
}