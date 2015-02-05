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
	
	//PRIVATE METHOD -----------------------------------------
	/**
	 * This Method adds the powers to ArrayList Powers and then then adds identical power
	 * to SuperPower Array . It removes the power from ArrayList once it has added to Array
	 */
	private void generateRandomPowers()
	{
		//Creating Array list named as Powers
		ArrayList<String> Powers = new ArrayList<String>();
		
		//Adding the powers to the Array list
		Powers.add("Super Speed");
		Powers.add("Super Strength");
		Powers.add("Body Armour");
		Powers.add("Flight");
		Powers.add("Fire Generation");
		Powers.add("Weather Control");
		
		//Using the For Loop 
		for(int i=0; i<3; i++){
		
			// Taking Random Power from the Powers Array list
			int powerVariable = (int)(Math.random() * Powers.size());
			
			//Setting the Powers to SuperPower Array
			superPowers[i] = Powers.get(powerVariable);
			
			//removing the selected power from the ArrayList
			Powers.remove(powerVariable);
			
		}
	}
	//PUBLIC METHOD ----------------------------------------
	/**
	 * This Method Prints the Powers that are Selected to Array.
	 * It Prints the Values using For Loop
	 */
	public void showPowers()
	{
		
		System.out.println(this.name + " has powers :  ");
		System.out.println("---------------------------------------------");
		//loop through all of the SuperHero's powers, printing out each one
		for (String show : superPowers)
		{
			System.out.println(show);
		} 
		
		System.out.println("---------------------------------------------");
		
	}//end of ShowPowers
	
}//end of SuperHero Class
