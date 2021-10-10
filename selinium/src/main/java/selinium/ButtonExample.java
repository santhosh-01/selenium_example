package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
		"C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Firefoxdriver\\geckodriver.exe");         
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement positionButton = driver.findElement(By.id("position"));
		Point point = positionButton.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		WebElement colorButton = driver.findElement(By.id("color"));
		System.out.println(colorButton.getCssValue("background-color"));
		
		WebElement sizeButton = driver.findElement(By.id("size"));
		System.out.println(sizeButton.getSize().height+" "+sizeButton.getSize().width);
		
		WebElement homeButton = driver.findElement(By.id("home"));
		homeButton.click();
	}

}
