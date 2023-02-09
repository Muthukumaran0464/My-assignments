package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {

		int a[] = {1,5,10,8,13,12};
		int b[] = {1,9,10,5,10,7};

		for(int i = 0 ; i<a.length ; i++ )
		{for (int j = 0 ; j<b.length ; j++)

		{
			if (a[i]==b[j])
			{System.out.println("The Intersections are "+ a[i]);
			}
		}
		}
	}
}