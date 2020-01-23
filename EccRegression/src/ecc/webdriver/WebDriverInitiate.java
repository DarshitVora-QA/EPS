package ecc.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverInitiate {
	WebDriver webDriverInitiate;
	public WebDriver getWebDriver(DriverType type) {		
		
		switch(type) {
		case CHROME:
			ChromeOptions handlSSLErr = new ChromeOptions().addArguments("--ignore-certificate-errors");
			webDriverInitiate = new ChromeDriver(handlSSLErr);
			break;
		case FIREFOX:
			webDriverInitiate = new FirefoxDriver();
			break;
		case IE:
			webDriverInitiate = new InternetExplorerDriver();
			break;
		}		
		return webDriverInitiate;
	}
}