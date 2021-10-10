package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://leafground.com/pages/Window.html");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.id("home")).click();
		Thread.sleep(5000);
		Set<String> child = driver.getWindowHandles();
		
		
		for (String string : child) {
			driver.switchTo().window(string);
		}
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("color")).click();
		Thread.sleep(5000);
		System.out.println(driver.getWindowHandles().size());
		Thread.sleep(5000);
		
		Set<String> child1 = driver.getWindowHandles();
		
		
		for (String string : child1) {
			if(!string.equals(parent)) {
				driver.switchTo().window(string);
				driver.close();
			}
			Thread.sleep(5000);
		}
		
		driver.quit();
	}

}
