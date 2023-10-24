package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.TimeUtils;

public class BaseAmazonClass {

	public static Properties prop = new Properties();
 public static WebDriver driver;
	
	//step 1
	 public BaseAmazonClass()
	 {
		 try {
		 FileInputStream file = new FileInputStream("C:\\Users\\swapn\\eclipse-workspace\\AmazonP\\src\\test\\java\\environmentvaraibles\\Config.properties");
	 prop.load(file);
		 	 }
		 catch(FileNotFoundException e) 
		 {
		 e.printStackTrace();
		 }
		 catch(IOException a) 
		 {
			 a.printStackTrace();
		 }
	 }

	//Step 2
	@SuppressWarnings("deprecation")
	public static void initiate()
	{
		String browsername = prop.getProperty("browser");
		if (browsername.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chrome.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
}	
	
	
	
	
	
	
	
	
	