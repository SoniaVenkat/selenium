package ExploringWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_download {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepik.com/free-vector/operating-system-concept-illustration_8497398.htm#query=software&position=0&from_view=search&track=sph");
		driver.manage().window().maximize();
	 //https://ps.uci.edu/~franklin/doc/file_upload.html
		//Uploading the document
//		WebElement file =driver.findElement(By.name("userfile"));
//		file.sendKeys("F:\\Password 123.txt");
		
		//Downloading the document
		WebElement download =driver.findElement(By.id("download-file"));
		download.click();
		WebElement buttton =driver.findElement(By.className("download-button"));
		buttton.click();
		}
}
