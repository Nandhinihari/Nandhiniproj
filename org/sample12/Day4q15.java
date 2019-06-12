package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4q15 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		
		WebElement txtpara1 = driver.findElement(By.xpath("//a[@href='\"/account/login?ret=/']"));
		txtpara1.click();

		WebElement txtpara = driver.findElement(By.xpath("(//input[@class='class=\"_2zrpKA _1dBPDZ\"'])[2]"));
		txtpara.sendKeys("nandi@gmail.com");
		String text1 = txtpara.getAttribute("value");
		
		WebElement txtpara11 = driver.findElement(By.className("_2zrpKA _3v41xv _1dBPDZ"));
		txtpara11.sendKeys("nandi");
		String text2 = txtpara.getAttribute("value");
		System.out.println(text1);
		System.out.println(text2);

		
	}
}
