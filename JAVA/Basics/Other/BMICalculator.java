// BMI calculator 
import java.util.*;
public class BMICalculator{
	public static void main(String x[]){

		Scanner in = new Scanner(System.in);
		System.out.printf("Enter a height in cm : ");
		double height = in.nextFloat();
		System.out.print("Enter a weight in kg : ");
		double weight = in.nextFloat();
		System.out.print("Enter  gender : ");
		char gender = in.next().charAt(0);
		
		height = height * 0.393701;
		weight = weight/2.2;
		double BMI = weight / Math.pow(height,2) * 703;
		String result = (gender == 'm' && BMI < 18.5 ) ? "Underweight" : (gender == 'm' &&  BMI >=18.5 && BMI <=24.9) ? "Healthy" : "Overweight";
	
		System.out.printf("Your BMI is : %f\n", BMI);
		System.out.printf("You are %s ", result);



}
}