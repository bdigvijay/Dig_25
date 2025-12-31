package testngdemo;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	@Parameters("browser")
	@BeforeMethod
	public void startup(String browserName) {
		System.out.println("Starting -- " + browserName);
	}
	
	@Parameters({"browser","env"})
	@Test
	public void start (String browserName, String envName) {
		System.out.println(browserName+"---"+envName);
		
	}
	
}
