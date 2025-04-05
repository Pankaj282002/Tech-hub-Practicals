package Mock_Test_5_preparation.Basic_Programs;
import java.util.*;
public class SumOfNumbers {
    public static void main(String pankaj[]) {
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum is : " + sum);
    }
}