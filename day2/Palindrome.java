package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int input=34343;
		int temp,remainder;
		temp=input;
		for (int i = input; i <=5; i++) {
		remainder=input%10;
		//		=0%10=0	(1)
		//		=
		input=(input*10)+remainder;
		//		=0*10+3
		temp=temp/10;
		// 	=34343/10=3434
		
			
		}
if (temp==input) {
	System.out.println(input+" is a palindrome");
	
} else {
	System.out.println(input+" is not a palindrome");
}
	}}