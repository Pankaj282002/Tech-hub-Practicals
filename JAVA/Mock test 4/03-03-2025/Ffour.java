import java.util.*;
public class Ffour{

	public static void main(String x[]){
	boolean flag = true;
	for(int num =0; num>=100; num++){
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
}
