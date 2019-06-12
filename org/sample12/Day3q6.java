package org.sample12;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day3q6 {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");
			
			WebElement txtLogin = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
			txtLogin.click();
		
			
			
			
			WebElement txtName1 = driver.findElement(By.id("mobileNoInp"));
			txtName1.sendKeys("234567890");
			
			
		
	}

}


