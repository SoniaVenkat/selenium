package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasic {

	public static void main(String[] args) {
		
		//launching the browser
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		 driver.manage().window().maximize();
		
		 
		//Using ID
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("coolers ");
		
		//Finding element
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",search);
				
		//Using CLassName
		WebElement searchele =driver.findElement(By.className("nav-right"));
		searchele.click();
		
		//Using link text
		WebElement linktext =driver.findElement(By.linkText("Mobiles"));
		linktext.click();
		
		//Using partial link text
		WebElement partiallinktext =driver.findElement(By.partialLinkText("Custo"));
		partiallinktext.click();
		
		//Using x-path
		WebElement xpath =driver.findElement(By.xpath("//div[@class='a-box-inner']"));
		xpath.click();
		
	} 
	

}
