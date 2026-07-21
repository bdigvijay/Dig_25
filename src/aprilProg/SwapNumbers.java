package aprilProg;

public class SwapNumbers {
	
	static void swapNumber(int a, int b) {
		System.out.println("Before 	: a --> " + a + " b --> "+ b);	
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After 	: a --> " + a + " b --> "+ b);	
	}

	public static void main(String[] args) {
		SwapNumbers.swapNumber(5, 4);
	}
	
}
