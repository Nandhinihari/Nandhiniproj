package org.sample12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropq5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement btnSelect = driver.findElement(By.id("selenium_commands"));
		btnSelect.click();
		Select s=new Select(btnSelect);
		List<WebElement> l = s.getOptions();
		for (int i=0; i<l.size();i++) {
			if(i%2==0){
				WebElement x = l.get(i);
				String n = x.getText();
				System.out.println(n);
				
				
			}
			
		}
	}

}
