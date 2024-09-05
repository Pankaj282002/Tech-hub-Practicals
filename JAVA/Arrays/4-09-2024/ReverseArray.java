import java.util.Scanner;

class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[10];
        int revarray[] = new int[10];

        // Input elements for the original array
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %d of the array: ", i);
            array[i] = in.nextInt();
        }

        // Reverse the array
        for (int i = 0; i < array.length; i++) {
            revarray[revarray.length - 1 - i] = array[i];
        }

        // Print the original array
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println(); // New line for separation

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < revarray.length; i++) {
            System.out.printf("%d ", revarray[i]);
        }
        System.out.println(); // New line for separation

        // Close the scanner
        in.close();
    }
}
