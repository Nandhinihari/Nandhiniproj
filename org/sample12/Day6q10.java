package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Day6q10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement btnLog = driver.findElement(By.id("nav-link-yourAccount"));
		btnLog.click();
		
		WebElement btnLog1 = driver.findElement(By.id("ap_email"));
		btnLog1.sendKeys("nandi@gmail.com");
		Actions acc=new Actions(driver);
		acc.moveToElement(btnLog1).perform();
		acc.doubleClick(btnLog1).perform();
		acc.contextClick(btnLog1).perform();
		
		WebElement btnclk = driver.findElement(By.id("continue"));
		btnclk.click();
		
		
		
		
	}

}
