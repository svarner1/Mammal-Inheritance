//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 21
//=======================================

/*This class is a child of the parent, superclass "human." It creates a "Student" object which is also a "human" object.
 * The class creates fields for the student's major, gpa, and credit hours.
 * These values are set in the Student constructor. The class also includes getter methods
 * for the gpa, major, and student year.
 */
public class Student extends Human{
	
	private String major;
	private double gpa;
	private int creditHours;
	
	//This creates the student object. Parameter from the Human class are used (weight, age, height) along with the parameters for major gpa and credit hours)
	public Student(float weight, int age, double height, String major,  double gpa, int creditHours) {
		//The super method calls the human class' constructor, which creates a human object for the student
		super(weight, age, height);
		this.major = major;
		this.gpa = gpa;
		this.creditHours = creditHours;	
	}
	
	//This returns the student's major
	public String getMajor() {
		return this.major;
	}
	
	//This returns the student's gpa
	public double getGpa() {
		return this.gpa;
	}
	
	//this method returns freshman, sophomore, junior, or senior year based on the student's credit hours
	public String getYear() {
		if( creditHours < 32) //freshman, less that 32 credit hours
			return "freshman";
		else if( creditHours >= 32 && creditHours < 64) // sophomore 32-64 credit hours
			return "sophomore";
		else if( creditHours >= 64 && creditHours< 96 ) // junior less than 96 credit hours
			return "junior";
	    else //senior is at least 96 credit hours
	    	return "senior";
	}
}
