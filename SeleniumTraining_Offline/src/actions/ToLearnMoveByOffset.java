package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMoveByOffset {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Actions act=new Actions(driver);
//		act.moveByOffset(456, 198).click().perform();
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		Actions act=new Actions(driver);
//		act.moveByOffset(802, 315).click().sendKeys("asdfghjk").perform();
		driver.findElement(By.id("password")).sendKeys("asdfghjk");
		act.moveByOffset(1295, 315).clickAndHold().perform();
	}
}
