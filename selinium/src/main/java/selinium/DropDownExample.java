package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByVisibleText("Appium");
		
		List<WebElement> lst = select.getOptions();
		System.out.println(lst.size());
		
		Select multiSelectBox = new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
		multiSelectBox.selectByIndex(0);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
	}

}
