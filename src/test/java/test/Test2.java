package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test2 {
	
	//Testuje sobie rozne anotacje TestNG wraz ze sterowaniem z plików testng.xml
	
	@Test(groups = {"smoke"})
	public void test2Method1() {
		System.out.println("test 2 - pierwsza metoda");
	}
	
	@Test
	public void test2Method2() {
		System.out.println("test 2 - druga metoda");
	
		
	}
	
	@Test(dataProvider="getData")
	public void test2Method3(String username, String password) {
		System.out.println("test 2 - trzecia metoda");
		System.out.println(username + password);
		
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("ill be first");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("przed testami 2");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("ill be last");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object data[][] = new Object[3][2];
		
		data[0][0]= "username1";
		data[0][1] = "password1";
		
		data[1][0]= "username2";
		data[1][1] = "password2";
		
		data[2][0]= "username3";
		data[2][1] = "password3";
		
		return data;
	}

}
