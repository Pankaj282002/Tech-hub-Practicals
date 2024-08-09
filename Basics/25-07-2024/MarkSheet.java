//  Q7. write a java program to enter marks of five subjects and calculate total marks and percentage .

import java.util.Scanner;
public class MarkSheet {

    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);

     
        System.out.print("\nEnter marks of English : ");
        int english = input.nextInt();

        System.out.print("Enter marks of Marathi : ");
        int marathi = input.nextInt();

        System.out.print("Enter marks of Hindi : ");
        int hindi = input.nextInt();

        System.out.print("Enter marks of Mathematics : ");
        int math = input.nextInt();

        System.out.print("Enter marks of Science : ");
        int science = input.nextInt();

       
        int obtainedMarks = english + marathi + hindi + math + science;

       
        int totalMarks = 500;

      
        float percentage = (obtainedMarks / (float) totalMarks) * 100;  

      
        System.out.printf("\nTotal marks : %d", totalMarks);
        System.out.printf("\nTotal marks obtained : %d", obtainedMarks);
        System.out.printf("\nPercentage is : %.2f%%", percentage); 
      
        input.close();
    }
}