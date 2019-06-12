package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement txtpara = driver.findElement(By.xpath("//p[contains(text(),'Our')]"));
		String text1 = txtpara.getText();
		System.out.println(text1);
		
	}

}
