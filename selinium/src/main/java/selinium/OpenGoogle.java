package selinium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws IOException {

		WebDriver driver = null;

		FileInputStream fileInputStream = new FileInputStream("config.properties");

		Properties properties = new Properties();
		properties.load(fileInputStream);

		String browser = properties.getProperty("browser");
		String driverLocation = properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", driverLocation);         

			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {

			System.setProperty("webdriver.gecko.driver", driverLocation);         

			driver = new FirefoxDriver();
		}


		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("Santhosh"+Keys.ENTER);
	}

}