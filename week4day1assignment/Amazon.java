package week4day1assignment;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("oneplus 9 pro");
		search.sendKeys(Keys.ENTER);
		WebElement getText = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String text = getText.getText();
		System.out.println(text);
		WebElement customerRating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		System.out.println("Total customer rating is: "+customerRating.getText());
		driver.findElement(By.xpath("//span[contains(text(),'Pine Green, 12GB RAM, 256GB Storage')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		java.util.List<String> wwHandles=new ArrayList<String>(windowHandles);
		System.out.println("The size of the window is: "+wwHandles.size());
		driver.switchTo().window(wwHandles.get(1));
		WebElement sss = driver.findElement(By.id("landingImage"));
		File screenshot = sss.getScreenshotAs(OutputType.FILE);
		File output=new File("./snap/shot.jpeg");
		FileUtils.copyFile(screenshot, output);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Cart')])[2]")).click();
		WebElement subTotal = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']"));
		//WebElement subTotal = driver.findElement(By.xpath("//*[@id=\"sw-subtotal\"]/span[2]/span/span[1]"));
		//driver.findElement(By.xpath("//span[@class='a-offscreen']"));
		//WebElement subTotal = driver.findElement(By.xpath("//span[@class='a-price sw-subtotal-amount']/span"));

		String getText1 = subTotal.getText();
		String trim = getText1.trim();
		System.out.println("The cart amount is: "+trim);
		if (trim==text) {
			System.out.println("Cart subtotal is correct");
		}
		else
		{
			System.out.println("Cart subtotal is incorrect");
		}
	}

}
