package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7error {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html \r\n" + 
				"");
		driver.manage().window().maximize();
		WebElement c = driver.findElement(By.xpath("//button[@class='close']"));
		c.click();
		
		WebElement btnCategory1= driver.findElement(By.xpath("//a[@href='courses.html']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCategory1).perform();
		

		WebElement btnCategory2= driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/software-testing.html']"));
		acc.moveToElement(btnCategory2).perform();
		
		
	
	

	}

}
