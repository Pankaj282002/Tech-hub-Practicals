public class III
 {
 	public static void main(String[] args) 
	{
		System.out.println();
 		int i = 1;
 		while (i <= 2) 					// 1 || 2 || 3
		{
 			int j = 1;
 			while (j <= 3)				// 1 || 2 || 3 || 4 &&  1 || 2
			 {
 				if (i == 2 && j == 2) break;		// when  i==2 and j==2 it's stop the loop.
 				System.out.println(i + " " + j);		// printing i and j
 				j++;
 			}
 			i++;
 		}
	}
}

/*
Output :- 

1 1
1 2
1 3
2 1

*/
