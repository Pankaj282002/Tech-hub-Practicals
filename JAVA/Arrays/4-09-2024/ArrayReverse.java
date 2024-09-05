import java.util.*;
public class ArrayReverse
{
   public static void main(String x[])
       { 
          Scanner xyz=new Scanner(System.in);
           int a[]=new int[5],len,mid,end,i;
           System.out.println("Enter the array values:");
            for(i=0;i<a.length;i++)
            {
                    a[i]=xyz.nextInt();
            }
           len=a.length;
            mid=len/2;
           end=len-1;
            for(i=0;i<mid;i++)
             {
                     int temp=a[i];
                            a[i]=a[end];
                            a[end]=temp;
                             end--;
            }
         System.out.println("Display after reverse:");
            for(i=0;i<a.length;i++)
            {
                 System.out.println(a[i]);    
            }
     }
}