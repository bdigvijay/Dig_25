package dataTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoTable3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");

		driver.findElement(By.linkText("Demo Tables")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//header[contains(text(),'Employee Manager')]")));

		List<WebElement> header = driver.findElements(By.xpath("//table[@class='table table-striped']/thead//th"));

		int cols = header.size();
		int rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr")).size();

		for (int colIndex = 0; colIndex < cols; colIndex++) {
			System.out.print(header.get(colIndex).getText() + "\t");
		}
		System.out.println();
		for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
			List<WebElement> rowElements = driver.findElements(
					By.xpath("//table[@class='table table-striped']/tbody/tr[" + (rowIndex + 1) + "]/td"));
			for (int colIndex = 0; colIndex < cols; colIndex++) {
				System.out.print(rowElements.get(colIndex).getText() + "\t" + "\t");
			}
			System.out.println();
		}
		
		
		driver.quit();
	}
}
