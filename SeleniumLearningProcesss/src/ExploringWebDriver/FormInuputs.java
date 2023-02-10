package ExploringWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormInuputs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.getProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		driver.get("https://www.jotform.com/form-templates/test");
		
	}

}
