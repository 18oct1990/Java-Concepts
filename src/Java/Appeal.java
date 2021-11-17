package Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appeal {
	
	//Creating a driver object referencing WebDriver interface
	WebDriver driver;
	
	void OpenBrowser() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
					    
		//Instantiating driver object and launching browser
		driver = new ChromeDriver();  
		
        //Using get() method to open a webpage
        driver.get("https://uatr1services.gst.gov.in/services/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
	}
	
	 void Login() throws IOException 
	{
		 
		 
		
		FileInputStream fis = new FileInputStream("C:/Users/uat02/eclipse-workspace/Java/src/TestData/TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheet("Sheet1");
		
		
		
		int rowcount =ws.getLastRowNum();
		//System.out.println(rowcount);
		
		int columncount= ws.getRow(0).getLastCellNum();
		//System.out.println(columncount);
		
		
		/*for(int i=0; i<=rowcount; i++)
		{
			HSSFRow currentrow = ws.getRow(i);// Focus on current row
			
			for (int j=0; j<=columncount; j++)
			{
				HSSFCell cell = currentrow.getCell(j);
				System.out.println(cell);
			}
			System.out.println();
		} */
		
		for(int i=1; i<=rowcount; i++)
		{	
			XSSFRow currentrow = ws.getRow(i);// Focus on current row
		
			String UN= currentrow.getCell(0).getStringCellValue();
			String PWD= currentrow.getCell(1).getStringCellValue();
			String CAP= currentrow.getCell(2).getStringCellValue();
			
			driver.findElement(By.id("username")).sendKeys(UN);
	        driver.findElement(By.id("user_pass")).sendKeys(PWD);
	        driver.findElement(By.id("captcha")).sendKeys(CAP);
	      
	        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	      
	        
	        driver.quit();
	       
	        	
		}
		
		
		
		
		
		
		


		//driver.findElement(By.id("username")).sendKeys(UN);
        //driver.findElement(By.id("user_pass")).sendKeys("Hamid@321");
        //driver.findElement(By.id("captcha")).sendKeys("121212");
        //Click method
        //driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        
        
        
      
       
	}
	 
	 public void CloseBrowser() throws InterruptedException
		{
		 //Closing the browser
	     driver.quit();
			
		}
	 


	 public static void main(String[] args) throws InterruptedException, IOException  {
			
		Appeal Ap = new Appeal();
		Ap.OpenBrowser();
		Ap.Login();
		//Ap.CloseBrowser();
		
	}

}
