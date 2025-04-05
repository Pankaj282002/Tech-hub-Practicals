// Q1. Basic ArrayList Operations & Create an ArrayList of integers,
//  case 1: add some elements
//  case 2: print the list
//  case 3: remove an element at a specific index.
import java.util.*;
public class AddANDPrint{
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        do{
            System.out.println("...............Array List.................... ");
            System.out.println("1. Add elements");
            System.out.println("2. Print the list");
            System.out.println("3. Remove an element");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.print("Enter the number of elements you want to add: ");
                int n = sc.nextInt();
                myList.add(n);
                break;
                case 2:
                System.out.println("ArrayList elements: " + myList);
                break;
                case 3:
                System.out.print("Enter the index of the element you want to remove: ");
                int index = sc.nextInt();
                if (index >= 0 && index < myList.size()) {
                    myList.remove(index);
                    System.out.println("Element removed successfully.");
                } else {
                    System.out.println("Invalid index.");
                }
                break;
                case 4:
                System.out.println("Exiting...");
                return;
                default:
                System.out.println("Invalid choice");
                break;
            }
        }while(true);
    }
}
