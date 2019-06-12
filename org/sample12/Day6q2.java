package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6q2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement txtgoo = driver.findElement(By.xpath("//a[@class='gb_x gb_4b']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(txtgoo).perform();
		txtgoo.click();
		
		Thread.sleep(2000);
		
		WebElement clk = driver.findElement(By.xpath("//span[contains(text(),'Gmail')]"));
		
		clk.click();
		
		
		
		
	}

}
