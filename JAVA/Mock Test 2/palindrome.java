import java.util.*;
class palindrome
{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("\nEnter a number : ");
		int num = in.nextInt(); 	// 232
		int temp = num; 		// 232
		int rev=0;

		while(num!=0){		
			
			int LD = num%10;	// Last Digit extract
			rev=(rev*10)+LD;	// add last digit in rev num
			num/=10;		// remove last digit from num
		}
	if(rev==temp){			// check reverse number is equal to orignal number. if it is same its a palindrome number otherwise its not a palindrome number.
			
			System.out.printf("%d is  a palindrom number.", temp);
		}else
		{
			System.out.printf("%d is not a palindrom number.", temp);
		}
	}
}