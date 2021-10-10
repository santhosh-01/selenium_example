package selinium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Work\\Selinium\\Drivers\\Chromedriver\\chromedriver.exe");                  

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/download.html");
		
		driver.findElement(By.linkText("Download Excel")).click();
		
		Thread.sleep(3000);
		
		File fileLocation = new File("C:\\Users\\Admin\\Downloads");
		
		File[] lst = fileLocation.listFiles();
		for (File file : lst) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("Yes");
				break;
			}
		}
	}

}
