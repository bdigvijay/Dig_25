package p1;

public class stringMethod {

	public static void main(String[] args) {

		String str = "diJDgv14i46jaPRTy";
		System.out.println(str);
		str=str.replace("PR", "");
		System.out.println(str);
//		str=str.replaceAll("[aeiouA-Z0-9]","_");
//		System.out.println(str);

		StringBuilder sb = new StringBuilder(str);

	}



}



