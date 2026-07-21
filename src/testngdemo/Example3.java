package testngdemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example3 {

	@BeforeMethod
	public void bM1() {
		System.out.println("Before Metgod : Tc3 m1");
	}

	@Test(invocationCount=2)			//attribute of @Test : runs command for 2 times
	public void m1() {
		System.out.println("TC3 m1");
	}

	public void m3() {
		System.out.println("Indirect - TC3 m3");
	}

	@Test
	public void m2() {
		System.out.println("TC3 m2");
		m3();
	}



}
