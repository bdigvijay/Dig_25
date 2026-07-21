package seriesPrograms;

public class Prog1 {
	public static void main(String args[]) {
		for (char i = 'G'; i > 'A'; i--) {
			for (char j = 'A'; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		for (char i = 'A'; i <= 'G'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
