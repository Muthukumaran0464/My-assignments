package workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {//used xpath to learn.
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(@style,'black')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Mk & co");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Subam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mangalam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Subiksham");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_departmentName')]")).sendKeys("Devotional");
		driver.findElement(By.xpath("(//textarea[contains(@class,'inputBox')])[1]")).sendKeys("Good company");
		driver.findElement(By.xpath("(//input[contains(@name,'primaryEmail')])[4]")).sendKeys("Subamangalam@gmail.com");
		WebElement State = driver.findElement(By.xpath("//select[contains(@name,'StateProvince')]"));
		Select object=new Select(State);
		object.selectByVisibleText("Texas");
		driver.findElement(By.xpath("//input[contains(@class,'sma')]")).click();
		System.out.println(driver.getTitle());
		
		
	}

}
