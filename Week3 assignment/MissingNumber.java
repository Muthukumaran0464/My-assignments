package week3.day2assignment;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] inputs = {1,5,8,7,3,4,6,9,10};
		Set<Integer> seet=new TreeSet<Integer>();
		for (int i = 0; i < inputs.length; i++) {
			seet.add(inputs[i]);
					}
		System.out.println(seet);
		List<Integer> missing=new ArrayList<Integer>(seet);
		int missize = missing.size();
			for (int i = 1; i <=missize; i++) {
				if(missing.get(i-1)==i) {//1-1=[0]=1==1
					continue;
				}
				else {
					System.out.println(i+" is the missing number");
					break;
				}
				
			}
		}
		

	}


