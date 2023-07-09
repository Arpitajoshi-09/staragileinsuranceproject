package com.project.staragile.insureme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumprjct1 {

	public class Testloginpage {

		@Test
		public void login() {
			System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://localhost:8087/service.html");
			
			
			String actualUrl="http://localhost:8087/service.html";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
		}
	}
}
