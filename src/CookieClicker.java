import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieClicker {
	public WebDriver Driver;
	private WebElement Cookie;
	private WebElement CookieCounter;
	
	public CookieClicker()
	{
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver/");
		System.setProperty("webdriver.firefox.bin", "/home/travis/firefox/firefox");
		this.Driver = new FirefoxDriver();
		this.Driver.get("https://orteil.dashnet.org/cookieclicker/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (Driver.findElements(By.id("promptContentChangeLanguage")).size() > 0)
		{
			Driver.findElement(By.xpath("//div[.='English']")).click();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.Cookie = Driver.findElement(By.id("bigCookie"));
		this.CookieCounter = Driver.findElement(By.xpath("//div[@id='cookies']"));
		
	}
	
	public void clickTheCookie()
	{
		this.Cookie.click();
	}
	
	public void clickTheCookie(int numberOfClicks)
	{
		for(int i = 0; i < numberOfClicks; i++)
		{
			this.Cookie.click();
		}
	}
	
	public int getCookieCount()
	{
		return Integer.parseInt(this.CookieCounter.getAttribute("innerHTML").split(" ")[0]);
	}
	
	

}
