package ExploringWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormInuputs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.getProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		driver.get("https://www.jotform.com/build/230431460956454#preview");
		driver.manage().window().maximize();
		
//		//scroll down
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)");
		
		//Using x-path
		//Sending values
		WebElement firstname =driver.findElement(By.xpath("//input[@id='first_2']"));
		firstname.sendKeys("Sonia");
		
		WebElement x_path =driver.findElement(By.xpath("//input[@id='input_3']"));
		x_path.sendKeys("sample@gmail.com");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)");
		
		//radio button
		WebElement radio_shipping = driver.findElement(By.xpath("//label[@id='label_input_17_0']"));
		radio_shipping.click();
		
		WebElement radio = driver.findElement(By.xpath("//label[@id='label_input_15_0']"));
		radio.click();
		
		//Drop-down
		Select drpCountry = new Select(driver.findElement(By.name("q4_billingAddress[country]")));
		drpCountry.selectByVisibleText("India");
	
		
	}
}
