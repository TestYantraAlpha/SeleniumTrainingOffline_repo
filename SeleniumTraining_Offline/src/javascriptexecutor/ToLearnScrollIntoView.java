package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(3000);
//		WebElement exper = driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]"));
//		WebElement mobileTF = driver.findElement(By.id("mobile"));
		WebElement whatsapp = driver.findElement(By.xpath("//span[text()='WhatsApp']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", whatsapp);
	}

}
