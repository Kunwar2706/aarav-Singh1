
public class DemoB {
static {
	System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	DemoA.testA(driver);

	}

}
