//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 21
//=======================================

/* This class is a subclass or child of the parent class "human. It creates a "Doctor" object that is also a 
 * "Mammal" object. The class creates field for the Doctor's number of years practicing and their specialty.
 * The class also includes getters for the fields.
 */
public class Doctor extends Human {
	private int years;
	private String specialty;
	
	//The Doctor constructor includes parameters for the human class along with the parameters for the years and specialty fields
	public Doctor(float weight, int age, double height, int years, String specialty){
		//This calls the human's constructor, so a human object for the doctor can be created.
		super(weight, age, height);
		//the field years is set
		this.years = years;
		//The field specialty is set
		this.specialty = specialty;
	}
	
	//the number of years is returned
	public int getYears() {
		return years;
	}
	//the specialty String is returned
	public String getSpecialty() {
		return specialty;
	}
	//the doctor's salary is returned
	public String getSalary() {
		//the base salary starts at $40,000
		int baseSalary = 40000;
		//The slary increases each year by $5,000 based on the number of years  doctor practices
		int salary = baseSalary + (years * 5000);
		//This turns the int into a string with a $ sign in the front
		String salaryString = "$" + Integer.toString(salary);
		//The salary is returned
		return salaryString;
	}
}
