package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	
	public TestBase(){
		
		try{
			
			
			prop = new Properties();
			FileInputStream f = new FileInputStream("./src/main/java/Utilities/config.properties");
			prop.load(f);
			
		}catch(FileNotFoundException e){
			
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./src/main/java/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else
		{
			System.setProperty("webdriver.gecko.driver", "./src/main/java/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
