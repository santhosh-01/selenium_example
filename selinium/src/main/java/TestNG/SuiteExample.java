package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		driver = new ChromeDriver();

		startTime = System.currentTimeMillis();

	}

	@Test
	public void openChrome() {

		driver.get("https://www.google.com");

	}

	@Test
	public void openBing() {

		driver.get("https://www.bing.com");

	}

	@Test
	public void openYahoo() {

		driver.get("https://in.search.yahoo.com/");

	}

	@AfterSuite
	public void closeBrowser() {

		endTime = System.currentTimeMillis();

		System.out.println(endTime-startTime);

		driver.quit();

	}

}
