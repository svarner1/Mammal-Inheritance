//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 21
//=======================================

/* This class is a parent, superclass to two class human , which is a parent to the classes called "Student" and "Doctor".
 * This class creates two fields for the age and weight of a mammal. It also includes getter methods that return
 * the weight and age of the mammal. The values for these variables are set in the Mammal constructor.
 */
public class Mammal {
	private int age;
	private float weight;
	
	//Sets the weight and age of the mammal based on the users construction of the object
	Mammal(float weight, int age) {
	    this.age = age;
	    this.weight = weight;
	}

	//returns the weight of the mammal
	public float getWeight(){
	    return this.weight;
	}

	//returns the age of the mammal
	public int getAge(){
        return this.age;
	}
}
