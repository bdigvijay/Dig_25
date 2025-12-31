package bdig1020;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NumberCheck {
	
	int num;
	int divider1;
	int divider2;
	int sum;
	int count;
	String str ="Numbers are/is ";
	int prCount;
	
	@Test
	//To check whether the number is divisible by 1 number
	void divisibilityTest(int num , int divider1) {
		num = 5979;
		divider1 = 25;
		if(num%divider1==0) {
			sum=sum+num;
			count=count+1;
			str = str + num + ", ";
		} 
	}
	
	
	//To check whether the number is divisible by 2 numbers
	void divisibilityTest(int num , int divider1, int divider2) {
		if(num%divider1==0 && num%divider2==0) {
			sum=sum+num;
			count=count+1;
			str = str + num + ", ";
		}
	}
	
	
	void rangeDivision(int firstNumber, int lastNumber, int divider1) {
//		sum=0;
//		count=0;
		str = "";
		for(int num=firstNumber; num <= lastNumber; num++) {
			divisibilityTest(num,divider1);
		}
	}
	
	void rangeDivision(int firstNumber, int lastNumber, int divider1, int divider2) {
		for(int num=firstNumber; num <= lastNumber; num++) {
			divisibilityTest(num,divider1,divider2);
		}
	}
	
	void primeCheck(int num) {
		count=0;
		for(int x=1;x<=num;x++) {
			if(num%x==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println(num + " is a prime number");
		}
	}
	
	
	void rangePrimeNumber(int firstNumber, int lastNumber) {
		for (int num=firstNumber; num<=lastNumber; num++) {
			System.out.println(num);
		}
	}
	
	
	
	
	
	void displayTotal() {
		System.out.println(str);
		System.out.println("Total sum of numbers is " + sum);
		System.out.println("Average of numbers is " + (sum/count));
		
	}


	public static void main(String[] args) {
		NumberCheck numCheck = new NumberCheck();
		numCheck.displayTotal();
		
	}
	
	

}