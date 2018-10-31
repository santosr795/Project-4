import java.io.PrintWriter;
import java.util.Scanner;

public class StudentsWithFiles extends Student{

	public void readInputFile(Scanner readInput )
	{	
		String input;
		input = readInput.nextLine();
		//System.out.println("first name is: "+ input);
		setFirstName (input);
		
		input = readInput.nextLine();
		setLastName(input); 
		input = readInput.nextLine();
		setAddress(input); 
		input = readInput.nextLine(); 
		setPhoneNumber(input); 
		input = readInput.nextLine(); 
		setLateFee(input);
		input = readInput.nextLine(); 
		setInState(input);
		input = readInput.nextLine();
		setHealthCare(input);
		input = readInput.nextLine(); 
		setHealthCare(input);
		input = readInput.nextLine(); 
		setMealPlan(Integer.parseInt(input)); 
		input = readInput.nextLine();
		setCredits(Integer.parseInt(input)); 
	}
	public void writeOutputFile( PrintWriter textStream)
	{
		textStream.println("Name " + getFirstName() + " "  + getLastName());
		textStream.println("Address " + getAddress());
		textStream.println("Phone " + getPhoneNumber());
		textStream.println("LateFee " + getLateFeeString());
		textStream.println("In or Out State " + getInOutState());
		textStream.println("In Campus Food Plan " + getOnCampusFood());
		textStream.println("Type of meal plan " + getPlanMealSelection());
		textStream.println("Credits " + getCredits());
		textStream.println("");
	}
		
}
