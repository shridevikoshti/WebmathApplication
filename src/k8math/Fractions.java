package k8math;

import java.io.FileInputStream;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import jxl.Sheet;
import jxl.Workbook;

public class Fractions {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f= new FileInputStream("C:\\Users\\hp\\Desktop\\projectdata.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet3");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// launching app
		driver.get(s.getCell(1, 2).getContents());
		driver.manage().window().maximize();
		
		//clicking on k-8 math module
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).click();
		//clicking on what's a fraction
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		//entering inputs
		driver.findElement(By.name(s.getCell(1, 5).getContents())).sendKeys(s.getCell(1, 7).getContents());
		driver.findElement(By.name(s.getCell(1, 6).getContents())).sendKeys(s.getCell(1, 8).getContents());
		driver.findElement(By.xpath(s.getCell(1, 9).getContents())).click();
		driver.navigate().back();
		driver.navigate().back();
		
		//clicking on comparing fraction
				driver.findElement(By.xpath(s.getCell(1, 10).getContents())).click();
				//entering inputs
				driver.findElement(By.name(s.getCell(1, 11).getContents())).sendKeys(s.getCell(1, 15).getContents());
				driver.findElement(By.name(s.getCell(1, 12).getContents())).sendKeys(s.getCell(1, 16).getContents());
				driver.findElement(By.name(s.getCell(1, 13).getContents())).sendKeys(s.getCell(1, 17).getContents());
				driver.findElement(By.name(s.getCell(1, 14).getContents())).sendKeys(s.getCell(1, 18).getContents());
				driver.findElement(By.xpath(s.getCell(1, 19).getContents())).click();
				driver.navigate().back();
				driver.navigate().back();
				 driver.close();
		
		
		
		
		
	}

}
