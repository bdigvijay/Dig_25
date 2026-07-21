package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	DropDownDemo() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	static WebDriver driver;
	WebElement selectCountry;
	Select countryDd;

	void singleSelectDD() {

		selectCountry = driver.findElement(By.id("country"));
		countryDd = new Select(selectCountry);
		System.out.println(countryDd.isMultiple());
		countryDd.selectByValue("australia");
		countryDd.selectByIndex(3);
		countryDd.selectByContainsVisibleText("India");

	}

	void multiSelectDD() throws InterruptedException {
		selectCountry = driver.findElement(By.id("colors"));
		countryDd = new Select(selectCountry);
		System.out.println(countryDd.isMultiple());

		countryDd.selectByValue("blue");
		Thread.sleep(1000);
		countryDd.selectByIndex(0);
		Thread.sleep(1000);
		countryDd.selectByContainsVisibleText("Yellow");

		Thread.sleep(1000);
		countryDd.deselectByIndex(0);
		Thread.sleep(1000);
		countryDd.deSelectByContainsVisibleText("Blue");


	}

	public static void main(String args[]) throws InterruptedException{

		DropDownDemo dD = new DropDownDemo();
		//dD.singleSelectDD();
		dD.multiSelectDD();

	}

}
