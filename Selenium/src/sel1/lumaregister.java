package sel1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class lumaregister {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl()); 
		driver.close();
	}

}
