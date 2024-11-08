package com.rameshsoft.selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlertsProg {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft-PageObjectFramework\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///D:/RameshSoft%20Automation%20Testing/popup/popup/WindowUploadfile.html");
		
		driver.findElement(By.id("1")).sendKeys("D:\\ExcelR-Business analytics\\Dataanalystcontactdetails.txt");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String txt = alert.getText();
		
		System.out.println(txt);
		
		alert.sendKeys("rameshsoft");
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.close();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//button[@onclick = 'promptFuncrion()']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String txt = alert.getText();
		System.out.println(txt);
		
		alert.sendKeys("rameshsoft");
		
		alert.accept();
		
		Thread.sleep(5000);
		
		driver.close();*/
		
		
		
	}
}
