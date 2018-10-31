

import java.io.*;
import java.util.Scanner;
public class UniversityDemo
{

public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scanner scanFile = TextFileIO.createTextRead("in.txt");
        PrintWriter outStream = TextFileIO.createTextWrite("out.txt");
        UniversityWithFiles clerk = new UniversityWithFiles( );
        StudentsWithFiles person = new StudentsWithFiles();// one student
        String junk;
        int numberOfStudents, i, count;
                System.out.println("Enter number of students:");
         numberOfStudents = scan.nextInt( );
        for(i = 1; i <= numberOfStudents; i++)
         {
            count = i;
                    person.readInputFile(scanFile);
                    person.calculateData();
                    person.writeOutputFile(outStream );
                    person.writeOutput();
                    clerk.collectDataForSchoolReport(person);

        }
        System.out.println();
        clerk.printDataForSchoolReport();
        clerk.printDataSchooltFile(outStream);
        outStream.close( );
        scanFile.close();
    }

    }
