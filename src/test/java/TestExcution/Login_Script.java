package TestExcution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Script extends Base_Script {
	@Test
	public void fbLogin() {
		driver.findElement(By.id("email")).sendKeys("Admin12@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Admin");
		driver.findElement(By.name("login")).submit();
	}

}
