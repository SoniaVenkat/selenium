package Basic_flow;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.getProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://20.43.172.115/direct/medical-care/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement close =driver.findElement(By.xpath("/html/body/div[5]/div/div/button"));
		close.click();
		
		//Apply Button
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement apply =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div[2]/div/form/div/div[2]/div[3]/button"));
		apply.click();
		
		WebElement height =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div/div/div[3]/div[1]/div/div/div/input"));
		height.sendKeys("177");
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",height);
		
		WebElement weight =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[1]/div/div/div/div[3]/div[2]/div/div/div/input"));
		weight.sendKeys("78");
		
		

		
		
	}
}
