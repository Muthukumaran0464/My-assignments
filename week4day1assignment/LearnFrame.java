package week4day1assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://leafground.com");
		driver.findElement(By.xpath("(//li[@role='menuitem']/a)[4]")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_frame']/a")).click();
		//Using webelement
		WebElement fristFrame = driver.findElement(By.id("Click"));
		//(By.xpath("(//button[@id='Click'])[1]"));
		driver.switchTo().frame(fristFrame); fristFrame.click();
		System.out.println(fristFrame.getText()); driver.switchTo().defaultContent();
		//Using Index
		driver.switchTo().frame(1);
		WebElement storingforCount = driver.findElement(By.xpath("//button[text()='Count Frames']"));
		storingforCount.click();
		System.out.println(storingforCount.getText());

		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);//outer frame
		driver.switchTo().frame(0);//inner frame
		//driver.switchTo().frame("frame2")---> using name or id
		WebElement storingtoGettext = driver.findElement(By.id("Click"));
		storingtoGettext.click();
		storingtoGettext.getText();
		driver.switchTo().defaultContent();

	}

}
