package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCmd {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();

		
		String title = driver.getTitle();
		System.out.println("This is "+ title);
		
		driver.navigate().to("http://automationbykrishna.com/");
		title = driver.getTitle();
		System.out.println("This is "+ title);
		
		driver.navigate().back();
		title = driver.getTitle();
		System.out.println("This is "+ title);
		
		driver.navigate().refresh();
		System.out.println("page is refreshed");

		driver.navigate().forward();
		title = driver.getTitle();
		System.out.println("This is "+ title);
		
		driver.quit();
		System.out.println("End");
		}
	
	
	
}
