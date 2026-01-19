package dataProviderExamples;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngdemo.ExcelOperations;

public class Example10DataProvider {

	@Test(dataProvider = "getDetails")
	public void candInform1(String name, int rollNo) {
		System.out.println("---------------------------");
		System.out.println("Candidate name : " + name);
		System.out.println("Candidate Rollno : " + rollNo);
	}
	
	@Test(dataProvider = "loginDetails")
	public void loginInformation(String username, String password , String message) {
		System.out.println("---------------------------");
		System.out.println("Candidate name : " + username);
		System.out.println("Candidate password : " + password);
		System.out.println("Candidate message: " + message);
	}

	@DataProvider
	public Object[][] getDetails1() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Digvijay";
		data[0][1] = 123;
		data[1][0] = "TechnoCredits";
		data[1][1] = 456;
		return data;
	}
	
	@DataProvider
	public Object[][] loginDetails() throws IOException {
		Object[][] data = ExcelOperations.readExcelData(".//test-data/LoginData.xlsx","data");
		return data;
	}

}
