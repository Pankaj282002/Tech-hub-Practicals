import java.util.*;
public class SumOfNumbers{
    public static void main(String pankaj []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum+=num;
        }
        System.out.println("Sum : " + sum);
        System.out.println();
    }
}