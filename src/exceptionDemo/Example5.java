package exceptionDemo;

public class Example5 {

    void m1(int y) {
        try {
            System.out.println(3);			//3

            try {
                System.out.println(4);		//4
                int x = 10 / y;
                System.out.println(x);
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("ok");
            } finally {
                System.out.println("in finally");		//in finally
            }

            System.out.println("good");

        } catch (ArithmeticException ae) {
            System.out.println(3);				//3
        } finally {
            System.out.println(2);				//2
        }

        System.out.println("done");				//done
    }

    public static void main(String[] args) {
        Example5 ex7 = new Example5();
        ex7.m1(0);
        System.out.println("end");				//end
    }
}