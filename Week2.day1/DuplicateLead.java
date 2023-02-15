package workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ate')]")).click();
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("Company_name");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Firstname");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Lastname");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("Local_first_name");
		driver.findElement(By.name("departmentName")).sendKeys("Dept.");
		driver.findElement(By.name("description")).sendKeys("Description_Added");
		driver.findElement(By.name("primaryEmail")).sendKeys("Email@gmail.com");
		WebElement Province = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select duplicate=new Select(Province);
		duplicate.selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		String Getting = driver.getTitle();
		System.out.println(Getting);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New_company_name");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("New_First_name");
		driver.findElement(By.name("submitButton")).click();
		String Getting1 = driver.getTitle();
		System.out.println(Getting1);
		driver.close();
	}

}
