/**
 * 
 */
package edu.brandeis.cosi12b2;

/**
 * @author kbrumer
 *
 */
public class ReverseName {

	/**
	 * Given an name (first name and last name), reverse the letters in the name and reverse the order of the name
	 * 
	 * John Doe   -> Eod Nhoj
	 * Matt Smith -> Htims Ttam  
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseName("John", "Doe");
	}
	
	public static void reverseName(String firstName, String lastName) {
		String outputFirstName = "";
		String outputLastName = "";
		// 
		// reverse the letters in the name
		// capitalize the first letter and lowercase the rest
		// concatenate the two names, in order last name first name
		outputFirstName = reverseString(firstName);
		outputFirstName = capitalize(outputFirstName);
		
		outputLastName = reverseString(lastName);
		outputLastName = capitalize(outputLastName);

		System.out.printf("Output name = [%s %s]\n", outputLastName, outputFirstName);
	}
	
	/**
	 * This reverse a string
	 * 
	 * @param input - the string to reverse
	 * @return - the reversed string
	 */
	public static String reverseString(String input) {
		String output = "";
		for (int i=0; i < input.length(); i++) {
			char ch = input.charAt(i);
			output = ch + output;
		}
		return output;
	}
	
	/**
	 * This lowercases a String but uppercases the first character
	 * 
	 * @param input
	 * @return
	 */
	public static String capitalize(String input) {
		// System.out.println("input=" + input);
		String output = input.toLowerCase();
		String firstLetter = output.substring(0, 1);
		// char firstCh = input.charAt(0);
		String theRest = output.substring(1);
		
		String upperFirst = firstLetter.toUpperCase();
				
		return upperFirst + theRest;		
	}

}
