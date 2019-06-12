package org.sample12;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Day4q7 {
		
		public static void main(String[] args) {
		
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com/ ");
					
					WebElement txtpara = driver.findElement(By.id("email"));
					txtpara.sendKeys("nandi@gmail.com");
					String text1 = txtpara.getAttribute("value");
					
					WebElement txtFull = driver.findElement(By.id("pass"));
					txtFull.sendKeys("asdfghj");
					String txtlv = txtFull.getAttribute("value");
					
					
					
					System.out.println(text1);
					System.out.println(txtlv);
					
					
				}
		



}
