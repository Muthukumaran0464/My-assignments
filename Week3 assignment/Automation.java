package week3.day2assignment;

public class Automation extends MultipleLanguage implements Language,TestTool{

@Override
public void ruby() {
System.out.println("Sample ruby");
	
}

public void selenium() {
	System.out.println("Sample selenium");
	
}

public void java() {
	System.out.println("Sample java");
	
}
public static void main(String[] args) {
	Automation obj=new Automation();
	obj.python();
	obj.ruby();
	obj.java();
	obj.selenium();
	
	
}

}
