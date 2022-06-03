package Week3Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class InterviewQ {
	public static void main(String arg[]) {
		String a = "amazon";
		char[] allChars = a.toCharArray();
		System.out.println(allChars);
		Set<Character> un = new LinkedHashSet<Character>();
		for(int i=0; i<allChars.length; i++) {
			if (un.add(allChars[i])) {
				System.out.print(allChars[i]);
			}
		}
	}
}
