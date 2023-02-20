package ExploringWebDriver;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.junit.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_message {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		  System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		  driver.get("https://www.leafground.com/messages.xhtml");
		  //
		  driver.manage().window().maximize();
		  
		  WebElement info_message= driver.findElement(By.xpath("//button[@id=\"j_idt89:j_idt90\"]"));
		  info_message.click();
		  
		  //Element to be captured
		  WebElement capture = driver.findElement(By.xpath("//div[@class=\"col-12 lg:col-6\"]"));
		  
		  //For highlight the element
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');",capture);
			
		  //Dimensional screenshot
		  TakesScreenshot ts = (TakesScreenshot) driver;

	        /* Take Screenshot as file */
	        File source = ts.getScreenshotAs(OutputType.FILE);

	        /* Convert the screenshot into BufferedImage */
	        BufferedImage bufferedImage = ImageIO.read(source);

	        /* Find location of the web-element on the page */
	        Point location = capture.getLocation();

	        /* Find width and height of the located element */
	        int width = 950;
	        int height = 300;

	        /* Crop the full image to get only the Form Field Screenshot */
	        BufferedImage croppedImage = bufferedImage.getSubimage(location.getX(), location.getY(),
	                width, height);
	        ImageIO.write(croppedImage, "png", source);

	        /* Copy the Screenshot file directory */
	        File destination = new File("G:\\Projects Screenshot\\Confirmation_message.png");
	        FileUtils.copyFile(source, destination);
	        
	        
	        //Content in confirmation message
	        WebElement msg=driver.findElement(By.className("ui-messages-info"));
	        String text=msg.getText();
	        String expectedText = "InfoMessage Detail";
	        Assert.assertEquals(text,expectedText);
	}
}
