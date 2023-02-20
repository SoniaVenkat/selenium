package ExploringWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandling {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		System.getProperty("webdriver.chrome.driver","G:\\\\Selenium\\\\chromedriver.exe");
		driver.get("https://demo.automationtesting.in/Alerts.html#OKTab");
		driver.manage().window().maximize();
		
		//Ok_button
		WebElement ok_alert =driver.findElement(By.xpath("//div[@id=\"OKTab\"]/button"));
		ok_alert.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		//Cancel_button
		WebElement cancel_alert =driver.findElement(By.xpath("//div[@id=\"CancelTab\"]/button"));
		cancel_alert.click();
		alert.dismiss();
		
//		//Alert with text

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id=\"Textbox\"]/button")).click();
		alert.sendKeys("Text testing");
		alert.accept();
		}

}
