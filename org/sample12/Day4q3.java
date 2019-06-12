package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4q3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/oracle-training.html");
		WebElement txtpara = driver.findElement(By.xpath("//p[contains(text(),'Awarded')]"));
		String text1 = txtpara.getText();
		WebElement txtFull = driver.findElement(By.xpath("//p[contains(text(),'Rated')]"));
		String txtlv = txtFull.getText();
		System.out.println(text1);
		System.out.println(txtlv);
		
	}

}
