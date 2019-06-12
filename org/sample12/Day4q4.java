package org.sample12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4q4 {
	public static void main(String[] args) {
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari\\eclipse-workspace\\a\\selenium\\Selenium 8am\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
				WebElement txtpara = driver.findElement(By.xpath("//span[@class='testimonial-content']"));
				String text1 = txtpara.getText();
				WebElement txtFull = driver.findElement(By.xpath("(//div[@class='box'])[1]"));
				String txtlv = txtFull.getText();
				WebElement txtFull1 = driver.findElement(By.xpath("(//div[@class='box'])[2]"));
				String txtlv1 = txtFull.getText();
				
				
				System.out.println(text1);
				System.out.println(txtlv);
				System.out.println(txtlv1);
				
			}
	}

