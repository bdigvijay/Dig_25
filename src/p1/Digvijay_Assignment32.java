package p1;

/*Print frequency of all characters from given input.

input : aakanksha
output : a -> 4
         k -> 2
         n -> 1
         s -> 1
         h -> 1*/


public class Digvijay_Assignment32 {

	void freqChar(String name) {
		for(int j = 0 ; j < name.length(); j++) {
			int count=0;
			if(name.indexOf(name.charAt(j))==j) {
				for(int i = 0 ; i < name.length(); i++) {
					if(name.charAt(j)==name.charAt(i)) {
						count = count + 1;
					}
			}
			System.out.println(name.charAt(j)+" : "+count);
			}
		}
	}
	
	public static void main(String[] args) {
		Digvijay_Assignment32 das32 = new Digvijay_Assignment32();
		das32.freqChar("digvijay");
	}
	
	
	
}
