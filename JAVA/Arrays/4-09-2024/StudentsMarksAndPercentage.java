import java.util.*;
class StudentsMarksAndPercentage
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		int array[] = new int[6];
		int total = 0;
		double percentage;
		
		for(int i=0; i<array.length; i++)
		{
			System.out.printf("Enter a %d subject marks : ", i + 1);
			array[i] = in.nextInt();
			total = total + array[i];
		}
		 
		percentage = (double)total/600*100;

		System.out.printf("Total marks : %d \n", total);
		System.out.printf("Percentage : %.2f\n", percentage);
		
	}
}