package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		WebElement reg1 = driver.findElement(By.id("registration2"));
		reg1.click();
		System.out.println("Clicked on Registration Link");
		
		Thread.sleep(2000);		//static wait
		
		WebElement userName = driver.findElement(By.id("unameSignin"));
		userName.sendKeys("digvijay");
		System.out.println("Username typed");
		
		WebElement passWord = driver.findElement(By.id("pwdSignin"));
		passWord.sendKeys("digvijay");
		System.out.println("Password typed");
		
		
		//driver.quit();
		System.out.println("Browser Closed");
		
		
	}
	

}
