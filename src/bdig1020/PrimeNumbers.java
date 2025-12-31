package bdig1020;

public class PrimeNumbers {
	int num;
	int count;
	int sum;
	int prSum;
	int pnCount;
	String prn1="";
	String str="";
	
	
	//To check whether number is divisible by  a divider1 
	void divisibilityTest(int num,int divider1) {
		if(num%divider1==0) {
			count=count+1;
			str=str+num+", ";
			sum=sum+num;
		}
	}
	
	//To check whether number is divisible by  a divider1 & divider2
	void divisibilityTest(int num,int divider1,int divider2) {
		if(num%divider1==0 && num%divider2==0) {
			count=count+1;
			str=str+num+", ";
			sum=sum+num;
		}
	}
	
	//To check divisible numbers in a range ascending order
	void rangeDivisibility(int fsNum, int lsNum,int divider1) {
		for(int num = fsNum ; num<=lsNum; num++) {
			divisibilityTest(num, divider1);
		}
		System.out.println("Numbers divisible within range are "+ str);
	}
	
	
	void rangeDivisibilityTest(int fsNum, int lsNum, int divider1,int divider2) {
		for(int num = fsNum ; num<=lsNum; num++) {
			divisibilityTest(num,divider1,divider2);
		}
		System.out.println("Numbers divisible within range are "+ str);
	}
	
	
	//To check prime number
	String primeCheck(int num) {
		count=0;
		for(int x=1;x<=num;x++) {
			divisibilityTest(num,x);
		}
		if(count==2) {
			pnCount=pnCount+1;
			prn1=prn1+num+", ";
			prSum=prSum+num;
			return prn1 + "is a Prime number";
		} else {
			return prn1 + "is not a Prime number";
		}
	}
	
	
	//To print prime numbers in a range ascending order
	void rangePrimeCheck(int fsNum, int lsNum) {
		prn1="";
		for(int num = fsNum ; num<=lsNum; num++) {
			primeCheck(num);
		}
		System.out.println("Prime Numbers within range are "+ prn1);
	}
	
	void displayResults() {
		System.out.println("Sum of prim numbers is : "+ prSum);
		System.out.println("Sum of numbers is : "+ sum);
		System.out.println("Total prime numbers are "+ pnCount);
		
	}
	
	
	public static void main(String[] args) {
		PrimeNumbers pn = new PrimeNumbers();
		pn.rangePrimeCheck(1,10);
		System.out.println("Sum of prim numbers is : "+ pn.prSum);
		
		
		//pn.rangeDivisibility(1, 100, 8);
		//pn.rangeDivisibilityTest(1, 100, 3, 8);
	}
}