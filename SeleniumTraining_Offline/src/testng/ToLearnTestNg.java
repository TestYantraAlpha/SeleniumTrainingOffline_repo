package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg {// TestNG class
	
	
	@Test
	public void sample() {//test case
		// test steps
		Reporter.log("sample testcase executed...",true);
	}
	
	@Test
	public void demo() {//test case
		// test steps
		Reporter.log("demo test case executed",true);
	}
	
	@Test
	public void Demo() {//test case
		// test steps
		Reporter.log("Demo testcase executed..",true);
	}	
}
