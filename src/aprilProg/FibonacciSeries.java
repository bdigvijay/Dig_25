package aprilProg;

import java.util.*;

public class FibonacciSeries {
	
    static void fiboSeries(int a){
        List<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        
        for(int i = 2 ; i < a ; i++){
            al.add(al.get(i-2)+al.get(i-1));
        }
        
        System.out.println(al);
    }
    

    public static void main(String[] args) {
    	FibonacciSeries.fiboSeries(15);
    }

}
