import java.util.*;
public class RealEstateListing {
/*
 *  //*** instance variables go here.
	
	public void readRealEstateListing(Scanner read)
	{
		//*** Read a listing.
		//*** Set the instance variables. 		
	}
	//*** I have a complete set of getters and setters created by Eclipse
	
	public String toString()
	{
		
	}	
 */
	private String homeStyle = ""; 
	private int numberOfBathroom = 0;
	private int lotSize = 0; 
	private int houseAge = 0; 
	private int distanceFromWork = 0; 
	private String jurisdation = ""; 
	RealEstateListing(){
		super(); 
		 
	}
	RealEstateListing(String style){
		homeStyle = style; 
	}

	public void readRealEstateListing(Scanner read) {
		
		
		
	}
	public void setStyle(String style) {
		homeStyle = style; 
	}
	public void setNumberOfBathroom(int numBathroom) {
		numberOfBathroom = numBathroom; 
		
	}
	public void setLotSize(int lot_Size) {
		lotSize = lot_Size; 
	}
	public void setHouseAge(int house_Age) {
		houseAge = house_Age; 
		
	}
	public void setDistanceFromWork(int distanceFrom_Work) {
		distanceFromWork = distanceFrom_Work; 
	}
	public void setJurisdation(String Jurisdation) {
		jurisdation = Jurisdation; 
	}
	public String getStyle() {
		return homeStyle; 
	}
	public int getNumberOfBathroom() {
		return numberOfBathroom ; 
	}
	public int getLotSize() {
		return lotSize;
	}
	public int getHouseAge() {
		return houseAge;
		
	}
	public int getDistanceFromWork() {
		return distanceFromWork;
	}
	public String getJurisdation() {
		return jurisdation; 
	}
	public String toString() {
		return "" ; 
	}

}
