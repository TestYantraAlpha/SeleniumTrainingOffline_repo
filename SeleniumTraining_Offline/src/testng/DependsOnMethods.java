package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		Reporter.log("login test case executed..",true);
	}
	
	@Test
	public void register() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		
		Reporter.log("register test case executed..",true);
//		Assert.fail();
	}
}
