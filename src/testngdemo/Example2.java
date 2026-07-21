package testngdemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example2 {


	@BeforeClass
	public void bcM1() {
		System.out.println("Before class m1 ");
	}

	@Test
	public void m1() {
		System.out.println("TC2 m1");
		Assert.assertTrue(false);
	}

	@Test
	public void m2() {
		System.out.println("TC2 m2");
	}



}
