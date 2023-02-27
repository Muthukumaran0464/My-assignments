package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit (String x, int y) {
	System.out.println("Deposited by "+x+" "+"is "+y);
	
}
public static void main(String[] args) {
	AxisBank obj1=new AxisBank();
	obj1.deposit("Kumaran", 500);
	obj1.fixed(22, "Active");
	obj1.savings("Kumaran");
}
}
