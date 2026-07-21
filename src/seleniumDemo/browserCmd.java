package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCmd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationbykrishna.com/");
		String title = driver.getTitle();
		System.out.println("This is "+ title);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);


		driver.quit();
		System.out.println("End");
		}



}
