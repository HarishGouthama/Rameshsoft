package com.rameshsoft.selenium;

import java.util.List; // Use java.util.List instead of java.awt.List

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProgcopy {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuleSoft\\OneDrive\\Desktop\\New folder\\RameshSoft\\src\\Drivers\\chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the window and delete all cookies
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        // Navigate to Facebook
        driver.get("https://www.facebook.com");
        
        // Locate the "Create new account" button and click it
        WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        
        // Locate the day dropdown element
        WebElement dayDD = driver.findElement(By.id("day"));
        
        String tagName = dayDD.getTagName();
        if(tagName.equalsIgnoreCase("select")) {
            Select select = new Select(dayDD);
            
            // Check if the dropdown is multi-select
            boolean multiSelect = select.isMultiple();
            
            if(multiSelect) {
                System.out.println("It is a multi-select dropdown");
            } else {
                System.out.println("It is not a multi-select dropdown");
            }
            
            // Select options by index, value, and visible text
            select.selectByIndex(4);
            select.selectByValue("25");
            select.selectByVisibleText("15");
            
            // Get the first selected option and print its text
            WebElement firstEleOption = select.getFirstSelectedOption();
            String txt = firstEleOption.getText();
            System.out.println(txt);
            
            // Get all options in the dropdown
            List<WebElement> listOptions = select.getOptions();
            System.out.println("Total number of elements in the dropdown: " + listOptions.size());
            
            // Get all selected options
            List<WebElement> selListOptions = select.getAllSelectedOptions();
            System.out.println("Number of selected options: " + selListOptions.size());
        } else {
            // Handle case where the element is not a dropdown
            List<WebElement> listOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
            System.out.println("Total number of elements in the dropdown: " + listOptions.size());
            
            // Correctly locate an option
            WebElement ele = driver.findElement(By.xpath("//select[@id='day']/option[26]"));
            System.out.println("Element text: " + ele.getText());
        }
        
        // Close the browser
        driver.quit();
    }
}
