public class V
{
	public static void main(String[] args)
	{
 		int i = 1;
 		while (i <= 3)					// 1 || 2 || 3 || 4
		{
 			int j = 1;
 			while (j <= 2) 				// 1 || 2 || 3
			{
 				System.out.println(i * j);
 				j++;				// 1 || 2 || 3
 			}
 			i++;					// 1 || 2 || 3 || 4
 		}
	}
}

/*
Output :-

1
2
2
4
3
6

*/
