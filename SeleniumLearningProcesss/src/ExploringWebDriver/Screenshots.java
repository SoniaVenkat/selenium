package ExploringWebDriver;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class Screenshots {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		System.getProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		driver.get("https://www.jotform.com/build/230431460956454#preview");
		driver.manage().window().maximize();
		
		WebElement firstname =driver.findElement(By.xpath("//input[@id='first_2']"));
		firstname.sendKeys("Sonia");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",firstname);
		
		Thread.sleep(1000); 
		 takeSnapShot(driver, "G://output.png") ;   
		}
public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

         //BufferedImage bufferedImage = ImageIO.read(SrcFile);
            
        //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);

}


}