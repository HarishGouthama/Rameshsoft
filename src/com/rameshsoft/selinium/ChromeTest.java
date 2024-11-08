package com.rameshsoft.selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
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
		
		
		driver.get("https://www.gmail.com");
		
		String actualTitle = driver.getTitle();
		System.out.println("Ttile is: "+ actualTitle);
		String expectedTitle = "Gmail";
		if (actualTitle.equalsIgnoreCase(expectedTitle) ) {
			System.out.println("Title is OK: ");
		}
		else {
			System.out.println("Title is Not Matching.");
		}
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current url is :" + CurrentUrl);
		
		String curWinName = driver.getWindowHandle();
		System.out.println("Current Window name is: " + curWinName);
		
		Thread.sleep(5000);
		
		//1. identify the element
		//WebElement un = driver.findElement(By.id("identifierId"));
		WebElement un = driver.findElement(By.name("identifier"));
		
		//2. Perform the action
		un.clear();
		un.sendKeys("rameshsoft.9177791456@gmail.com");
		
		Thread.sleep(5000);
		
	    //1. identify the element.
		WebElement nxt  = driver.findElement(By.id("identifierNext"));
		
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.visibilityOf(nxt));
		wait.until(ExpectedConditions.attributeContains(By.id("identifierNext"), "id", "identifierNext"));
		wait.until(ExpectedConditions.attributeContains(nxt , "id", "identifierNext"));
		wait.until(ExpectedConditions.attributeToBe(By.id("identifierNext"), "id", "identifierNext"));
		wait.until(ExpectedConditions.elementToBeClickable(nxt));
		wait.until(ExpectedConditions.invisibilityOf(nxt));
		
		
		
		//2. Perform the action.
		nxt.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		   
	}
}
