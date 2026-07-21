package aAAssignments;

import java.util.HashSet;
import java.util.Set;

/*To print Duplicate numbers from array input : {10,20,30,40,50,20,40} */

public class Assignment74 {
	public static void main(String[] args) {
		int[] intArr = {10,20,30,40,50,20,40};
		
		Set<Integer> intSet = new HashSet<Integer>();
		
		for(int a : intArr) {
			if(!intSet.add(a))
				System.out.println(a);
		}
	}
}
