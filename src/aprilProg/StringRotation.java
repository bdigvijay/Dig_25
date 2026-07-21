package aprilProg;

public class StringRotation {

	static void strRotation(String a, String b) {
		System.out.println("adding first string twice : "+ (a+a));
		System.out.println("Second String : "+ b);
		System.out.println((a + a).contains(b));
	}

	public static void main(String[] args) {
		StringRotation.strRotation("1234", "3412");
	}

}
