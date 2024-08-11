import java.util.*;
public class primeNum{

	public static void main(String x[]){
	Scanner in = new Scanner(System.in);
	System.out.printf("\nEnter a number : ");
	int num = in.nextInt();
	int check = 0;
	boolean flag = true;
	for(int i = 2; i<num; i++){

	for(int j = 2; j<i; j++){
	int tempNum = i%j;
		if(tempNum==0){
		flag = false;
		}	
	}
	if(flag){
		System.out.printf("%d \t", i);
	}
	}
	
	
}
}