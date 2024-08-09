import java.util.*;
public class TvVolume{
	public static void main(String x[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter values of volume change start to end.");
		int start = in.nextInt();
		int end = in.nextInt();
			
	
			if(start < end ){
				int temp = end - start;
				System.out.printf("Chef can press volume up button %d times to increase the volume from %d to %d. ", temp, start, end);
			}
			else if(start > end ){
				int temp = start - end;
				System.out.printf("Chef can press volume down button %d times to decrease the volume from %d to %d.", temp, start, end);
			}
		}
}