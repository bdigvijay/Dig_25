package exceptionDemo;

public class Example8 {

    void m1(int y) {
        try {
            System.out.println(3);							//3
        } catch (ArithmeticException ae) {
            System.out.println(3);
        } finally {
            System.out.println(2);							//2

            try {
                System.out.println(4);						//4
                int x = 10 / y;
                System.out.println(x);
            } catch (ArithmeticException ae) {
                System.out.println("ok");					//ok
            } finally {
                System.out.println("in finally");			//in infinally
            }

            System.out.println("good");						//good
        }

        System.out.println("done");				//done
    }

    public static void main(String[] args) {
        Example8 ex7 = new Example8();
        ex7.m1(0);
        System.out.println("end");
    }
}
