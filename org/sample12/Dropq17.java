package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropq17 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://foodlicensing.fssai.gov.in/index.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement txtclk = driver.findElement(By.id("precheck"));
				txtclk.click();
				WebElement txttype = driver.findElement(By.xpath("//textarea[@name='gvPreCheck$ctl03$txtAddress']"));
				txttype.sendKeys("OMR,chennai");
				WebElement txtState = driver.findElement(By.xpath("//select[@name='gvPreCheck$ctl03$ddlState']"));
Select s=new Select(txtState);
s.selectByIndex(10);
Thread.sleep(5000);
WebElement txtSel = driver.findElement(By.id("gvPreCheck_ctl03_ddlDistrict"));
Select s1=new Select(txtSel);
s1.selectByVisibleText("New Delhi");
	
	}
	

}
