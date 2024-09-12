import java.util.*;
class EvenOddArraySepration
{
		public static void main(String pankaj[])
		{
			Scanner in = new Scanner(System.in);
			int array[] = new int[10];

			System.out.printf("\nEnter a values of array.\n");		
			for(int i=0; i<array.length; i++)
			{
				System.out.printf("Enter %d element of array : ", i+1);
				array[i] = in.nextInt();
			}

			int evenCount = EvenArrayLength(array);
			int oddCount = OddArrayLength(array);			
			int evenArray[] = new int[evenCount];
			int oddArray[] = new int[oddCount];
			
			SaprateArray(array, evenArray, oddArray);
			
			System.out.printf("\nDid you want to sorte array.\n");
			System.out.println("Asending order press : 1");
			System.out.println("Default order press  : 2");
			System.out.printf("Enter a choise       : ");
			int choise = in.nextInt();
			if(choise == 1)
			{	
				System.out.printf("\nArray display in ascending order : ");
				sorteArray(array);
				sorteArray(evenArray);
				sorteArray(oddArray);
			}
			else{
				if(choise!=2)
				{
					System.out.printf("\nYou choise invalid choise. Array is display in default order.");
				}
				System.out.printf("\nArray display in default order : ");
			}

			System.out.printf("\nOriginal Array : ");
			displaArray(array);
			System.out.printf("\nEven Array     : ");
			displaArray(evenArray);
			System.out.printf("\nOdd Array      : ");
			displaArray(oddArray);
			System.out.println();
			
		}
		public static int EvenArrayLength(int a[])
		{	int evenCount = 0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]%2 == 0)
				{
					evenCount++;
				}
			}
			return evenCount;
		}
		
		public static int OddArrayLength(int a[])
		{	int oddCount = 0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]%2 != 0)
				{
					oddCount++;
				}
			}
			return oddCount;
		}

		public static void SaprateArray(int a[], int e[], int o[])
		{	int ecount = 0;
			int ocount = 0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]%2 == 0)
				{
					e[ecount] = a[i];
					ecount++;
				}else{
					o[ocount] = a[i];
					ocount++;
				}
			}
		}
		public static void sorteArray(int a[])
		{
			for(int i=0; i<a.length -1; i++)
			{
				if(a[i] > a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					i = -1;
				}
			}
		}
		public static void displaArray(int a[])
		{
			for(int i=0; i<a.length; i++)
			{
				System.out.printf(" %d ", a[i]);
			}
		}
		
}