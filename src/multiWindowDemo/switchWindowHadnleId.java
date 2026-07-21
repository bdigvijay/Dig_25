package multiWindowDemo;


import java.time.Duration;

/*Switching using window handleId*/

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindowHadnleId {
	public static void main(String[] args){

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
	

		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		String title = driver.getTitle();
		System.out.println("Title before switching : " + title);

		Set<String> allWindowIds = driver.getWindowHandles();

		for (String window : allWindowIds) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}	
		}
		title = driver.getTitle();
		System.out.println("Title after switching : " + title);
		driver.switchTo().window(parentWindow);

	}

}
