package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// step 1: create an instance for FIS/FR
		FileInputStream fis=new FileInputStream("./TestData/Book1.xlsx");
		
		// step 2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);
		
		// step 3: call read methods
		String URL = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(URL);
		driver.get(URL);
//		String EMAIL = workbook.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
//		System.out.println(EMAIL);
//		String PASSWORD = workbook.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
//		System.out.println(PASSWORD);
//		
//		driver.findElement(By.id("Email")).sendKeys(EMAIL);
//		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		
		int number = (int) workbook.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(number);
		
		boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(3).getLocalDateTimeCellValue();
		System.out.println(date);
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
	}

}
