package org.sample12;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesq8 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");
		//List<WebElement> frame = driver.findElements(By.tagName("frameset"));
		//int size = frame.size();
		//System.out.println(size);
        WebElement txtLog = driver.findElement(By.xpath("//input[@type='text']"));
		txtLog.sendKeys("nandhini");
		WebElement txtcon = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));

		txtcon.click();
		Thread.sleep(2000);
		
	WebElement txtpw = driver.findElement(By.xpath("(//span[@class='pwd_field'])[2]"));
		txtpw.sendKeys("dfghjk");
	}
	
	
	

}

