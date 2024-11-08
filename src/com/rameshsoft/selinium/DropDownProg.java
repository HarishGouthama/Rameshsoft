package com.rameshsoft.selinium;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProg {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\Drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//SearchContext sc = new ChromeDriver();   //Not recommanded in real time
		//RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com");
		
		WebElement createAccount = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		createAccount.click();
		
		WebElement dayDD = driver.findElement(By.id("day"));
		
		String tagName = dayDD.getTagName();
		if(tagName.equalsIgnoreCase("select"))
		{
			Select select = new Select(dayDD);
			
			
			boolean multiSelect = select.isMultiple();
			
			if(multiSelect) 
			{
				System.out.println("It is a multi select drop down");
			}
			else
			{
				System.out.println("It is not a multi select drop down");
			}
			
			select.selectByIndex(4);
			select.selectByValue("25");
			select.selectByVisibleText("15");
			
			
			WebElement firstEleOption = select.getFirstSelectedOption();
			String txt = firstEleOption.getText();
			System.out.println(txt);
			
			List <WebElement> listOptions = select.getOptions();
			System.out.println("Total no of elements from drop down is: " + listOptions.size());
			
			List <WebElement> selListOptions = select.getAllSelectedOptions();
			System.out.println("Selected list of options are: " + selListOptions.size());
		}
		
		else
		{
			List <WebElement> listOptions = driver.findElements(By.xpath("//input[@id='day']/option"));
			System.out.println("Total no of elements from the drop down is: " + listOptions.size());
			WebElement ele = driver.findElement(By.xpath("//select[@id = 'day"]/option[26]));
			ele.click();
		}
		
	}
}
