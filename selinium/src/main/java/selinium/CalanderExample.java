package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Calendar.html");
		
		driver.findElement(By.id("datepicker")).sendKeys("10/18/2021" + Keys.ENTER);

	}

}