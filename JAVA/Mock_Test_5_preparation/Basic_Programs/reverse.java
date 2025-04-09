import java.util.*;
public class reverse {
    public static void main(String pankaj []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int temp = num;
        int rev = 0;
        while(temp !=0){
            int rem = temp % 10;
            rev = rev*10 + rem;
            temp = temp / 10;
        }
        System.out.printf("%d reverse of %d ", rev, num);
    }
}
