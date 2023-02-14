package ExploringWebDriver;
  import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionScreenshot {

	public static void main(String[] args) throws IOException {

        /* Set the location of ChromeBrowser */
        System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
      
        /* Initialize new ChromeDriver Instance */
		WebDriver driver = new ChromeDriver();

        /* Goto URL */
        driver.get("https://practice.automationbyte.com/forms/basic-form-1");

        /* Locate First Name Text Field Element */
        WebElement form = driver.findElement(By.id("user-registration-form"));
      
        /* Enter value to the located Element */
        //firstNameField.sendKeys("Screenshot Demo");

        /* Convert the Web Driver object to TakeScreenshot */
        TakesScreenshot ts = (TakesScreenshot) driver;

        /* Take Screenshot as file */
        File source = ts.getScreenshotAs(OutputType.FILE);

        /* Convert the screenshot into BufferedImage */
        BufferedImage bufferedImage = ImageIO.read(source);

        /* Find location of the web-element on the page */
        Point location = form.getLocation();

        /* Find width and height of the located element */
        int width = form.getSize().getWidth();
        int height = form.getSize().getHeight();

        /* Crop the full image to get only the Form Field Screenshot */
        BufferedImage croppedImage = bufferedImage.getSubimage(location.getX(), location.getY(),
                width, height);
        ImageIO.write(croppedImage, "png", source);

        /* Copy the Screenshot file directory */
        File destination = new File("F:\\AutParticularElementScreenshot.jpg");
        FileUtils.copyFile(source, destination);
	}

}
