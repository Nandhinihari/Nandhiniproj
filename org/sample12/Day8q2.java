package org.sample12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbank.com/search.aspx?zoom_query=");
		WebElement btnSub = driver.findElement(By.xpath("//input[@type='submit']"));
		btnSub.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
		
	}

}
