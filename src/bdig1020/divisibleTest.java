package bdig1020;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class divisibleTest {
	
	int count=0;
	
	
	void range(int fNum,int lNum,int divider) {
		int count=0;
		int sum = 0;
		for(int i = fNum; i <=lNum ; i++) {
			
			if(i%divider==0) {
				sum=sum+i;
				count++;
				System.out.println(i);
				
			}
		}
		System.out.println("Sum = "+ sum);
		System.out.println("count = "+ count);
		System.out.println("-----------------For loop done---------------------");
		
	}
	
	@Test
	void primeCheck(int num) {
		num = 17;
		for(int i = 1; i <= num; i++) {
			if(num%i==0) {
				count++;
				if(count>2) {
					break;
				}
			}
		}
		
		if(count==2) {
			System.out.println(num +" is prime");
		}else {
			System.out.println(num +" is not prime ");
		}
	}
	
	
	

	public static void main(String[] args) {

		divisibleTest divT = new divisibleTest();
//		divT.range(1,20,5);
//		divT.range(1,20,5);
		divT.primeCheck(17);
	}

}
