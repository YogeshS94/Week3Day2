package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
	public static void main(String arg[]) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,14};
		
		List<Integer> du = new ArrayList<Integer>();
		List<Integer> du1 = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			du.add(arr[i]);
		}
		System.out.println(du);
		for(int i=0;i<du.size();i++) {
			for(int j=i+1;j<du.size();j++) {
				if(du.get(i).equals(du.get(j))){
					if(du1.contains(du.get(i))) {
						break;
					}
					else {
						du1.add(du.get(i));
					}
				}
			}
		}
		System.out.println(du1);
	}
}
