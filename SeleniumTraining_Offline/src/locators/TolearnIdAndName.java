package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnIdAndName {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("testing");
//		driver.findElement(By.id("Password")).sendKeys("test@1234");
		driver.findElement(By.name("Password")).sendKeys("test@1234");
	}

}
