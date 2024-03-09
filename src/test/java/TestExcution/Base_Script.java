package TestExcution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Script {
	WebDriver driver;
	@Parameters("BrowserName")
	@BeforeClass
	public void openBrowser(String BrowserName) {
		if (BrowserName.equals("Firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if (BrowserName.equals("Chrome")) {
			driver= new ChromeDriver();
			
		}
		else {
			driver= new EdgeDriver();
		}	
	}
	@BeforeMethod
	public void OpenApp() {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@AfterMethod
	public void testMethodeExcution(ITestResult r) {
		String methodname=r.getName();
		if (r.getStatus()==1) {
			Reporter.log(methodname +"Excution is pass",true);
			
		}else {
			Reporter.log(methodname +"Excution is fail",true);
		}
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
