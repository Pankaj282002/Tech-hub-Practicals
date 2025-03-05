public class Sfirst{
	public static void main(String pankaj[]){
		int arr [] = {10,3,5,6,2};
		System.out.print("[");
		for(int i=0; i<arr.length; i++){
			int sum=1;
			for(int j=0; j<arr.length; j++){
				if(i!=j){
					sum*=arr[j];
				}
			}
			System.out.printf("%d,",sum);
		}System.out.print("]");
	}
}