package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ToLearnFluentWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		driver.findElement(By.id("Check Delivery")).sendKeys("560078");
		WebElement checkButton = driver.findElement(By.id("Check"));
		
		FluentWait<WebDriver> fwait=new FluentWait<>(driver);
		fwait.withTimeout(Duration.ofSeconds(10));
		fwait.pollingEvery(Duration.ofMillis(250));
		
		
		fwait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
	}

}
