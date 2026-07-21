package multiWindowDemo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SwitchMultplewindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfc.bank.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[@class='cmp-teaser__content ']//a[@title='NetBanking']")).click();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='mainDopDownwrapp mainTabKey']//a[@data-value='NRI']")).click();

		String nriWindowURL = "nri-banking";
		String netbankWindowURL = "netbanking";

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println("Switching to netbanking");
		for (String window : allWindows) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().contains(netbankWindowURL)) {

				break;
			}
		}

		driver.switchTo().frame("login_page");
		WebElement wlmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hdfcwelcmetxtId")));
		if (wlmsg.isDisplayed()) {
			System.out.println("Page is Displayed");
		} else {
			System.out.println("Page is not Displayed");
		}

	}
}
