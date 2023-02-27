package week3.day2assignment;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
 // Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

		// get the length of the array		

		// sort the array			

		// Iterate it in the reverse order

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
String[] data= {"Aspire Systems", "HCL", "Wipro", "CTS"};
int length = data.length;
System.out.println(length);
Arrays.sort(data);
System.out.println(Arrays.toString(data));
for (int  i = data.length-1; i >= 0;i--) {
	System.out.println(data[i]);
	
	
}

	}

}
