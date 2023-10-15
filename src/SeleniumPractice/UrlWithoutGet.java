package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlWithoutGet {
	static {
		System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
{
	driver.get("https://google.com");
	driver.navigate().to("https://gmail.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
}
	}
 
}
