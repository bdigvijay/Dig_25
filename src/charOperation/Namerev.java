package charOperation;

/*
Input - I am anjali
output - i la jnamai
*/

public class Namerev {

	String inputStr = "I am anjali";
	String outputStr = "";
	int m = inputStr.length();

	void strRev() {
		for (int i = m - 1; i >= 0; i--) {

			char ch = inputStr.charAt(i);

			for (int j = (m - 1) - i; j < m; j++) {
				char ch1 = inputStr.charAt(j);

				// System.out.println(i+"----"+ch);
				if (Character.isWhitespace(ch1)) {
					outputStr = outputStr + " ";
					System.out.println(ch);
					break;
//					ch = inputStr.charAt(i+1);
				}

				if (!Character.isWhitespace(ch))
					outputStr = outputStr + ch;
				break;
			}

		}
		System.out.println(outputStr);
//		System.out.println(outputStr.length());

	}

	public static void main(String[] args) {

		Namerev nr = new Namerev();
		nr.strRev();
	}
}
