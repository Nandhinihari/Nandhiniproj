package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dayq4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement btnCategory = driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
		btnCategory.click();
		WebElement btnCategory1 = driver.findElement(By.xpath("//a[text()='Entertainment']"));
		btnCategory1.click();
	}

	
}
