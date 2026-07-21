package seleniumDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollDemo {

	public static void main(String args[]) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		WebElement basPage = driver.findElement(By.id("basicelements"));

		System.out.println("Step 1 - Navigating to basic element");
		basPage.click();
		Thread.sleep(5000);

		WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control m-bot15']"));

		System.out.println("Step 2 - Scrolling to drop-down");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dropDown);
		if (dropDown.isDisplayed()) {
			System.out.println("Step 2 - Drop down is displayed");
		}


		System.out.println("Step 3 - Selecting from the drop-down 1");
		Select drp1 = new Select(dropDown);
		// Thread.sleep(2000);
		drp1.selectByVisibleText("3");

		System.out.println("Step 4 - Selecting from the drop-down 2");
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select drp2 = new Select(dropDown2);
		drp2.selectByIndex(1);
		// Thread.sleep(2000);
		drp2.selectByVisibleText("4");
		List<WebElement> selOpt = drp2.getOptions();

		List<String> al = new ArrayList();

		for (WebElement i : selOpt) {
			al.add(i.getText());
			if(i.isSelected()) {
				System.out.println("Step 5 - Selected option : "+i.getText());
			}
		}

		System.out.println("Step 5 - Other Options :" + al);

		Thread.sleep(2000);
		System.out.println("Step 6 - Scrolling back to top");
		js.executeScript("window.scrollTo(0,500);");
		Thread.sleep(3000);

		//driver.quit();

	}

}
