import java.util.*;
class demo{
	public static void main(String x[])
	{
		Scanner in = new Scanner(System.in);

		System.out.printf("\nEnter a Integer : ");
		int num = in.nextInt();

		System.out.printf("\nEnter a String vlaue : ");
		String line = in.nextLine();

		System.out.printf("\nEnter a floating vlaue : ");
		float Num = in.nextInt();

		// System.out.printf("\nEnter a String vlaue : ");
		// String line = in.nextLine().charAt(0);
		

		
		System.out.printf("String : %s", line);
		System.out.printf("Interger : %d", num);
		System.out.printf("Float : %f", Num);
	}
}