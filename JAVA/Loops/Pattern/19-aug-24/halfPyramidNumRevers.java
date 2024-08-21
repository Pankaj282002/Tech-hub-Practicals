class halfPyramidNumRevers
{
	public static void main(String pankaj[])
	{
		int count,i,j;
		for(i=1; i<=5; i++)
		{	
			count=1;
			for( j=1; j<=9; j++)
			{
			 	if(j>=6-i && j<=4+i)
                                                  	{
                                                         		System.out.printf("%d ",count);
                                                          		if(j<5)
                                                           		{
                                                                  		count++;   
                                                          		}else{
                                                                  		count--;
                                                           		}
                                                     	}
                                                 }
		 System.out.println();
		}
	}

}