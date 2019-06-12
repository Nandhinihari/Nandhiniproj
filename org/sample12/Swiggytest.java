package org.sample12;
    
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Swiggytest {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.swiggy.com");
			WebElement txtuser = driver.findElement(By.id("location"));
			txtuser.sendKeys("chennai");
			
			WebElement txtuser1 = driver.findElement(By.id("x4bK8"));
			txtuser1.sendKeys("nan@maol");
			
			
			WebElement txtuser2 = driver.findElement(By.name("mobile"));
			txtuser2.sendKeys("9876789880");
					
		}
		

	}



