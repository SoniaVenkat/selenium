package ExploringWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormInuputs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.getProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		driver.get("https://www.jotform.com/form-templates/test");
		driver.manage().window().maximize();
		
		//Using x-path
		WebElement xpath =driver.findElement(By.xpath("//input[@id='input_3']"));
		xpath.sendKeys("sample@gmail.com");
		
	}
}
