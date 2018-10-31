//Demo
import java.io.*;
import java.util.Scanner;
// This demo must be used in Project 7
public class GroupReporterDemo
{
	public static void main(String[] args)
	{
		
		Scanner scan = new  Scanner(System.in);
		Scanner scanFile = TextFileIO.createTextRead("in.txt");
		PrintWriter outStream = TextFileIO.createTextWrite("out.txt");
		int numberOfPersons, i, count;
		GroupReporterWithFiles clerk = new GroupReporterWithFiles( );
		StudentsWithFiles person = new StudentsWithFiles();// one person
		System.out.println("Enter number of persons:");
		numberOfPersons = scan.nextInt();
		for(i = 0; i < numberOfPersons; i++)
		{
			person.readInputFile(scanFile);// from personWithFiles
			 person.calculateData();// from person this can be almost the same but the student classs 
			 // A
			person.writeOutputFile(outStream );// from personWithFiles
			person.writeOutput();// to the screen from person
			clerk.colectDataForReport(person);// from GroupReporter
		}
		System.out.println();
		clerk.printDataForReport();// to the screen from GroupReporter
		clerk.printDataForReportFile(outStream);// to file from GroupReporterWithFiles
		outStream.close( );
		scanFile.close();
	}
}

