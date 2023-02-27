package week3.day1;

public class BankInfo {
	public void savings(String x) {
		System.out.println("Name is: "+x);
		
	}
	public void fixed(int x, String y) {
		System.out.println("Age is: "+x+" "+"Account status"+y);
		
	}
public void deposit(String x, int y) {
	System.out.println("Amount deposited by "+x+" "+"is "+y);
	
}
public static void main(String[] args) {
	BankInfo obj=new BankInfo();
	obj.savings("Muthukumaranjothiswaran");
	obj.fixed(23, "Active");
	obj.deposit("Muthukumaran", 5000);
}
}
