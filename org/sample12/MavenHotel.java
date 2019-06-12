package org.sample12;

public class MavenHotel {
	public static void main(String[] args) {
		package org.nandhinihari.Nandhini;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Hotel {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Nandhini\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.adactin.com/HotelApp/");
			
			WebElement btnCategory = driver.findElement(By.id("username"));
			btnCategory.sendKeys("nandhini");
			WebElement btnCategory1 = driver.findElement(By.id("password"));
			btnCategory1.sendKeys("nandhini");
			WebElement btnlogoin = driver.findElement(By.id("login"));
			btnlogoin.click();
			
		}        
		}

	}

}
