package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5q7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		WebElement btnCategory = driver.findElement(By.xpath("//button[@type='button']"));
		btnCategory.click();
		
		WebElement btnCategory1= driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCategory1).perform();
		//WebElement btnCategory = driver.findElement(By.xpath("//button[@data-dismiss='modal']"));
		//btnCategory.click();
		
		
	
	}

}
