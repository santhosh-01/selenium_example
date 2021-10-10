package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkAccess {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");         
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("sant17341.ec@rmkec.ac.in");
		
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys(Keys.BACK_SPACE+"sant17341.ec@rmkec.ac.in");
		
		WebElement getText = driver.findElement(By.name("username"));
		System.out.println(getText.getAttribute("value"));
		
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement isDisable = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		System.out.println(isDisable.isEnabled());
	}

}