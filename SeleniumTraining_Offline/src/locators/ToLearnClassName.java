package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClassName {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("button-1 login-button")).click();
		String text = driver.findElement(By.className("validation-summary-errors")).getText();
		System.out.println(text);
	}
}