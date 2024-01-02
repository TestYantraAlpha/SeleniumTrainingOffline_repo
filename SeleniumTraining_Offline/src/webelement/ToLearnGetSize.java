package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement register = driver.findElement(By.xpath("//input[@value='Register']"));
		Dimension size = register.getSize();
		System.out.println("Height: "+size.getHeight());
		System.out.println("width: "+size.getWidth());
		
		register.getLocation();
	}
}
