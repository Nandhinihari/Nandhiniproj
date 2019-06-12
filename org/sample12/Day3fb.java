package org.sample12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day3fb {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement txtName1 = driver.findElement(By.id("email"));
			txtName1.sendKeys("nandi@gmail.com");
			WebElement txtMail = driver.findElement(By.name("pass"));
			txtMail.sendKeys("sdfghjk");
			WebElement txtLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
			txtLogin.click();
		
		
	}

}
