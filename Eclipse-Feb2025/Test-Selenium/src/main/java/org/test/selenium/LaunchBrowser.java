package org.test.selenium;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Eclipse-Feb2025\\Test-Selenium\\driver\\chromedriver-132v.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://copilot.microsoft.com/");
//		driver.get("https://adactinhotelapp.com/");
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(1000);
		System.out.println("completed successfully");
		Thread.sleep(1000);
		driver.manage().window().maximize();
//		Thread.sleep(1000);
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-test=\"shopping-cart-link\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Checkout\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("first-name")).sendKeys("Rama");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Chandran");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("560066");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		Thread.sleep(1000);
		WebElement button=driver.findElement(By.xpath("//button[text()='Back Home']"));
		Thread.sleep(1000);
		String actualText = button.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "Back Home", "Back Home");
		Assert.assertTrue(button.isDisplayed());
		Assert.assertTrue(button.isEnabled());
//		Assert.assertEquals(button.getText(), "Back Home");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(button.isDisplayed(), "Back Home button is not displayed!");
		softAssert.assertTrue(button.isEnabled(), "Back Home button is not enabled!");
		softAssert.assertEquals(button.getText(), "Back Home", "Button text does not match!");
		if(button.isDisplayed()) {
			System.out.println("Element is visible");
			button.click();
        } else {
            System.out.println("Element not found");
        }
		driver.quit()

		
		
;		//		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		fname.sendKeys("Rama");
////		 WebElement firstNameInput = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		WebElement lname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//		lname.sendKeys("chandran");
//		driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
//		driver.close();
//		driver.quit();
		
	}

}
