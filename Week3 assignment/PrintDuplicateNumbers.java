package week3.day2assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Arrays.sort(data);
		Set<Integer> newdata=new HashSet<Integer>();
		for (Integer duplicate: data) {
			if (newdata.add(duplicate)!=true) {
				System.out.println("The duplicate number is: "+duplicate);
				
			}
			
		}
	}

}
