package workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'M')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ds')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ate')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Xiomi");
		driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("Redmi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Note11");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Zarzi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Android");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Most selling phone in india");
		driver.findElement(By.xpath("(//input[contains(@name,'Email')])[4]")).sendKeys("Redminote11@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select object = new Select(state);
		object.selectByValue("NY");
		driver.findElement(By.xpath("//input[contains(@value,'Lead')]")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Offer is available till Feb 28");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String Updatedtitle = driver.getTitle();
		System.out.println(Updatedtitle);
		driver.close();
	}

}
