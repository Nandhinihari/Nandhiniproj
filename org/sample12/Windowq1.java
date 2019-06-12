package org.sample12;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowq1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	close.click();
	
	WebElement txtSearch = driver.findElement(By.xpath("//input[@type='text']"));
	txtSearch.sendKeys("iphones 7");
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	
	WebElement g = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 7 Plus (Gold, 128 GB)')]"));
	g.click();
	
	String f = driver.getWindowHandle();
	System.out.println(f);
	System.out.println(g);
	
	
	Set<String> second = driver.getWindowHandles();
	System.out.println(second);
	for (String s : second) {
	if(!f.equals(second)) {
		driver.switchTo().window(s);
		
	}
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
}
