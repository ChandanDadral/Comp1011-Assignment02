

/**
 * @author Chandan Dadral
 * @Version February 04, 2015
 *This class creates a SuperHero object and calls its showPowers and fight methods.
 *
 */
public class Tester {

	
	public static void main(String[] args) {//main Method
		
		//create a new SuperHero object
		SuperHero Ronaldo = new SuperHero("Ronaldo");
		
		//calling showPowers and fight methods
		Ronaldo.showPowers();
		Ronaldo.fight();

	}//main Ends 

}//Tester 
