package testngdemo;

import org.testng.Assert;
import org.testng.annotations.*;

public class TC2 {
	

	@Test(groups = "Redwire")
	public void m1() {
		System.out.println("TC2 - m1");
	}
	
	@Test(groups = "Regression")
	public void m2() {
		System.out.println("TC2 - m2");
	}
	
	@Test(groups = {"Smoke","Redwire"})
	public void m6() {
		System.out.println("TC2 - m6");
	}
	
	@Test(groups = "Regression")
	public void m7() {
		System.out.println("TC2 - m7");
		Assert.assertNull(null);
	}
	
	@Test(groups = "Redwire")
	public void m3() {
		System.out.println("TC2 - m3");
	}
	
	
	@Test(groups = "Redwire")
	public void m4() {
		System.out.println("TC2 - m4");
	}
	
	@Test(groups = "Regression")
	public void m5() {
		System.out.println("TC2 - m5");
	}

}
