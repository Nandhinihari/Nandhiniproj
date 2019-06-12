package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5q19 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement c = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		c.click();

		
		
		WebElement btnCategory1= driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCategory1).perform();
		

		WebElement cl= driver.findElement(By.xpath("(//a[@title='Footwear'])[2]"));
		cl.click();
		
		
	
	}

}
