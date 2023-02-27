package week3.day2assignment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String input="MuthukumaranJothiswaran";
		System.out.println("Before change to lower case: "+input);
		String lowerCase = input.toLowerCase();
		System.out.println("After changing to lower case is: "+lowerCase);
		char[] charArray = lowerCase.toCharArray();
		
		Set<Character> object=new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			object.add(charArray[i]);		
		}
System.out.println(object);
	}

}
