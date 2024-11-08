package com.rameshsoft.selinium;


import java.awt.Desktop.Action;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		((Object) driver).find();
		
		/*//driver.get("https://www.gmail.com");
		//driver.navigate().to("https://www.gmail.com");
		//URL url = new URL("https://www.gmail.com");
		//driver.navigate().to(url);
		
		Navigation navigation = driver.navigate();
		//navigation.to("https://www.gmail.com");
		navigation.to(new URL("https://www.gmail.com"));
		
		//Using javascriptExecutor also
		
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("harish1992.it@gmail.com");
		
		Actions actions = new Actions(driver);
		//actions.sendKeys(un, "harish1992.it@gmail.com").build().perform();
		//actions.click(un).sendKeys("harish1992.it@gmail.com").build().perform();
		
		Actions actions2 = actions.click(un);
		Actions actions3 = actions2.sendKeys("harish1992.it@gmail.com");
		org.openqa.selenium.interactions.Action action = actions3.build();
		action.perform();
		actions2.sendKeys("harish1992.it@gmail.com");
		
		//actions.doubleClick(un).sendKeys("harish1992.it@gmail.com").build().perform();
		
		//ctrl+a ctrl+s ctrl+shift+a
		
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).sendKeys(Keys.HOME).sendKeys(Keys.END).build().perform();
		
		actions.sendKeys(Keys.ARROW_LEFT).build().perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).perform();
		
		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT),"t").perform();*/
		
		
		 driver.get("https://www.amazon.in");
		 Actions actions = new Actions(driver);
		 
		 WebElement eng = driver.findElement(By.xpath("//div[text() = 'EN']"));
		 
		 //actions.moveToElement(eng).build().perform();
		 
		 actions.moveToElement(eng).perform();
		 
		 String txt = eng.getText();
		 System.out.println(txt);
		 
		 String tagName = eng.getTagName();
		 System.out.println(tagName);
		 
		//Using JavascriptExecutor also.
		
		WebElement nxt = driver.findElement(By.id("identifierNext"));
		//nxt.click();
		//actions.click(nxt).build().perform();
		//actions.doubleClick(nxt).build().perform();
		actions.sendKeys(nxt, Keys.ENTER).build().perform();
		
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("rameshsoft");
		
		actions.sendKeys(Keys.ENTER).build().perform();
		
		WebElement inst = driver.findElement(By.xpath("//h3[contains(text(),'RAMESHSOFT - India')]"));
		
		//actions.contextClick(inst).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		/*Actions actions2 = actions.contextClick(inst);
		Actions actions3 = actions2.sendKeys(Keys.ARROW_DOWN);
		Actions actions4 = actions3.sendKeys(Keys.RETURN);
		Action action = actions4.build()
		action.perform();*/
		
		Thread.sleep(5500);
		
		driver.close();
		
		
	}
}
