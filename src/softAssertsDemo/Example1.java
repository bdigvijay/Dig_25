package softAssertsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example1 {
	
	String str1 = "Hello";
	String Str2 = "hello";
	String str3="";
		
	@Test()
	public void m1() {
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(str1, Str2);		//Soft asserts : execution continues even after step fails
		System.out.println("Pune");
		System.out.println();
		
		sa.assertEquals(str1, Str2,"This are notequal");
		System.out.println("Hello");
		System.out.println();
		
		Assert.assertTrue(str3.isEmpty());		//Hard assert ; execution stops as soon as step fails
		
		sa.assertNull(str1,"This is not null");
		System.out.println("Shirur1");
		System.out.println();
		
		sa.assertNull(str3,"This is null");
		System.out.println("Shirur2");
		
		sa.assertAll();		//Considered as hard assert ; Outputs fails if one of the soft assert is failed
		
		
	} 
	
	
	
}
