package testngdemo;
	
import org.testng.annotations.Test;
	
public class ExampleThreadLocal {
	
	ThreadLocal<Integer> localThreadInt = new ThreadLocal<Integer>();
	
	@Test
	public void m1() throws InterruptedException {
		localThreadInt.set(100);
		Thread.sleep(2000);
		System.out.println("m1 : " + localThreadInt.get());
	}
	
	@Test
	public void m2() {
		localThreadInt.set(200);
		System.out.println("m2 : " + localThreadInt.get());
	}
	
}