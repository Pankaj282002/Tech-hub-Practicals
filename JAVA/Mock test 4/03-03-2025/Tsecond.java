import java.util.*;
public class Tsecond{
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = in.nextLine();
		System.out.print("Enter a String : ");
		String str1 = in.nextLine();
		boolean flag = false;
		for(int i=0; i< str.length(); i++){
		 for(int j=0; j< str1.length(); j++){
		 	if(str.charAt(i) == str1.charAt(j)){
		 		flag = true;
		 		break;
		 	}
		 }
	}
	if(!flag){
		 	System.out.println("String are Anagram");
		 }else{
		 	System.out.println("String are not Anagram");
		 }

	}
}
