package org.sample12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropq12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement txtNum = driver.findElement(By.id("aadhdarNo"));
		txtNum.sendKeys("123456789011");
		
		WebElement txtName = driver.findElement(By.id("aadhdarName"));
		txtName.sendKeys("nandhini");
		
		WebElement txtName1 = driver.findElement(By.id("candidateName"));
		txtName1.sendKeys("nandhini");
		
		 WebElement txtDis = driver.findElement(By.id("nativeDistrict"));
		Select s=new Select(txtDis);
		s.selectByVisibleText("Mahabubnagar");                 
				
				WebElement txtFa = driver.findElement(By.id("fatherName"));
				Thread.sleep(5000);
				
				WebElement txtcom = driver.findElement(By.id("community"));
				Select s1=new Select(txtcom);
				s1.selectByIndex(2); 
				Thread.sleep(5000);
				
				WebElement txtman = driver.findElement(By.id("community"));
				Select s2=new Select(txtman);
				s2.selectByIndex(1);
				Thread.sleep(5000);
				
				WebElement txtNa = driver.findElement(By.id("nativeVillage"));
				txtName.sendKeys("chinnamanur");
				
				
				WebElement txtMo = driver.findElement(By.id("motherName"));
				txtMo.sendKeys("shanthi");
				
				WebElement txtLan= driver.findElement(By.id("motherTongue"));
				Select s3=new Select(txtLan);
				s3.selectByVisibleText("Tamil");
				Thread.sleep(5000);
				
				WebElement txtRe= driver.findElement(By.id("religion"));
				Select s4=new Select(txtRe);
				s4.selectByIndex(1);
				Thread.sleep(5000);
				
				
				
				
					
				
		
	}

}
