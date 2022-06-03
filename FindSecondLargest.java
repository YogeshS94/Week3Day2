package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String arg[]) {
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> ac = new ArrayList<Integer>();
		for(int i=0; i<data.length; i++) {
			ac.add(data[i]);
		}
		System.out.println(ac);
		Collections.sort(ac);
		System.out.println(ac);
		int secondLarg = ac.size()-2;
		System.out.println("Second Largest is : " + ac.get(secondLarg));		
	}
}
