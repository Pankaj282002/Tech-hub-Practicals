import java.util.*;
public class HappyNowhile
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner (System.in);
		int no,r=0,sum;
    		System.out.println("Enter no:");
  		no=xyz.nextInt();
    
      		while(no>0)
    		{
			 sum=0;
      			while(no>0)
     			{
        				 r=no%10;
        				 sum=r*r+sum;
         				no=no/10;     
				no=sum;				

     			}
     			if(sum==1)
     			{
         				System.out.println("Happy Number");
        				 break;
      			}  
     
    			else
    			{ 
        				System.out.println("Not Happy Number");
        				break;
    			}
			
    		}
 	 }
}