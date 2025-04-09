import java.util.*;
public class palindrom {
    public static void main(String pankaj []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int temp = num;
        int rev=0;
        while(temp>0){
            int lastDigit = temp%10;
            rev = rev*10 + lastDigit;
            temp = temp/10;
        }
        if(num==rev){
            System.out.println(num + " is a palindrome");
        }else{
            System.out.println(num + " is not a palindrome");
        }
    }
}
