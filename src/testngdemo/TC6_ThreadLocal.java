package testngdemo;

import org.testng.annotations.*;

public class TC6_ThreadLocal {
	
	ThreadLocal<String> threadIntegerLocal = new ThreadLocal<String>();
	
	static String x = "";
	
	@BeforeClass
	public void BC() {
		System.out.println("This is with Thread local concept");
	}
	
	@BeforeMethod
	public void BM() {
		threadIntegerLocal.set(x);
	}
	
	@Test
	public void m1() throws InterruptedException {
		String y = threadIntegerLocal.get();
		for (int i = 1; i <= 50; i++) {
			y = "* "+y;
			Thread.sleep(200);
			System.out.println(y);
		}
	}
	
	@Test
	public void m2() throws InterruptedException {
		String y = threadIntegerLocal.get();
		for (int i = 1; i <= 50; i++) {
			y = "- "+y;
			Thread.sleep(100);
			System.out.println(y);
		}
		}
	}
