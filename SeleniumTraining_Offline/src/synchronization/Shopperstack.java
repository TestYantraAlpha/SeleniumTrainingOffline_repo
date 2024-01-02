package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		
//		Thread.sleep(20000);
//		driver.findElement(By.id("compare")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		driver.findElement(By.id("Check")).click();
	}
}
