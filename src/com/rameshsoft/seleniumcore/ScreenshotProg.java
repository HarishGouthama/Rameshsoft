package com.rameshsoft.seleniumcore;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotProg {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\Rameshsoft-PageObjectFramework\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//RemoteWebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		//driver.manage().timeouts().setScriptTimeout(4, TimeUnit.MINUTES);
		/*Options options = driver.manage();
		Timeouts timeouts = options.timeouts();
		timeouts.implicitlyWait(2, TimeUnit.MINUTES);*/
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		
		
		File file1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1 , new File("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\Screenshot\\GmailHomePage.jpeg"));  
		
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("rameshsoft.9177791456@gmail.com");
		
		File file2 = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file2 , new File("C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\Screenshot\\GmailHomePage1.jpeg"));  
		
		
		driver.close();
	}
}
