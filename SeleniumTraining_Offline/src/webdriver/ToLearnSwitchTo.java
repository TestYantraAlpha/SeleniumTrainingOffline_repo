package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(15000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().contains("amazon")) {
				break;
			}
		}	
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height: "+size.getHeight());
		System.out.println("width:" +size.getWidth());
		Point position = driver.manage().window().getPosition();
		System.out.println("x:" +position.getX());
		System.out.println("y:" +position.getY());
	}
}