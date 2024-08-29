class numpattern
{
	public static void main(String pankaj[])
	{
		
		for(int i=1; i<=9; i++){
		int count = 0;
			for(int j=1; j<=18; j++)
			{
				
				if(j>=(10-i) && j<=(8+i)){
					if(j<=9){
						count++;
					}else{
						count--;
					}
				System.out.printf(" %d ", count);
					
				}
			}
		System.out.println();
		}
	}
}