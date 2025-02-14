import java.util.*;
public class Verification
{
	public static void NameConform(String Name, String ConformName)
	{
		// if(Name.equals(ConformName)){
		// 	System.out.println("Both name are equals");
		// }else{
		// 	System.out.println("Name dosn't match");
		// }
		System.out.println(Name);
		System.out.println(ConformName);
		System.out.println("Both name are equals");
		if(Name == ConformName)
		{
			System.out.println("Both name are equals");
		}
		else{
			System.out.println("Name dosn't match");
		}
	
	}
	public static void main(String pankaj[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String Name = in.next();
		System.out.print("Conform your Name : ");
		String ConformName = in.next();
		
		//System.out.print("Enter your mobile no : ");
		//String MobileNumber = in.nextLine();
		//System.out.print("Conform your mobile no : ");
		//String ConformMobileNumber = in.nextLine();
		
		NameConform(Name, ConformName);
	}
}
