package testngdemo;

import org.testng.annotations.*;

public class TC6 {

	String x = "";
	
	@BeforeClass
	public void BC() {
		System.out.println("This is without Thread local concept");
	}

	@Test
	public void m1() throws InterruptedException {
		for (int i = 1; i <= 50; i++) {
			x = "* " + x;
			Thread.sleep(200);
			System.out.println(x);
		}
	}

	@Test
	public void m2() throws InterruptedException {
		for (int i = 1; i <= 50; i++) {
			x = "- " + x;
			Thread.sleep(100);
			System.out.println(x);
		}
	}
}
