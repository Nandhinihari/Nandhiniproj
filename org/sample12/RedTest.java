package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtuser = driver.findElement(By.id("src"));
		txtuser.sendKeys("chennai");
		WebElement txtuser1 = driver.findElement(By.id("dest"));
		txtuser1.sendKeys("chinnamanur");
		
	}
	

}
