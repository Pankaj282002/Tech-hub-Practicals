class II
 {
 	public static void main(String args[])
	{
 		int x = 2;
 		int y = 0;
 		for ( ; y < 10; ++y) 
 		{
 			if (y % x == 0) 			// this if statement apply on even numbers.
 				continue;			// this if continue keyword is skip this loops
 			else if (y == 8)
				break;			// break keyword is break the loop the loop.
 			else
 				System.out.print(y + " ");	// print value of y 
 		}
	} 

}

/*
Output :- 1 3 5 7 9
*/
