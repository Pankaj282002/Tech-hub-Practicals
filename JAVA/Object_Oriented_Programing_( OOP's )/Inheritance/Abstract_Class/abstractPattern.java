abstract class Pattern {
    abstract void display();
}

class First extends Pattern {
   
    void display() {
    	System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print(" " +i+" ");
                } else {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}

public class abstractPattern{
    public static void main(String pankaj []) {
        First firstPattern = new First();
        firstPattern.display();
    }
}