package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		int input=-40;
		int convertpositive;
		if (input<0) {
			System.out.println(input +" is negative");
			convertpositive=input*(-1);
		System.out.println("The converted positive number is"+convertpositive);	
		}
		else
		{
			System.out.println(input+" is neutral number");
		}
	}

}
