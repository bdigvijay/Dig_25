package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Example1 {
	
	public void verifyNumbersofEmployeesInTable() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.quit();
		}
	
	
	@Test
	public void m1() {
		System.out.println("TC1 m1");
		Assert.assertEquals('G', 'g');
	}
	
	@Test
	public void m2() {
		System.out.println("TC1 m2");
	}

	@AfterMethod
	public void m3() {
		System.out.println("After method - TC1 m3");
	}
}
