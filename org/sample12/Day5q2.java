package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement btnCategory = driver.findElement(By.id("nav-link-shopall"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCategory).perform();
	    
		WebElement btnmbl = driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
								acc.moveToElement(btnmbl).perform();
				
				WebElement btnpwr = driver.findElement(By.xpath("//span[text()='Power Banks']"));
				btnpwr.click();	
				
				
}
}
