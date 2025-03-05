public class first{
	public static void main(String pankaj[])
	{
	for(int i=0; i<6; i++)
	{
		boolean flag = true;
		for(int j=0; j<=10; j++){
			if(j>=(5-i) && j<=(5+i)){
				if(flag){
					System.out.printf("%d", i+1);
					flag=false;
				}else{
					System.out.print(" ");
					flag=true;
				}
			}else{
				System.out.print(" ");
			}
		}System.out.println();
	}
	}
}