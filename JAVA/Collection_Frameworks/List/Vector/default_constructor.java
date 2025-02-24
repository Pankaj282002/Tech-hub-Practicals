import java.util.*;

public class default_constructor{
    public static void main(String[] args) {

        // The first form creates a default vector, which has an initial size of 10
        Vector v = new Vector();

        // check size of vector
        System.out.println("Capacity of vector is : " + v.capacity());

        // adding elements in vector
        v.add("Pankaj");
        v.add("Sani");
        v.add("Gaurav");
        v.add("Harshali");
        v.add("Devyani");
        
        // print vector elements
        System.out.println("values in vector are : " + v);

        // add element in specific indes
        v.add(2, "Pavan");
        System.out.println("values in vector are : " + v);

        // accecss specific index
        System.out.println("Value at 2nd index : " + v.get(2));

        // remove element from vector
        v.remove("Pavan");
        System.out.println("values in vector are : " + v);

        // check if element is already present
        // contains(); method returns boolean value if value is present in vector is
        // return true otherwise it give false value in return.
        System.out.println("Is Harshali present ? : " + v.contains("Harshali"));

        // check size of vector
        System.out.println("Size of vector is : " + v.size());

        // access first and last element of vector
        System.out.println("First element : " + v.firstElement() + " & " + v.lastElement());

    }
}