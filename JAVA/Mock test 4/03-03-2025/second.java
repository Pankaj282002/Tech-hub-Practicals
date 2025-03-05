public class second{
	public static void main(String pankaj[]){
		for(int i=0; i<6; i++){
			for(int j=0; j<=5-i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<6; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}