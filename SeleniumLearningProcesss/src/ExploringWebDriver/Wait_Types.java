package ExploringWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Types {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.getProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		driver.get("https://www.jotform.com/build/230431460956454#preview");
		driver.manage().window().maximize();
		
		//scroll down
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)");
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//Explicit Wait
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//Using x-path
		//Sending values
		WebElement firstname =driver.findElement(By.xpath("//input[@id='first_2']"));
		firstname.sendKeys("Sonia");
	}
}
