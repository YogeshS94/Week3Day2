package Week3.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

/*	Assignment 3:
		missing Number
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};

			 * Psuedocode
			 * 
			 * 1) Remove the duplicates using Set
			 * 2) Make sure the set is in the ascending order
			 * 3) Iterate from the starting number and verify the next number is + 1
			 * 4) If did not match, that is the number
			 * 
			 */
	public static void main(String arg[]) {
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		Set<Integer> mi = new TreeSet<Integer>();
		for(int i=0; i<numbers.length; i++) {
			mi.add(numbers[i]);
		}
		System.out.println(mi);
	
		List<Integer> con_mi =new ArrayList<Integer>(mi);
		for (int i = 0; i < con_mi.size(); i++) {
			if(con_mi.get(i)!=i+1) {
				System.out.println("Missing element is: " + (i+1));
				break;
			}
		}
	}
	
}
