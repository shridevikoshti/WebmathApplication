package k8math;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;

public class NumberBasics {

	

	public static void main(String[] args) throws Exception {
		
        FileInputStream f= new FileInputStream("C:\\Users\\hp\\Desktop\\projectdata.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet1");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// launching app
		driver.get(s.getCell(1, 2).getContents());
		driver.manage().window().maximize();
		//clicking on k-8 math module
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).click();
		
		//clicking on add
		driver.findElement(By.xpath(s.getCell(1, 4).getContents())).click();
		//entering inputs
		 driver.findElement(By.name(s.getCell(1, 5).getContents())).sendKeys(s.getCell(1, 7).getContents());;
		driver.findElement(By.name(s.getCell(1, 6).getContents())).sendKeys(s.getCell(1, 8).getContents());;
		 driver.findElement(By.xpath(s.getCell(1, 9).getContents())).click();

	driver.navigate().back();
	//clearing input data
	 driver.findElement(By.name(s.getCell(1, 5).getContents())).clear();
	 driver.findElement(By.name(s.getCell(1, 6).getContents())).clear();	
	 //entering next data
	 driver.findElement(By.name(s.getCell(1, 5).getContents())).sendKeys(s.getCell(2, 7).getContents());
	 driver.findElement(By.name(s.getCell(1, 6).getContents())).sendKeys(s.getCell(2, 8).getContents());
	 driver.findElement(By.xpath(s.getCell(1, 9).getContents())).click();
	 driver.navigate().back();
	 driver.navigate().back();
		
	 //clicking on subtract
	 driver.findElement(By.xpath(s.getCell(1, 10).getContents())).click();
	//entering data
	 driver.findElement(By.name(s.getCell(1, 5).getContents())).sendKeys(s.getCell(1, 11).getContents());
	 driver.findElement(By.name(s.getCell(1, 6).getContents())).sendKeys(s.getCell(1, 12).getContents());
	 driver.findElement(By.xpath(s.getCell(1, 13).getContents())).click();
	 driver.navigate().back();
		//clearing input data
		 driver.findElement(By.name(s.getCell(1, 5).getContents())).clear();
		 driver.findElement(By.name(s.getCell(1, 6).getContents())).clear();	
		 //entering next data
		 driver.findElement(By.name(s.getCell(1, 5).getContents())).sendKeys(s.getCell(2, 11).getContents());
		 driver.findElement(By.name(s.getCell(1, 6).getContents())).sendKeys(s.getCell(2, 11).getContents());
		 driver.findElement(By.xpath(s.getCell(1, 13).getContents())).click();
		 driver.navigate().back();
		 driver.navigate().back();
		 
		 //clicking on multiply
		 driver.findElement(By.xpath(s.getCell(1, 14).getContents())).click();
			//entering data
			 driver.findElement(By.name(s.getCell(1, 5).getContents())).sendKeys(s.getCell(1, 15).getContents());
			 driver.findElement(By.name(s.getCell(1, 6).getContents())).sendKeys(s.getCell(1, 16).getContents());
			 driver.findElement(By.xpath(s.getCell(1, 17).getContents())).click();
			 driver.navigate().back();

			
			 	//clearing input data
			 driver.findElement(By.name(s.getCell(1, 5).getContents())).clear();
			 driver.findElement(By.name(s.getCell(1, 6).getContents())).clear();	
			 //entering next data
			 driver.findElement(By.name(s.getCell(1, 5).getContents())).sendKeys(s.getCell(2, 15).getContents());
			 driver.findElement(By.name(s.getCell(1, 6).getContents())).sendKeys(s.getCell(2, 16).getContents());
			 driver.findElement(By.xpath(s.getCell(1, 17).getContents())).click();
			 driver.navigate().back();
			 driver.navigate().back();
		 
				 //clicking on divide
				 driver.findElement(By.xpath(s.getCell(1, 18).getContents())).click();
				//entering data
				 driver.findElement(By.name(s.getCell(1, 19).getContents())).sendKeys(s.getCell(1, 21).getContents());
				 driver.findElement(By.name(s.getCell(1, 20).getContents())).sendKeys(s.getCell(1, 22).getContents());
				 driver.findElement(By.xpath(s.getCell(1, 23).getContents())).click();
				 driver.navigate().back();
					//clearing input data
					 driver.findElement(By.name(s.getCell(1, 19).getContents())).clear();
					 driver.findElement(By.name(s.getCell(1, 20).getContents())).clear();	
					 //entering next data
					 driver.findElement(By.name(s.getCell(1, 19).getContents())).sendKeys(s.getCell(2, 21).getContents());
					 driver.findElement(By.name(s.getCell(1, 20).getContents())).sendKeys(s.getCell(2, 22).getContents());
					 driver.findElement(By.xpath(s.getCell(1, 23).getContents())).click();
					 driver.navigate().back();
					 driver.navigate().back();
					 
					 
					//clicking on rounding
					 driver.findElement(By.xpath(s.getCell(1, 24).getContents())).click();
					//entering data
					 driver.findElement(By.xpath(s.getCell(1, 25).getContents())).sendKeys(s.getCell(1, 26).getContents());
					 driver.findElement(By.xpath(s.getCell(1, 27).getContents())).click();
					 driver.navigate().back();
					 driver.navigate().back();
					 
					//clicking on using a number line
					 driver.findElement(By.xpath(s.getCell(1, 28).getContents())).click();
					//entering data
					 driver.findElement(By.xpath(s.getCell(1, 29).getContents())).sendKeys(s.getCell(1, 30).getContents());
					 driver.findElement(By.xpath(s.getCell(1, 31).getContents())).click();
					 driver.navigate().back();
					 driver.navigate().back();
					 
					//clicking on comparing with a number line
					 driver.findElement(By.xpath(s.getCell(1, 32).getContents())).click();
					//entering data
					 driver.findElement(By.name(s.getCell(1, 33).getContents())).sendKeys(s.getCell(1, 35).getContents());
					 driver.findElement(By.name(s.getCell(1, 34).getContents())).sendKeys(s.getCell(1, 36).getContents());
					 driver.findElement(By.xpath(s.getCell(1, 37).getContents())).click();
					 driver.navigate().back();
          			 driver.navigate().back();
          			 
          			 driver.close();
					 
					 
					 
					 
					 
					 
					 
	}

}
