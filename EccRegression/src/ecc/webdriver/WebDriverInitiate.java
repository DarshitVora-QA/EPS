package ecc.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverInitiate {
	WebDriver webDriverInitiate;
	public WebDriver getWebDriver(DriverType type) {		
		
		switch(type) {
		case CHROME:
			ChromeOptions handlSSLErr = new ChromeOptions().addArguments("--ignore-certificate-errors");			
//			handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
			webDriverInitiate = new ChromeDriver(handlSSLErr);
			break;
		case FIREFOX:
			webDriverInitiate = new FirefoxDriver();
			break;
		}		
		return webDriverInitiate;
	}
}