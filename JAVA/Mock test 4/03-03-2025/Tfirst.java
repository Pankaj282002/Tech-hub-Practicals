import java.util.*;
public class Tfirst{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = in.nextLine();
		String rev = str;
		int i = str.length() -1;
		for(int j=0; j<str.length() -1; j++){
			rev.charAt(str.charAt(i));
			i--;
		}
		if(rev == str){
			System.out.printf("%c is a palindrom.");
		}else{
			System.out.printf("%c is a not palindrom.");
		}
	}
}