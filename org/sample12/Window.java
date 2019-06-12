package org.sample12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		WebElement window = driver.findElement(By.xpath("(//div[text()='Besure Aloe Vera Soap - Pack Of 4 (75gm Each)'])[2]"));
		window.click();
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for (String n : child) {
			if(!handle.equals(n)) {
			driver.switchTo().window(n);
			
			}
		}
		
		WebElement f = driver.findElement(By.xpath("//span[text()='add to cart']"));
		f.click();
		
		
		
	}

}
