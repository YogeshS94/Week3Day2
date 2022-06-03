package Week3Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacter {

	/*Assignment 4:
	 PrintOnlyUniqueCharacters
	String input = "babu";

	output:// a u
	
		 * Psuedocode
		 * 
		 * 1) Convert String to Character array
		 * 2) Create a new Set -> HashSet
		 * 3) Add each character to the Set and if it is already there, remove it
		 * 4) Finally, print the set
		 * 
		 */
	
	public static void main(String arg[]) {
		String a = "babu";
		char[] allChars = a.toCharArray();
		System.out.println(allChars);
		Set<Character> un = new LinkedHashSet<Character>();
		for (int i = 0; i < allChars.length; i++)
	    {
	        int flag = 0;
	        for (int j = 0; j < allChars.length; j++)
	        {
	            // checking if two characters are equal
	            if (allChars[i] == allChars[j] && i != j)
	            {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0) {
	        	un.add(allChars[i]);
	        } 
	    }
		System.out.print(un);
	}
}