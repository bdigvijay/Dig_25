package exceptionDemo;

public class Example2 {
	int ans =0;
	
	int div(int x) {
		int a = 10;
		try {
			ans = a/x;
			System.out.println(ans);
		}catch(NullPointerException ne){
			ne.getMessage();
		}finally {
			ans = 1000;
			return ans;
		}
	}
	
	public static void main(String[] args) {
		Example2 ex2 = new Example2();
		int ans = ex2.div(10);
		System.out.println("Hi : "+ans);
	}
	
	
	
}
