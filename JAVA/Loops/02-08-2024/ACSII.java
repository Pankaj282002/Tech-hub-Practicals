import java.util.*;
public class ACSII{
public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = in.nextInt();
	
	char alfa = (char) num;
	System.out.printf("ACSII value of %d is %c",num, alfa);

}
}