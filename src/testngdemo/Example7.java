package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Example7 {
	
	
	@BeforeSuite
	public void e7bs() {
		System.out.println("This is E7_BS");
	}
	
	@BeforeMethod
	public void e7bm() {
		System.out.println("This is E7_BM");
	}
	
	@Test
	public void e7t1() {
		System.out.println("This is E7_T1");
	}
	
	@AfterClass
	public void e7ac() {
		System.out.println("This is E7_AC");
	}
	
	@AfterTest
	public void e7at() {
		System.out.println("This is E7_AT");
	}

}
