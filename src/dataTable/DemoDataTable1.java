package dataTable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoDataTable1 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");

		driver.findElement(By.linkText("Demo Tables")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//header[contains(text(),'Employee Basic Information')]")));

		List<WebElement> rowsInTable1 = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr"));
		System.out.println("Number of rows in table1 : " + rowsInTable1.size());

		List<WebElement> listOfHeader = driver.findElements(By.xpath("//table[@id='table1']//tr/th"));
		System.out.print("Header Row : ");
		for (int index = 0; index < listOfHeader.size(); index++) {
			System.out.print(listOfHeader.get(index).getText() + "\t");
		}
		System.out.println();

		List<WebElement> firstRow = driver
				.findElements(By.xpath("//table[@id='table1']//td[text()='1']/parent::tr/td"));
		System.out.print("First Row	: ");
		for (int index = 0; index < listOfHeader.size(); index++) {
			System.out.print(firstRow.get(index).getText() + "\t");
		}

		System.out.println();
		
		WebElement dharaRow = driver.findElement(By.xpath("//table[@id='table1']//tbody//td[text()='Dhara']/parent::tr"));
		System.out.println(dharaRow.getText());
		
		
		driver.quit();

	}

}
