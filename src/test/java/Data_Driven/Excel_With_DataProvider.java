package Data_Driven;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_With_DataProvider {
	@DataProvider
	
	public String[][] login(){
	      String data[][]=null;
	      try {
	    	  FileInputStream file= new FileInputStream("../MAVEN_PROJECT/Excel_With_DataProvider.xlsx");
	    	  Workbook wb= WorkbookFactory.create(file);
	    	  int rows=wb.getSheet("Sheet1").getLastRowNum();
	    	  int cell=wb.getSheet("SHeet1").getRow(0).getLastCellNum();
	    	  data = new String[rows][cell];
	    	  for(int i=0;i<rows;i++) {
	    		  for(int j=0;j<cell;j++) {
	    			  data[i][j]=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
	    		  }
	    	  }
	    	  }catch (Exception e) {
				// TODO: handle exception
			}
	      return data;
	    		  
	    	  }
	@Test(dataProvider = "login")
     public void register(String[] d) {
    	 WebDriver driver=new FirefoxDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://demowebshop.tricentis.com/electronics");
    	 driver.findElement(By.xpath(".//a[text()='Register']")).click();
    	 if(d[0].equalsIgnoreCase("male"))
    		 driver.findElement(By.id("gender-male")).click();
    	 else
    		 driver.findElement(By.id("gender-female")).click();
    	     driver.findElement(By.id("FirstName")).sendKeys(d[1]);
    	     driver.findElement(By.id("LastName")).sendKeys(d[2]);
    	     driver.findElement(By.id("Email")).sendKeys(d[3]);
    	     driver.findElement(By.id("Password")).sendKeys(d[4]);
    	     driver.findElement(By.id("ConfirmPassword")).sendKeys(d[4]);
    	     driver.findElement(By.id("register-button")).click();
    	 
    	 
     }
	      
		
		
		
		
	}
	


