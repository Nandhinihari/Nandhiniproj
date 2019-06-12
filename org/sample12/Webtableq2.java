package org.sample12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableq2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		 List<WebElement> trows = driver.findElements(By.tagName("tr"));
		 for (int i=0 ;i<trows.size() ;i++ ) {
			 WebElement row = trows.get(i);
			 
			
		
			 WebElement row1 = trows.get(0);
			 List<WebElement> tData1 = row1.findElements(By.tagName("td"));
			 for (int j=0; j<tData1.size(); j++) {
				 WebElement data1 = tData1.get(j);
				 
				String name1 = data1.getText();
				System.out.println(name1);
				
				
				WebElement row2 = trows.get(1);
				 List<WebElement> tData2 = row2.findElements(By.tagName("td"));
				 for (int k=0; k<tData2.size(); k++) {
					 WebElement data2 = tData2.get(k);
					 
					String name2 = data1.getText();
					System.out.println(name2);
				 
			 
	}

		 }}}}
