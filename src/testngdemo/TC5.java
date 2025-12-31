package testngdemo;

import org.testng.annotations.*;

public class TC5 {
	@Test(groups = "Regression")
	public void m1() {
		for (int i = 21; i <= 30; i++) {
			System.out.println("Tc5 - m1 - " + i);
		}
	}

	@Test(groups = "Redwire")
	public void m2() {
		for (int i = 41; i <= 50; i++) {
			System.out.println("Tc5 - m2 - " + i);
		}
	}

	@Test(groups = "Redwire")
	public void m3() {
		for (int i = 61; i <= 70; i++) {
			System.out.println("Tc5 - m3 - " + i);
		}
	}

}
