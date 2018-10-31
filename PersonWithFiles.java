import java.util.Scanner;
import java.io.*;
public class PersonWithFiles extends Person
{
	public PersonWithFiles()
	{	
		super();  
	}
	public void readInputFile(Scanner readInput )
	{	
		String input;
		input = readInput.nextLine();
		System.out.println("first name is: "+ input);
		setFName (input);
	}
	public void writeOutputFile( PrintWriter textStream)
	{
		textStream.println("Name " + getFName());}
}
