class commanNum
{
	public static void main(String pankaj[])
	{
		int arr1[] = {25, 30, 35, 40, 45};
		int arr2[] = {10, 20, 30, 40, 50};
		boolean flag;

		System.out.printf("\nCommon values is : ");
		for(int i=0; i<arr1.length; i++)
		{
			flag = false;
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					flag = true;
				}
			}
		if(flag){
			System.out.printf("%d, ", arr1[i]);
		}
		}
		
	}
}