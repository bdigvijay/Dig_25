package oops;

public class Child extends Parent {

		int y = 8;
		int z = 10;

		int sub() {
			return x-z;
		}

		@Override
		int mul() {
			return y/z;
		}

}
