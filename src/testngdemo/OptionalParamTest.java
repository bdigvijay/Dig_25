package testngdemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParamTest {

	@Parameters("browser")
	@Test
	public void start(@Optional("safari") String browserName) {
		System.out.println(browserName);
	}

}
