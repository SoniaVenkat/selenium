package Basic_flow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
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
		
		Thread.sleep(6000);
		
		WebElement height =driver.findElement(By.xpath("//*[@id='app']//div[1]/div/div/div/input"));

		height.sendKeys("177");

//		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",height);
		
		WebElement weight =driver.findElement(By.xpath("//*[@id='app']//div[2]/div/div/div/input"));
		weight.sendKeys("78");
		
		WebElement start =driver.findElement(By.xpath("//*[@id='app']//div[3]/div[2]/button"));
		start.click();
		 
		WebElement health =driver.findElement(By.xpath("//*[text()='None of these']"));
		health.click();
		
		WebElement next =driver.findElement(By.xpath("//*[text()='Next']"));
		next.click();
		Thread.sleep(0);
		WebElement health1 =driver.findElement(By.xpath("//*[@id=\"app\"]//div[3]/div/div[2]/div[5]/label/div"));
		health1.click();
		
		WebElement next1 =driver.findElement(By.xpath("//*[text()='Next']"));
		next1.click();

		WebElement undergo =driver.findElement(By.xpath("//*[text()=\"Undergoing or awaiting investigations, follow-up or treatment including surgery\"]"));
		undergo.click();
		js.executeScript("window.scrollBy(0,150)", "");
		WebElement next2 =driver.findElement(By.xpath("//*[text()='Next']"));
		next2.click();
		
		WebElement employee =driver.findElement(By.xpath("//*[@id=\"app\"]//div[2]/div[2]/div[1]/button"));
		employee.click();
		
		js.executeScript("window.scrollBy(0,150)", "");
		WebElement next3 =driver.findElement(By.xpath("//*[text()='Next']"));
		next3.click();
		
		WebElement employee_name =driver.findElement(By.xpath("//*[@id=\"app\"]//div[2]/input"));
		employee_name.sendKeys("Tester");
		
		WebElement next4 =driver.findElement(By.xpath("//*[text()='Next']"));
		next4.click();
		
		WebElement job =driver.findElement(By.xpath("//*[@id=\"app\"]//div[7]/div/div[2]/div[6]/label/div"));
		job.click();
		
		WebElement next5 =driver.findElement(By.xpath("//*[text()='Next']"));
		next5.click();
		
		WebElement yes =driver.findElement(By.xpath("//*[@id=\"app\"]//div[8]/div/div[3]/button"));
		yes.click();
		
		WebElement next6 =driver.findElement(By.xpath("//*[text()='Next']"));
		next6.click();
		
		WebElement yes1 =driver.findElement(By.xpath("//*[@id=\"app\"]//div[2]/div[9]/div/div[3]/button"));
		yes1.click();
		
		WebElement next7 =driver.findElement(By.xpath("//*[text()='Next']"));
		next7.click();
		
		WebElement Confirm =driver.findElement(By.xpath("//*[text()='Confirm']"));
		Confirm.click();
		
		WebElement firstname =driver.findElement(By.xpath("//*[@id=\"app\"]//input"));
		firstname.sendKeys("Test");
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,150)", "");
		WebElement nric =driver.findElement(By.xpath("//*[@id=\"app\"]//div[2]/div/div/div[1]/input"));
		nric.sendKeys("970520-02-5245");
		
		WebElement mobile_number =driver.findElement(By.xpath("//*[@id=\"app\"]//div[2]/div[1]/div/div/div/input"));
		mobile_number.sendKeys("9873472983");
		
		WebElement email =driver.findElement(By.xpath("//*[@id=\"app\"]//div[2]/div[2]/div/div/div/input"));
		email.sendKeys("sruthi@yahoo.in");
		
		WebElement st_add =driver.findElement(By.xpath("//*[@id=\"app\"]//div[1]/div/div/div/textarea"));
		st_add.sendKeys("Street address");
		
		WebElement postcode =driver.findElement(By.xpath("//*[@id=\"app\"]//div[3]/div[2]/div[2]/div/div/div/input"));
		postcode.sendKeys("50250");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,450)", "");
		WebElement confirm_check =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[6]/div/div/label/span"));
		confirm_check.click();
		
		
		WebElement confirm_btn =driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[7]/button"));
		confirm_btn.click();
		
	}
}
