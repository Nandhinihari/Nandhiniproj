package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5q8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement c = driver.findElement(By.xpath("//button[@class='close']"));
		c.click();
		
		WebElement btnCategory = driver.findElement(By.xpath("//a[@class='activeLink']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCategory).perform();
		WebElement tst1 = driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
		acc.moveToElement(tst1).perform();
		



	}

}
