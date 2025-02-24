import java.util.*;

public class second_constructor {
    public static void main(String pankaj[]) {
        // this is a second constructor of Vector class which take a single parameter
        // parameter. for declaring custom size of vector acording to user requrment.
        Vector v = new Vector(5); // this constructor makes a vector of 5 elements

        // The third form creates a vector whose initial capacity is specified by size
        // and whose increment is specified by incr.
        // Vector v = new Vector(5, 2); // this constructor makes a vector of 5 elements
        // with initial capacity of 5 and increment of 2.

        System.out.println("Vector Capacity is : " + v.capacity());
        v.add("Steave Rogers");
        v.add("Tony Stark");
        v.add("Brush Banner");
        v.add("Thor Odinson");
        v.add("Cilant Barton");
        v.add("Natasha Romonoff");

        v.add(2, "Dr. Strange");

        System.out.println(v.get(5));
        System.out.println("printing empty vector" + v);
        System.out.println("first Element of vector : " + v.firstElement());
        System.out.println("last Element of vector : " + v.lastElement());
        System.out.println("Vector Capacity is : " + v.capacity());
        System.out.println(v.contains("Tony Stark"));
        v.remove("Dr. Strange");
        System.out.println("printing empty vector" + v);
    }
}
