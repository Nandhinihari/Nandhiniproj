package org.sample12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsq5 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	WebElement btnSign = driver.findElement(By.xpath("//*[@id=\"banner\"]/div[2]/a"));
	btnSign.click();
	WebElement btnLog = driver.findElement(By.id("Button2"));
	btnLog.click();
	Alert al=driver.switchTo().alert();
	al.accept();
	
	

}
}
