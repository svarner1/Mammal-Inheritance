//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 21
//=======================================

//This class is a child to the superclass "Mammal". This class includes the field for the mammal's height. It also includes a constructor that sets the weight, height, and age for the object
public class Human extends Mammal {
	double height;
	
	//This constructor creates a human object with the parameters weight, age, and height that are determined by the user
	public Human (float weight, int age, double height) {
		//This calls the superclass mammal's constructor
		super(weight, age);
		this.height = height;
	}
	
	//This returns the height of the human
	public double getHeight() {
		return this.height;
	}
}
