import java.util.Scanner;
public class PairWithGivenSum
{
	public static void main(String pankaj[]) 
	{
        		Scanner scanner = new Scanner(System.in);
        		System.out.print("Enter the size of the array: ");
     		int n = scanner.nextInt();	
        		int arr[] = new int[n];

        
        		System.out.println("Enter " + n + " elements in the array:");
        		for (int i = 0; i < n; i++) 
		{
            			System.out.print("Element - " + i + ": ");
            			arr[i] = scanner.nextInt();
       		 }

      
        		System.out.print("Enter the target sum: ");
        		int targetSum = scanner.nextInt();

       
        		boolean foundPair = false;
        		for (int i = 0; i < n - 1; i++) 
		{
            			for (int j = i + 1; j < n; j++) 
			{
                				if (arr[i] + arr[j] == targetSum) 
				{
                    				foundPair = true;
                    				System.out.println("Pair of elements can make the given sum by the value of index " + i + " and " + j);
                    				break;
                				}
            			}
            			if (foundPair) 
			{
                				break;
            			}
       	 	}

     
        		if (!foundPair) 
		{
            			System.out.println("No pair of elements can make the given sum.");
       	 	}
    	}
}