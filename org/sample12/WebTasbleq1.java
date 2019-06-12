package org.sample12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTasbleq1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		 List<WebElement> trows = driver.findElements(By.tagName("tr"));
		 for (int i=0 ;i<trows.size() ;i++ ) {
			 WebElement row = trows.get(i);
//			 List<WebElement> tdata = row.findElements(By.tagName("td"));
//			 for (int j=0; j<tdata.size(); j++) {
//				
//			
//			 
//			 WebElement data = tdata.get(j);
//			 String name = data.getText();
//			 //System.out.println(name);
//			 }
//				
//			System.out.println("Particular value");
		
			 WebElement row2 = trows.get(2);
			 List<WebElement> tData2 = row2.findElements(By.tagName("td"));
			 for (int k=0; k<tData2.size(); k++) {
				 WebElement data1 = tData2.get(k);
				 
				String name1 = data1.getText();
				System.out.println(name1);
			 
			 }
			  
			
		
	}

	}
}