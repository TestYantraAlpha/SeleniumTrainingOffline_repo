package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestYantra {
	@Test(groups = "functionality")
	public void launchTestYantra() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testyantra.com/");
		Reporter.log("TestYantra class executed..",true);
	}
}
