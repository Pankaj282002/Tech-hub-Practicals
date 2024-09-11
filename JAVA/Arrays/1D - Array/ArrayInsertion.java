import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String pankaj[]) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array of size 6
        int arr[] = new int[6];

        // Get input from the user to fill the array
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the index and value to insert
        System.out.print("Enter the index on which value want to be insert: ");
        int index = scanner.nextInt();
        System.out.print("Enter the value which want to store on index: ");
        int value = scanner.nextInt();

        // Insert the element
        insertElement(arr, index, value);

        // Print the modified array
        System.out.println("Modified array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }

    public static void insertElement(int[] arr, int index, int value) {
        // Check if the index is valid
        if (index < 0 || index >= arr.length) {
            System.out.println("Index out of range");
            return;
        }

        // Shift elements to the right starting from the index
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the value at the specified index
        arr[index] = value;
    }
}