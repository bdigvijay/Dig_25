package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3 {

	@Test(groups = "Regression")
	public void m1() {
		System.out.println("TC3 - m1");
	}

	@Test(groups = "Redwire")
	public void m2() {
		System.out.println("TC3 - m2");
	}

	@Test(groups = "Redwire")
	public void m6() {
		System.out.println("TC3 - m6");
	}

	@Test(groups = "Redwire")
	public void m7() {
		System.out.println("TC3 - m7");
		Assert.assertNull(null);
	}

	@Test(groups = "Smoke")
	public void m3() {
		System.out.println("TC3 - m3");
	}


	@Test(groups = "Smoke")
	public void m4() {
		System.out.println("TC3 - m4");
	}

	@Test
	public void m5() {
		System.out.println("TC3 - m5");
	}

}
