package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement s = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement d = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(s,d).perform();
		
	    WebElement s1 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
		WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(s1,d1).perform();
		
		WebElement s2 = driver.findElement(By.id("credit1"));
			WebElement d2 = driver.findElement(By.id("loan"));
			acc.dragAndDrop(s2,d2).perform();
			
			WebElement s3 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
				WebElement d3 = driver.findElement(By.id("amt8"));
				acc.dragAndDrop(s3,d3).perform();
				
		
		
		
		
	}

}
