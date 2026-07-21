package seleniumDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		System.out.println("Step : To Launch Browser");
		driver.get("http://automationbykrishna.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");

		System.out.println("Step : To go to Registration page");
		WebElement reg1 = driver.findElement(By.id("registration2"));
		reg1.click();
		System.out.println("Clicked on Registration Link");

		Thread.sleep(2000);		//static wait

		System.out.println("Step : To Enter Username");
		WebElement userName = driver.findElement(By.id("unameSignin"));
		userName.sendKeys("mkanani");
		System.out.println("Username typed");

		System.out.println("Step : To Enter Password");
		WebElement passWord = driver.findElement(By.id("pwdSignin"));
		passWord.sendKeys("m123");
		System.out.println("Password typed");

		System.out.println("Step : Login");
		driver.findElement(By.id("btnsubmitdetails")).click();
		Thread.sleep(2000);

		System.out.println("Step : Alert Message");
		Alert alert = driver.switchTo().alert();	// Alert is class for which object needs to be created
		String alertText = alert.getText();			//alert is object and .getText() is method
		System.out.println(alertText);
		alert.accept();


		System.out.println("Step : To close Browser");
		driver.quit();
		System.out.println("Browser Closed");


	}


}
