package org.sample12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nandi {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
			
			
					FirefoxDriver driver=new FirefoxDriver();



		driver.get("https://www.instagram.com/accounts/login/");
		driver.get("http://www.greenstechnologys.com/");
		driver.get(" http://gmail.com/");
		driver.get("http://www.flipkart.com/");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");


		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println("title");
		}
		
	
	
	}


