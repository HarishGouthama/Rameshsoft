package com.rameshsoft.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesprog {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		
		driver.get("https://www.jqueryui.com");
		
		//driver.findElement(By.linkText("Autocomplete")).click();
		
		WebElement autocomplete = driver.findElement(By.linkText("Autocomplete"));
		autocomplete.click();
		
		Thread.sleep(5000);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are: " + frames.size());
		
		driver.switchTo().frame(0);
		
		WebElement tags = driver.findElement(By.id("tags"));
		tags.sendKeys("java");

		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(draggable, 150, 150).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		
		WebElement draggable1 = driver.findElement(By.id("draggable"));
		WebElement droppable1 = driver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(draggable1, droppable1).perform();
		
		Thread.sleep(10000);
		
		driver.close();		
	}
}
