package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5q5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement btnCategory = driver.findElement(By.xpath("//li[@id='nav_44']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCategory).perform();
		WebElement btnCategory1 = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		btnCategory1.click();
		
		
		
	}

}
