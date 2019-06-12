package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3q8 {


	public static void main(String[] args) {
	
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			WebElement txtLogin = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']"));
			txtLogin.click();
	
			
			
	
			
			
		
	}

}




}
