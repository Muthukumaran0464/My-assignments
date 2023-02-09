package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("The method makeCall is created");
		String mobileModel="Vivo";
		float mobileWeight =12.3f;
		System.out.println("The model of the mobile is "+mobileModel+ " and has a weight of " +mobileWeight);
	}
	public void sendMsg() {
		Boolean fullCharged = true;
		int mobileCost= 10000;
		System.out.println("The method sendMsg is created");
		System.out.println("Battery is fully charged "+fullCharged+" and the cost of the mobile is "+mobileCost);

}
	public static void main(String[] args) {
		Mobile obj =new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
		
		
		
	}
}
