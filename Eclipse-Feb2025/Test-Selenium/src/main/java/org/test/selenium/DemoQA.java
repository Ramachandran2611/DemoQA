package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse-Feb2025\\Test-Selenium\\driver\\chromedriver-132v.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		// 1. CHECK BOX
		WebElement checkbox_Menu=driver.findElement(By.xpath("//span[normalize-space()='Check Box']"));
		js.executeScript("arguments[0].click();", checkbox_Menu); //javascript click
		driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
		WebElement checkbox=driver.findElement(By.xpath("//span[contains(text(),'Desktop')]"));
		if (!checkbox.isSelected()) { //Checkbox with condition
		    checkbox.click();
		    
		}
		System.out.println("// 1. CHECK BOX Completed Successfully");
		
		// 2. RADIO BUTTON
		driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
		js.executeScript("window.scrollBy(0,500))");
	     WebElement radio=driver.findElement(By.xpath("//label[contains(@for,'yesRadio')]"));
	     if(!radio.isSelected()) {
	    	 radio.click();
	     }
	     else {
	    	 System.out.println("Radio Button already selected");
	     }
		 
		System.out.println("Completed Successfully");
	}
}
