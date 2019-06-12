package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropq1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement btnSign = driver.findElement(By.xpath("/html/body/div[1]/section/div/header-search-bar/div[3]/div/form/div[2]/div[1]/div[2]"));
		btnSign.click();
		Select s=new Select(btnSign);
		s.selectByIndex(3);
	}

}
