import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieClicker {
	public CookieClicker()
	{
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver/");
		System.setProperty("webdriver.firefox.bin", "/home/travis/firefox/firefox");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://orteil.dashnet.org/cookieclicker/");
	}

}
