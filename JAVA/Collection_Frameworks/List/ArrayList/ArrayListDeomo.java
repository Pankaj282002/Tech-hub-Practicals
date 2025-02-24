import java.util.*;

public class ArrayListDeomo {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        System.out.println("ArrayList: " + arr.isEmpty());
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        arr.add(500);
        arr.add(2, 700);
        System.out.println("ArrayList: " + arr);
        arr.remove(2);
        System.out.println("Value check : " + arr.contains(300));
        System.out.println("ArrayList: " + arr.isEmpty());
        System.out.println("ArrayList Size : " + arr.size());
        System.out.println("Index of : " + arr.indexOf(400));
    }
}
