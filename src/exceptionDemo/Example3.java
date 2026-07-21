package exceptionDemo;

public class Example3 {

    void m1(int y) {
        try {
            System.out.println(3);		//3
            int x = 10 / y;	
            System.out.println(x);		//10
        } catch (ArithmeticException ae) {
            System.out.println(1);

            try {
                String[] arr = {"Hi", "techno"};
                System.out.println(arr[arr.length].charAt(arr[0].length()));
            } catch (StringIndexOutOfBoundsException ae1) {
                System.out.println(3);
            } finally {
                System.out.println(4);
            }

            System.out.println(5);
        } finally {
            System.out.println(2);		//2
        }

        System.out.println("done");		//done
    }

    public static void main(String[] args) {
        Example3 ex7 = new Example3();
        ex7.m1(1);
        System.out.println("end");		//end
    }
}