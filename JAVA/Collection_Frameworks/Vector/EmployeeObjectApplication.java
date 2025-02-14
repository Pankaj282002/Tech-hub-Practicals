import java.util.*;
class Employee {
    private int id;
    private String name;
    private int sal;

    // Constructor
    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }
}

public class EmployeeObjectApplication {
    public static void main(String[] args) {
        Vector v = new Vector();

        do {
            Scanner xyz = new Scanner(System.in);
            System.out.println("Enter name, id, and salary of employee:");
            String name = xyz.nextLine();
            int id = xyz.nextInt();
            int sal = xyz.nextInt();
            v.add(new Employee(id, name, sal));
            xyz.nextLine(); // Consume the remaining newline character
            System.out.println("Do you want to continue? (yes/no)");
            String msg = xyz.nextLine();
            if (msg.equalsIgnoreCase("no")) {
                break;
            }
        } while (true);

        System.out.println("\nEmployee Details:");
        for (Object obj : v) {
            Employee e = (Employee) obj;
            System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
        }
    }
}
