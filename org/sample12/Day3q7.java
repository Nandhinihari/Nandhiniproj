package org.sample12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day3q7 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.cleartrip.com/trains");
			
			WebElement txtLogin = driver.findElement(By.xpath("//a [@href='/register']"));
			txtLogin.click();
		
			
			
	
			
			
		
	}

}


