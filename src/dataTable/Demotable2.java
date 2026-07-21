package dataTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotable2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");

		driver.findElement(By.linkText("Demo Tables")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
		int rowIndex = rows.size();

		for(int i=0;i<rowIndex;i++) {
//			List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']//td[text()='"+ (i+1) +"']/parent::tr/td"));
			List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr["+(i+1)+"]/td"));
			for (int index = 0; index < firstRow.size(); index++) {
				System.out.print(firstRow.get(index).getText() + "\t" + "\t");
			}
			System.out.println();
		}
		driver.quit();
	}
}
