import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class RealEstateAgent {
	/*
	 * 
	//*** ArrayLists that I used.
	private ArrayList<Agency> agencyArray = new ArrayList<Agency>();	
	private ArrayList<RealEstateListing> listingsFromOneAgency = new ArrayList<RealEstateListing>();
	private ArrayList<RealEstateListing> finalArrayListOfRealEstateListings = new 
ArrayList<RealEstateListing>();
	private String answerSoFar = "";
	private Agency century21 = null;
	private Agency reMax = null;
	private Agency mcEnearney = null;
	private Agency longAndFoster = null;

	public RealEstateAgent()
	{	
       Create real-estate companies here.  
       Give them a name and pass in their text file. 
       Here is the code.
       century21 = new Agency("Century 21","Century21.txt");
	}
	public String listingsChosen()
	{
		getAgenciesForTheExhibition();//*** this is an ArrayList
		//*** I read a String and used a Scanner instance to scan a string 
       //*** for the integers integers. See handout for an example of this.
		homeCriterion = pickHomeCriterion();
		switch (homeCriterion)
		{
		case 1:// Style
			int style = getStyle();
			finalArrayListOfRealEstateListings = style(style, agencyArray);
			break;
		
		default:
			System.out.println("bad topic Selection choice " + homeCriterion);
			System.exit(0);
		}// switch
	//*** I have a method that creates a string of the agencies used.
	//*** I have a method that takes the final list of homes  
	//*** and puts them in a string that is returned. 

	
	public int getStyle()
	{
	}
	public ArrayList<RealEstateListing> style(int styleType, ArrayList<Agency> agencyArray)
	{
       //*** ask each agency to give a list that satisfies the requested style.
	}

       //*** For each criteria there are similar pairs of methods.	
	//*** Work on each pair one pair at a time and make them 
       //*** work before you do the next pair.
	 */
	private ArrayList<Agency> agencyArray = new ArrayList<Agency>();	
	private ArrayList<RealEstateListing> listingsFromOneAgency = new ArrayList<RealEstateListing>();
	private ArrayList<RealEstateListing> finalArrayListOfRealEstateListings = new ArrayList<RealEstateListing>();
	private String answerSoFar = "";
	private Agency century21 = null;
	private Agency reMax = null;
	private Agency mcEnearney = null;
	private Agency longAndFoster = null;
	private Object homeCriterion;
	Scanner keyboard = new Scanner(System.in);
	public RealEstateAgent() {
		
	}
	public RealEstateAgent(Agency century21) {
		century21 = new Agency("Century 21" , "Century21.txt");
	}
	/*public RealEstateAgent11()
	{	
     /*  Create real-estate companies here.  
       Give them a name and pass in their text file. 
       Here is the code.
       *
		
       
       reMax = new Agency("ReMax" , "ReMax.txt"); 
       mcEnearney = new Agency( "McEnearney" , "McEnearney.txt"); 
       longAndFoster = new Agency("Long and Forster" , "LongAndFoster.txt");
       
	}*/
	public String listingsChosen()	{
		getAgenciesForTheExhibition();//*** this is an ArrayList
		//*** I read a String and used a Scanner instance to scan a string 
       //*** for the integers integers. See handout for an example of this.
		homeCriterion = pickHomeCriterion();
		switch ((Integer)homeCriterion)
		{
		case 1:// Style
			int style = getStyle();
			//finalArrayListOfRealEstateListings = style(style, agencyArray);
			break;
			
		
		default:
			System.out.println("bad topic Selection choice " + homeCriterion);
			System.exit(0);
		}// switch
	//*** I have a method that creates a string of the agencies used.
	//*** I have a method that takes the final list of homes  
	//*** and puts them in a string that is returned. 
		return ""; 
	}
	private int pickHomeCriterion() {
		int selection = 0; 
		System.out.println("1) Style"); 
		System.out.println("2) Number of Bathroom");
		System.out.println("3) Lot Size");
		System.out.println("4) Age");
		System.out.println("5) Distance From Work"); 
		System.out.println("6) Jurusdation"); 
		return selection = keyboard.nextInt() ;
	}
	private void getAgenciesForTheExhibition() {
		System.out.println("Pick an Agency\n1) Century 21\n2) Long and Foster\n3) McEnearney\n4) ReMax");
		agencyArray.add(century21);
		agencyArray.add(longAndFoster);
		agencyArray.add(mcEnearney);
		agencyArray.add(reMax);
		
		int option = keyboard.nextInt(); 
		agencyArray.get(option-1); 
	}
	public int getStyle()	{
		System.out.println("1) TownHouse");
		System.out.println("2) Colonial");
		System.out.println("3) Remble ");
		System.out.println("4) Georgian");
		System.out.println("5) Split Level");
		System.out.println("6) Cape Cod");
		System.out.println("7) Condomnium");
		
		int answer = 0;
		return  answer = keyboard.nextInt(); 	
	}
	public ArrayList<RealEstateListing> style(int styleType, ArrayList<Agency> agencyArray)
	{
		RealEstateListing TownHouse = new RealEstateListing("TownHouse"); 
		RealEstateListing colonial = new RealEstateListing(); 
		RealEstateListing remble =null; 
		RealEstateListing georgian = null; 
		RealEstateListing splitLevel = null; 
		RealEstateListing capeCod = null; 
		RealEstateListing condominium = null;
		ArrayList<RealEstateListing> style = new ArrayList<RealEstateListing>(); 
		style.add(TownHouse);
		style.add(TownHouse); 
		style.add(colonial); 
		style.add(remble);
		style.add(georgian);
		style.add(splitLevel);
		style.add(capeCod);
		style.add(condominium);
		return (style) ;
       //*** ask each agency to give a list that satisfies the requested style.
	}
}
