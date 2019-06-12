package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5q21 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		
		WebElement btnCategory1= driver.findElement(By.xpath("//span[text()='Shop Plans'][1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(btnCategory1).perform();
		
		Thread.sleep(2000);

		WebElement btnCategory2= driver.findElement(By.xpath("(j//a[contains(text(),'Our Unlimited')])[1]"));
		btnCategory2.click();
		
		
	
	

	}

	}


