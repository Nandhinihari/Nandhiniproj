package org.sample12;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3q4 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-form/");
			
			WebElement txtName1 = driver.findElement(By.name("firstname"));
			txtName1.sendKeys("nandhini");
			WebElement txtMail = driver.findElement(By.name("lastname"));
			txtMail.sendKeys("hari");
			WebElement txtfemale = driver.findElement(By.xpath("//input[@id='sex-1"
					+ "	']"));
			txtfemale.click();
			WebElement txtexp = driver.findElement(By.xpath("//input[@name='exp']"));
			txtexp.click();
			WebElement txtDate = driver.findElement(By.id("datepicker"));
			txtDate.sendKeys("29/5/2019");
			WebElement txtProfsn = driver.findElement(By.xpath("//input[@id='profession-1']"));
			txtProfsn.click();
			WebElement txtProfsn1 = driver.findElement(By.xpath("//input[@id='tool-2']"));
			txtProfsn1.click();
			WebElement txtConti = driver.findElement(By.id("continents"));
			txtConti.sendKeys("Asia");
			
			
		
		
	}


}
