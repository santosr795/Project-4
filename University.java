import java.util.Scanner; 

@SuppressWarnings("unused")
public class University {
	//University totalTution = new University();  
	private double totalTution = 0; 
	private String inOutStateTution; 
	private int inState = 0;
	private int outState = 0;
	private double stuffMealPlan = 0;
	private double iCantStandMealPlan = 0; 
	private double iAmOnADieMealPlan = 0 ;
	private int stuffMealPlanNumbers = 0;
	private int iCantStandMealPlanNumbers = 0; 
	private int iAmOnADieMealPlanNumbers = 0 ;
	private double foodSubTotal = 0; 
	private double lateFee; 
	private double healthCare;
	private double incidentalFee;
	private int numberOfStudent = 0; 
	private double mealPlan;	
	private double Total; 
	
	
	
	Student person = new Student(); 
	Scanner keyboard = new Scanner(System.in);
	public void printDataForSchoolReport() {
		
		System.out.println("Number of Students " + numberOfStudent); 
		System.out.println("InState " + inState); 
		System.out.println("OutState " + outState); 
	
		System.out.println("STUFF-YOUR-FACE "  + stuffMealPlanNumbers + " $" + stuffMealPlan);
		System.out.println("I=CAN'T-STAND-THIS-FOOD " + iCantStandMealPlanNumbers+ " $" + iCantStandMealPlan );
		System.out.println("I'M-ON-A-DIET " + iAmOnADieMealPlanNumbers + " $" + iAmOnADieMealPlan); 
		System.out.println("Meal Plan Total $"+ mealPlan); 
		System.out.println("Tution $" + totalTution); 
		System.out.println("Late Fees $" + lateFee);
		System.out.println("Incedintal Fees $" + incidentalFee);
		System.out.println("Health Care $" + healthCare);
		System.out.println("Total $" + Total); 
		System.out.println("");
	}
	public void collectDataForReport(Student person) {
		numberOfStudent = numberOfStudent + 1; 
		totalTution =  totalTution + person.getTution();
		lateFee = lateFee + person.getLateFee(); 
		mealPlan = mealPlan + person.getMealPlan();
		if(person.getMealPlan() == 4999.00) {
			stuffMealPlanNumbers = stuffMealPlanNumbers+ 1;
			stuffMealPlan = stuffMealPlan + person.getMealPlan();
		}
		else if(person.getMealPlan() == 3499.00) {
			iCantStandMealPlanNumbers = iCantStandMealPlanNumbers + 1;
			iCantStandMealPlan = iCantStandMealPlan + person.getMealPlan();
		}
		else if (person.getMealPlan() == 2599.00){
			iAmOnADieMealPlanNumbers = iAmOnADieMealPlanNumbers + 1; 
			iAmOnADieMealPlan = iAmOnADieMealPlan + person.getMealPlan();
		}
		healthCare = healthCare + person.getHealthCare();
		incidentalFee = incidentalFee + person.getHealthCare();
		inOutStateTution = person.getInOutState(); 
		if(inOutStateTution.equalsIgnoreCase("Yes")) {
			inState = inState + 1; 
			
		}
		else {
			outState = outState + 1; 
		}
		Total = Total + totalTution + lateFee + mealPlan + healthCare + incidentalFee; 
		
}

}