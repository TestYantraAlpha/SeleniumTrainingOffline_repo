package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElementRefException {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
//		WebElement emailtextField = driver.findElement(By.id("Email"));
//		emailtextField.sendKeys("testing");
//		driver.navigate().refresh();
//		emailtextField.sendKeys("selenium");
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("testing");
		driver.navigate().refresh();
		lp.getEmailTextField().sendKeys("selenium");
	}

}
