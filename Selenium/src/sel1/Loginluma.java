package sel1;

import java.io.IOException;
import java.time.Duration;
import static util.ConfigReader.getUrl;
import static util.ConfigReader.getUsername;
import static util.ConfigReader.getPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginluma {
	
	
	@Test
	public void myLoginTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(getUrl());
		
		
		driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
		
		//Enter UserName
		driver.findElement(By.id("email")).sendKeys(getUsername());
		
		//Enter Password
		driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys(getPassword());
		
		//Click on Login Button
		driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]")).click();
		
		
	}


}
