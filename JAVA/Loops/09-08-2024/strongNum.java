import java.util.*;
public class strongNum{
public static  void main(String x[]){
Scanner in = new Scanner(System.in);
System.out.printf("Enter a Number : ");
int num = in.nextInt();
int strong=0;
int temp = num;

while(num!=0){

	int digit = num%10;
	int fact=1;

	for(int i = 1; i<=digit; i++){
		fact = fact * i;
		
	}
	strong = strong + fact;
	num = num/10;
	}

	if(strong == temp){
	System.out.println("\nThe number is Strong Number");
	}
	else{
	System.out.println("The number is Not a Strong Number");
	}
     }
}