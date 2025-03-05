import java.util.*;
public class Sfour{
	public static void main(String pankaj[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size of array : ");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter a values : ");
		for(int i=0; i<size; i++){
			arr[i]=in.nextInt();
		}
		System.out.print("Enter a target : ");
		int target = in.nextInt();
		int count=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
			if(i!=j){
				if((arr[i] + arr[j]) == target){ 
					count++;
				}
				}
			}
		}
		System.out.printf("%d",count/2);
	}
}
