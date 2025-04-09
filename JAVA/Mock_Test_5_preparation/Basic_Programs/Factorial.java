import java.util.*;
public class Factorial {
    public static void main(String pankaj []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int fact = 1;
        for(int i=num; i>=2; i--){
            fact+=i;
        }
        System.out.printf("Factorial of %d is : %d \n", num, fact);
        
    }
}
