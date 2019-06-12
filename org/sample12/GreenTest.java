package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTest {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://greenstreettechnology.solutions/about/");
	WebElement txthome = driver.findElement(By.id("page"));
	txthome.sendKeys("greens");
	WebElement txtblog = driver.findElement(By.id("page"));
	txtblog.sendKeys("hehe");
	}

}
