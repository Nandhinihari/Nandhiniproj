package org.sample12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hari {

	public static void main(String[] args) {
	
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
	
	
	
	WebDriver driver=new ChromeDriver();




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