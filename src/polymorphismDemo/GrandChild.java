package polymorphismDemo;

public class GrandChild extends Child1 {
	
	int x = 1000;
	void m3() {
		System.out.println(x);
	}
	
	void m1() {
		int x = 1, y = 2;
		System.out.println("grandchild m1 :"+(x-y));
	}

}
