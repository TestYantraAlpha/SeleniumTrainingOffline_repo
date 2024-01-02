package aceturtle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutUs {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aceturtle.com/");
		
		driver.findElement(By.partialLinkText("ABOUT US")).click();
	}

}
