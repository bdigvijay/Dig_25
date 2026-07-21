package testngdemo;

import org.testng.annotations.Test;

public class TC4 {

	@Test(groups = "Regression")
	public void m1() {
		for(int i = 1 ; i<=10; i++) {
			System.out.println("Tc4 - m1 - " + i);
		}
	}

	@Test(groups = "Redwire")
	public void m2() {
		for(int i = 31 ; i<=40; i++) {
			System.out.println("Tc4 - m2 - " + i);
		}
	}

	@Test(groups = "Redwire")
	public void m3() {
		for(int i = 51 ; i<=60; i++) {
			System.out.println("Tc4 - m3 - " + i);
		}
	}



}
