package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegistrationPage {

	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");

		System.out.println("Step 1 - Registration Page");
		driver.findElement(By.id("registration2")).click();
		Thread.sleep(2000);
		WebElement reg = driver.findElement(By.xpath("//h1[text()='Registration']"));
		Assert.assertTrue(reg.isDisplayed());

		System.out.println("Step 2 - Login");
		driver.findElement(By.id("unameSignin")).sendKeys("digvijay");
		driver.findElement(By.id("pwdSignin")).sendKeys("di5123466");
		driver.findElement(By.id("btnsubmitdetails")).click();

		System.out.println("Step 3 - Login Verification");
		Alert alert = driver.switchTo().alert();
		String actualMsg = alert.getText();
		String expectedMsg = "Success!";
		Assert.assertEquals(actualMsg, expectedMsg, "Login Successfull");

		System.out.println("Step 4 - Tear down");
		alert.accept();
		// alert.accept();
		driver.quit();


	}

}
