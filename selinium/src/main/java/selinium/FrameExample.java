package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		System.out.println(driver.findElement(By.id("Click")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click1")).click();
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	}

}
