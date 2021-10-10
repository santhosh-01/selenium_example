package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.navigate().back();
		
		System.out.println(driver.findElement(By.partialLinkText("to go")).getAttribute("href"));
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		System.out.println(driver.getTitle().contains("404")?"Broken":"Not Broken");
		
		driver.navigate().back();
		
		System.out.println(driver.findElements(By.tagName("a")).size());

	}

}
