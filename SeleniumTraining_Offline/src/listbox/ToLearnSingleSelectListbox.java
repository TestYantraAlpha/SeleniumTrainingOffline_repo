package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelectListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select daySelect=new Select(dayDropdown);
//		daySelect.selectByIndex(14);
//		daySelect.selectByValue("3");
		daySelect.selectByVisibleText("2");
		
		System.out.println(daySelect.isMultiple());
	}

}
