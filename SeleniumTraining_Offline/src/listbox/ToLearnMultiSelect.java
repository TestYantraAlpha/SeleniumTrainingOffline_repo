package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(listbox);
		
		priceSelect.selectByIndex(3);
		priceSelect.selectByValue("199");
		priceSelect.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		
//		String firstSelected = priceSelect.getFirstSelectedOption().getText();
//		System.out.println(firstSelected);
		
//		List<WebElement> allSelected = priceSelect.getAllSelectedOptions();
//		for(WebElement ele:allSelected) {
//		System.out.println(ele.getText());
//		}
		
		List<WebElement> allOptions = priceSelect.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
		}
		

		System.out.println(priceSelect.isMultiple());
		
		
		
		
		
		
//		priceSelect.deselectAll();
//		
//		priceSelect.deselectByValue("90");
//		priceSelect.deselectByIndex(2);
//		priceSelect.deselectByVisibleText("INR 300 - INR 399 ( 1 )");
		
	}

}
