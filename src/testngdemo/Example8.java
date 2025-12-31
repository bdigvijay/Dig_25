package testngdemo;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example8 {
	
	
	@AfterSuite
	public void e8as() {
		System.out.println("This is E8_AS");
	}
	
	@AfterMethod
	public void e8am() {
		System.out.println("This is E8_AM");
	}
	
	@Test
	public void e8t1() {
		System.out.println("This is E8_T1");
	}
	
	@BeforeClass
	public void e8bc() {
		System.out.println("This is E8_BC");
	}
	
	@BeforeTest
	public void e8bt() {
		System.out.println("This is E8_BT");
	}

}
