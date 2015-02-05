/**
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Chandan Dadral
 * @version February 04, 2015
 * This Class Further Extends the Hero Class, in this class the Powers of the Heroes
 * Displayed. This Class is Subclass of Hero Class.
 *
 */
public class SuperHero extends Hero {
	
	//Created a String type array SuperPower Variable of size 3 
	private String[] superPowers = new String [3];
	
	//CONSTRUCTOR -------------------------------------------
	/**
	 * This Constructor Takes the name of Super Hero from Hero class class and also 
	 * calls the GenerateRandomPowers method 
	 * @param name It is the name of SuperHero 
	 */
	public SuperHero(String name) {
		
		super(name);
		
		//Calling Generate Random Powers
		generateRandomPowers();
	}
	
}