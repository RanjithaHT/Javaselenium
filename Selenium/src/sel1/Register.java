package sel1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("//a[text()='Create an Account']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ranjitha27");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("HT");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("ranjitharanju27@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ranju@1105");
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("ranju@1105");
		driver.findElement(By.xpath("//span[text()='Create an Account']")).click();
		
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
		
		
		
	}

}
