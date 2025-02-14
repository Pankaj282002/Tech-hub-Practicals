// 3. WAP to create the class Employee with a following methods  

import java.util.*;
class Employee 
{   
	String Ename;
	int Eid, Esal;
	void setPersonalInfo(String name,int id,int basicSal) 
    	{ 	
		Ename = name;
		Eid = id;
		Esal = basicSal;	
    	}
    	void setProgressPer(int progress) 
    	{ 
		//if progress value is greater than 60 per then increase the basic salary of  
     		 //employee with 30 percentage  
    	}
    	void show() 
    	{
		//in this function we need to show the all details of employee like as  
    		 //name id and basic salary as well as incremental salary and total salary of employee 
    	}
}
public class Employee_Increment
{ 
    	public static void main(String x[]) 
    	{  
		Scanner in = new  Scanner(System.in);
		System.out.printf("\nEnter a name of employee : ");
		String name = in.nextline().charAt(0);
		System.out.printf("\nEnter a name of employee : ");
		int id = in.nextInt();
		System.out.printf("\nEnter a name of employee : ");
		int salary = in.nextInt();
		
		
		// here create the object of Scanner class and accept the name id and basic salary as well  
       		//progress per value not need to calculate it by using formual directly enter e.g 70  
      		//means 70% 
      		//create the object of Employee class and call setPersonalInfo and pass name id and salary 
     		// in it as well as setProgressPer() and pass progress value in it 
    		//call the show() method of Employee class. 
    	}
}