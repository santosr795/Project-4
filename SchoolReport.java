
public class SchoolReport {
	private int NumberStudents = 0;
	University report = new University(); 
	public void collectDataForSchoolReport(StudentsWithFiles person) {
		report.collectDataForReport(person);
	}
	public void printDataForSchoolReport() {
		report.printDataForSchoolReport();
	}
}
