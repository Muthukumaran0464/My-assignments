package week1.day2;
import java.util.Arrays;

public class FibonacciSeries {

	public static void main(String[] args) {
		int[] range= {1,2,3,4,5,6,7,8};
		int firstnum=0;
		int secnum=1;
		int sum;
		System.out.println("The first number is "+range[0]);
		for(int i=1;i<=8;i++) 
		{
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println("The sum is"+sum);
			
		}
	}

}
