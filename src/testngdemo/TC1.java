package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 {

	@Test(groups = "Smoke")
	public void m1() {
		System.out.println("TC1 - m1");
	}

	@Test(groups = "Redwire")
	public void m2() {
		System.out.println("TC1 - m2");
	}

	@Test(groups = "Regression")
	public void m6() {
		System.out.println("TC1 - m6");
	}

	@Test(groups = "Smoke")
	public void m7() {
		System.out.println("TC1 - m7");
		Assert.assertNull(null);
	}

	@Test(groups = "Regression")
	public void m3() {
		System.out.println("TC1 - m3");
	}


	@Test(groups = "Redwire")
	public void m4() {
		System.out.println("TC1 - m4");
	}

	@Test(groups = "Smoke")
	public void m5() {
		System.out.println("TC1 - m5");
	}

}
