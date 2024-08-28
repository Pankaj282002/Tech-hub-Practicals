import java.util.*;

class abc{
public  static void even(int num)
{
System.out.println("Even Numbers");
	for(int i=1; i<=num; i++){
		if(i%2==0)
		
		System.out.print(i+" ");
	}
}
public static void odd(int num)
{
System.out.printf("\nOdd Numbers\n");
	for(int i=1; i<=num; i++)
	{
		if(i%2 != 0){
			
			System.out.print(i+" ");
		}
	}
}
}
class evenNum{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = in.nextInt();

		abc sc = new abc();
		sc.even(a);
		sc.odd(a);
	}
}