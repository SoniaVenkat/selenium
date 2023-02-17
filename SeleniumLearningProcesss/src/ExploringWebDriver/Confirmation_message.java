package ExploringWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_message {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		  System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		  driver.get("https://www.leafground.com/messages.xhtml");
		  //
		  driver.manage().window().maximize();
		  
		  WebElement info_message= driver.findElement(By.id("//button[@id=\"j_idt89:j_idt90\"]/span"));
		  info_message.click();
	}

}
