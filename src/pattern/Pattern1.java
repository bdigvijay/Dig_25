package pattern;

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 * 
 */

public class Pattern1 {

	
	void patt1() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <=7 ; i++){
			for (int j = 1; j <= 8-i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void patt2() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <=7 ; i++){
			for (int j = 1; j <= 8-i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
		System.out.println();
	}
	
	void patt3() {
		
		for (int i = 1; i <=7 ; i++){
			int count = 0;
			for (char j = 'A'; j <= 'G'; j++) {
				count++;
				System.out.print(j + " ");
				if(count==i) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1 ; i <= 7 ; i++) {
			int count = 0;
			for(char ch = 'A'; ch <= 'G'; ch++) {
				count++;
				if(count==9-i) {
					break;
				}
				System.out.print(ch + " ");
				}
			System.out.println();
			}
		}
		
	
	public static void main(String[] args) {
		Pattern1 p1 = new Pattern1();
		p1.patt1();
		p1.patt2();
		p1.patt3();
	}
}
