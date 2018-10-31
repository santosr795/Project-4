
	import java.util.*;
	import java.io.*;
	public class StudentDemo
	{
	public static void main(String[] args)
	    {
		Scanner keyboard = new Scanner(System.in); 
		University clerk = new University ();
		Student person = new Student();// one student
		int numberOfStudents,i, count;
	 	System.out.println("Enter number of students:");
	 	numberOfStudents =  keyboard.nextInt( );
		for(i = 0; i < numberOfStudents; i++)
	 	{
	   		person.readInput();
	        		person.calculateData(); //This method must call private methods to do the calculations. 
	        		person.writeOutput();
	        		clerk.collectDataForReport(person);
		}
		clerk.printDataForSchoolReport();
	    }
	}


