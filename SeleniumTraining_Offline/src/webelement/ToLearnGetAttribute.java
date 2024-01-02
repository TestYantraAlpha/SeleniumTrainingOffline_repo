package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String value = driver.findElement(By.id("small-searchterms")).getAttribute("class");
		System.out.println(value);
	}

}
