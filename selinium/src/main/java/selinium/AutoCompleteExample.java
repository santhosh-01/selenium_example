package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/autoComplete.html");
				
		driver.findElement(By.id("tags")).sendKeys("s");
		
		Thread.sleep(3000);
		
		List<WebElement> lst = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		for (WebElement webElement : lst) {
			if(webElement.getText().equals("Selenium")) {
				webElement.click();
				break;
			}
		}
	}

}
