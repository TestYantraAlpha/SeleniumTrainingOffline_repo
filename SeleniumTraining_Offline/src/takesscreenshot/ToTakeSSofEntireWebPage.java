package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeSSofEntireWebPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		LocalDateTime sysTime = LocalDateTime.now();
		String actTime = sysTime.toString().replace(":", "-");
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File dest=new File("./screenshots/image-"+actTime+".png");
		FileHandler.copy(temp, dest);
		
	}
}
