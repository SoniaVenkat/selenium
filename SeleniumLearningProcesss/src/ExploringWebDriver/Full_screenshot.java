package ExploringWebDriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Full_screenshot {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//Using robot class taking full page screenshots
		
		 Robot robot = new Robot();
	     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	     Rectangle rectangle= new Rectangle(screenSize);
	     BufferedImage source=robot.createScreenCapture(rectangle);
	     File destinationsFile=new File("F:\\SS3.png");
	     ImageIO.write(source, "png", destinationsFile);
	}

}
