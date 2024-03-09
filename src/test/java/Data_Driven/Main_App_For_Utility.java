package Data_Driven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Main_App_For_Utility {
	@Test
	public void login() throws IOException {
		WebDriver driver= new FirefoxDriver();
		Utility_Method un1= new Utility_Method();
		driver.get(un1.getDataFromExcel("Sheet2", 0, 0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get(un1.getDataFromPropertyFile("un"));
	}

}
