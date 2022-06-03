package Week3Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String arg[]) {
		String text = "We learn java basics as part of java sessions in java week1";

		char[] allChar = text.toCharArray();
		Set<Character> sl = new LinkedHashSet<Character>();
		
		for(int i=0; i<allChar.length; i++) {
			if (sl.add(allChar[i])) {
				System.out.print(allChar[i]);	
			}	
		}
	}
}
