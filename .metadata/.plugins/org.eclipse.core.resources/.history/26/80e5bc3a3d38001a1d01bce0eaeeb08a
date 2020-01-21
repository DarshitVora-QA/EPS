import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSeleniumBasic {	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://www.google.com/?gws_rd=ssl";
		
		//Set location of the chromeDriver
		System.setProperty("webdriver.chrome.driver", "D:\\Darshit\\Automation\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		//Invoke Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//Mention the which URL to hit using driver.get()
		driver.get(url);
		
		//Fetch the title of the opened browser tab using driver.getTitle()
		System.out.println(driver.getTitle());
		
		//Maximize the window
		driver.manage().window().maximize();
		
		
		//Fetch URL which is currently open in the window **To Check we are on correct url or redirection has occured**
		System.out.println(driver.getCurrentUrl());
		
		
		
		if (driver.getCurrentUrl().equals(url)) {
			driver.get("http://www.gmail.com");
			//driver.navigate().back();
		}
		
		//Fetch the source code of the page opened in window  **Needed when we need to work with Frames concept**
		//System.out.println(driver.getPageSource());
		
		//Close the window; or close the browser if its the only window open
		else {
			driver.get("http://www.linkedin.com");
		}
			
		driver.close();	
		//Close the driver and any windows open under it
		driver.quit();
		
	}

}
