package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3q10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement txSign = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		txSign.click();
		
		WebElement txSign1 = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		txSign1.click();
		
		
		WebElement txtName1 = driver.findElement(By.id("ap_customer_name"));
		txtName1.sendKeys("nandhini");
		
		WebElement txtMail = driver.findElement(By.id("lastap_phone_numbername"));
		txtMail.sendKeys("34567890");
		
		WebElement txtMail2 = driver.findElement(By.id("ap_email"));
		txtMail2.sendKeys("nandi.com");
		

		WebElement txtMail3 = driver.findElement(By.id("ap_password"));
		txtMail3.sendKeys("cvbnmvbn");
		
	
	
}
	}


