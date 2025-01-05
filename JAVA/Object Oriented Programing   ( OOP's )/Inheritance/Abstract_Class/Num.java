import java.util.*;
abstract class Num {
    int no;
    void setNum(int no) {
        this.no = no;
    }

    abstract int getResult();
}

class RevNumber extends Num {
    
    int getResult() {
        int rev = 0;
        int temp = no;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return rev;
    }
}

class CountDigit extends Num {
    
    int getResult() {
        int count = 0;
        int temp = no;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a Number : ");
    	int num = in.nextInt();
    	
        RevNumber revNum = new RevNumber();
        revNum.setNum(num);
        int reversedNum = revNum.getResult();
        System.out.println("Reversed number: " + reversedNum);

        CountDigit countDigit = new CountDigit();
        countDigit.setNum(12345);
        int digitCount = countDigit.getResult();
        System.out.println("Digit count: " + digitCount);
    }
}