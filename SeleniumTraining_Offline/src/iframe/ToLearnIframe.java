package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
		WebElement dream11Frame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(dream11Frame);
		driver.findElement(By.id("regEmail")).sendKeys("123456789");
		
	}

}
