package fwdautomationBasicflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_flow {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://20.43.172.115/direct/medical-care/");
		driver.manage().window().maximize();

	}

}
