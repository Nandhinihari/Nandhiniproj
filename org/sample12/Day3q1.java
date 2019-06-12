package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3q1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	

	WebElement txtName = driver.findElement(By.xpath("//a[@href='contact.php']"));
	txtName.click();
	
	
	WebElement txtName1 = driver.findElement(By.id("InputName"));
	txtName1.sendKeys("nandhini");
	WebElement txtMail = driver.findElement(By.name("email"));
	txtMail.sendKeys("nandi@gmail.com");
	WebElement txtPhone = driver.findElement(By.name("phone"));
	txtPhone.sendKeys("8012751011");
	WebElement txtCourse = driver.findElement(By.name("courses"));
	txtCourse.sendKeys("selenium");
	WebElement txtBranch = driver.findElement(By.name("branch"));
	txtBranch.sendKeys("OMR");
	WebElement txtTraining = driver.findElement(By.name("time"));
	txtTraining.sendKeys("Immediately");

	WebElement txtMsg = driver.findElement(By.name("comments"));
	txtMsg.sendKeys("hi to all");

	
	
	
	






}
}
