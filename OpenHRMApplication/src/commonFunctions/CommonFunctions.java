package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static Properties properties = null;
	public static WebDriver driver=null;

	static Logger logger = Logger.getLogger(CommonFunctions.class);
	
	public Properties loadProperty() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		logger.info("----------------------------------------------------------------");
		logger.info("Orange HRM Test has begins");
		logger.info("Loading the property file");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowserFile() throws IOException {

		PropertyConfigurator.configure("log4j.properties");
		loadProperty();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			logger.info("Launching Chrome");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			logger.info("Launching Firefox");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}



	@AfterSuite
	public void closeBrowser() {

		logger.info("Execution Done. Clossing the browser");
		driver.quit();

	}

}
