package exceptionDemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Example9 {
	
	void m1() throws FileNotFoundException{
		File file = new File("");
		FileInputStream inputFile = new FileInputStream(file);
	}
	
	
	public static void main(String[] args) {
		
	}

	}
	
