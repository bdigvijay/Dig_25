package aprilProg;


import java.util.Arrays;

public class AnagramExample {
	
	void anagramCheck(String first , String second) {
		
		System.out.println(first.equals(second));
		
		char[] chArr1 = first.toCharArray();
		char[] chArr2 = second.toCharArray();
		
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		
		boolean chArray1 = Arrays.equals(chArr1, chArr2);
		
		System.out.println(chArray1);

	}
	
	
	public static void main(String[] args) {
		
		AnagramExample ae = new AnagramExample();
		ae.anagramCheck("one", "nuo");	}

}
