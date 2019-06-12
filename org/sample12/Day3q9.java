package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3q9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
				
		WebElement txtsignup = driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		txtsignup.click();
		
		WebElement txtMail= driver.findElement(By.xpath("//input[@class='_2zrpKA']"));
		txtMail.click();		
				
		
	}

}
