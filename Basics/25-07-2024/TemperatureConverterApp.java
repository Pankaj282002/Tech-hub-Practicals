// Q3. write a java program to enter temperature in fahrenheit and conver to celsius. 

public class TemperatureConverterApp{

	public static void main(String x[]){

	int fahrenheit = Integer.parseInt(x[0]);
	int celsius = (fahrenheit - 32)*5/9;

	System.out.printf("fahrenheit is : %d \ncelsius is : %d ", fahrenheit, celsius);

}
}