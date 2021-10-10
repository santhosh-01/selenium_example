package selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		button.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		button1.click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		Thread.sleep(3000);
		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		button2.click();
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Santhosh");
		Thread.sleep(3000);
		alert2.accept();
	}

}
