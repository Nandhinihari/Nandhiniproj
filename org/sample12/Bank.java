package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		WebElement txtuser = driver.findElement(By.id("login_username|input"));
		txtuser.sendKeys("nandhini");
		WebElement txtpass = driver.findElement(By.id("login_password|input"));
		txtpass.sendKeys("sfghjk");
	}

}

