package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).getAttribute("naturalWidth").equals("0")?"Its broken":"Its not broken");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img")).getAttribute("naturalWidth").equals("0")?"Its broken":"Its not broken");
	}

}
