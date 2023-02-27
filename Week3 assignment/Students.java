package week3.day2assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("The student id is:"+id);


	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The id is: "+id+" and the name is: "+name);
		
	}
public void getStudentInfo(String email, int phoneNumber) {
	System.out.println("The mail id is: "+email+" and the phone number is"+phoneNumber);
	
}
public static void main(String[] args) {
	Students obj=new Students();
	obj.getStudentInfo(4062549);
	obj.getStudentInfo(406249, "Muthukumaran");
	obj.getStudentInfo("muthukumaranjothiswaran@gmail.com", 812470231);
}
}
