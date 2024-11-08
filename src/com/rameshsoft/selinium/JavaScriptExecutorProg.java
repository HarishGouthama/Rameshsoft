package com.rameshsoft.selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecutorProg {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\RameshSoft2directory\\Rameshsoft-PageObjectFramework\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		//driver.manage().timeouts().setScriptTimeout(4, TimeUnit.MINUTES);
		/*Options options = driver.manage();
		Timeouts timeouts = options.timeouts();
		timeouts.implicitlyWait(2, TimeUnit.MINUTES);*/
		
		driver.get("https://www.gmail.com");
		
		WebElement un =  driver.findElement(By.id("identifierId"));
		
		driver.findElement(By.id("identifierId"));
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		
		javascriptExecutor.executeAsyncScript("arguments[0].value = 'harish1992.it@gmail.com';", un);
		
		WebElement nxt = driver.findElement(By.id("identifierNext"));
		javascriptExecutor.executeScript("arguments[0].click();",nxt);
		
		javascriptExecutor.executeScript("window.location = 'https://www.rameshsoft.com'");
		
		String domainName = javascriptExecutor.executeScript("return document.domain;").toString();
		System.out.println("Domain name is: "+domainName);
		
		String url = javascriptExecutor.executeScript("return document.URL;").toString();
		System.out.println("Domain name is: "+domainName);
		
		String titleName = javascriptExecutor.executeScript("return document.title;").toString();
		System.out.println("Domain name is: "+titleName);
	}
}
