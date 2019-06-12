package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Q8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/\r\n" + 
				"");
		
		WebElement txtpara = driver.findElement(By.name("q"));
		txtpara.sendKeys("greens velmurugan");
		
		WebElement txtpara1 = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		txtpara1.click();

		
		WebElement txtpara2 = driver.findElement(By.className("LC20lb"));
		txtpara2.click();
		
		
		
	}
}
