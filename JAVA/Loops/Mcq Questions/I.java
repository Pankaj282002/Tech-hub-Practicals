class I {
public static void main(String[] args) {
	int i = 1;
	System.out.println();
	while (i != 5) {
		switch (i) { 						// 1 || 2 || 3 || 4 || 5 != 5 loop exit.
			case 1:
				System.out.println("First"); 			// fist loop

			case 2:
				System.out.println("Second");			// fist loop && second loop 
				break;

			case 3:
				System.out.println("Third");			// Third loop

			case 4:	System.out.println("Fourth");			// Third loop && fourth loop
				break;

			case 5:
				System.out.println("Fifth");			

			default:
				System.out.println("Invalid");

			}
			i++;
		}
}
}
/*

compile time error jvm cannot find the file because of we can't declare the class which contain the main() method. if we can declare the class then expected output is following.
output :- 

First
Second
Second
Third
Fourth
Fourth
*/


