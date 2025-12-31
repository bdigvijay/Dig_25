package testngdemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class Example4 {
	
	@BeforeClass
	public void m1() {
		System.out.println("Before class - TC4 m1");
	}
	
//	@BeforeMethod
//	public void m2() {
//		System.out.println("Before method TC4 m2");
//	}
	
	@Test(priority=4)					//attribute of @Test priority : decides which test case to run first
	public void m6() {
		System.out.println("TC4 m6");
	}
	
	@Test(priority=2,dependsOnMethods="m6") //attribute of @Test dependsOnMethods: decides which are dependent tests
	public void m7() {
		System.out.println("TC4 m7");
		Assert.assertNull(null);
	}
	
	@Test(dependsOnMethods={"m6","m7"})
	public void m3() {
		System.out.println("TC4 m3");
	}
	
	
	@AfterMethod
	public void m4() {
		System.out.println("After method - TC4 m4");
	}
	
	@AfterClass
	public void m5() {
		System.out.println("After class - TC4 m5");
	}

}
