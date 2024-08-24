class IV{
	public static void main(String[] args)
	{
 		int i = 0;
 		while (i < 3)								// 0 || 1 || 2 || 3
		{
 			int j = 0;	
		 	while (j < 2)							// 0 || 1 || 2
			{
 				System.out.println(i + " " + j);
 				j++;							// 1 || 2 || 
 			}
		i++;									// 1 || 2 || 3
		}
 	}
}
/*

Output :- 

0  0  
0  1  
1  0  
1  1  
2  0  
2  1

*/