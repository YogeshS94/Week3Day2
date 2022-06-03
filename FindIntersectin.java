package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectin {
	public static void main(String arg[]) {
		int[] arr1={3,2,11,4,6,7};
		int[] arr2={1,2,8,4,9,7};
		
		List<Integer> ac1 = new ArrayList<Integer>();
		List<Integer> ac2 = new ArrayList<Integer>();
		
		for(int i=0; i<arr1.length; i++) {
			ac1.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			ac2.add(arr2[i]);
		}
		System.out.println(ac1);
		System.out.println(ac2);
		
		for(int i=0; i<ac1.size(); i++) {
			for(int j=0; j<ac2.size(); j++) {
				if (ac1.get(i).equals(ac2.get(j))){
					System.out.println("Intersection Arrays are: " + ac1.get(i) + " ");
				}
			}
		}
	}
}
