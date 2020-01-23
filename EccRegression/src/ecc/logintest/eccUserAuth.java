package ecc.logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ecc.webdriver.DriverType;
import ecc.webdriver.WebDriverInitiate;

public class eccUserAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wel="Welcome,";
		System.setProperty("webdriver.chrome.driver", "D:\\DKV\\Misc\\chromedriver_win32\\chromedriver.exe");
		WebDriverInitiate webDriverInitiate=new WebDriverInitiate();
		WebDriver driver= webDriverInitiate.getWebDriver(DriverType.CHROME);
		driver.manage().window().maximize();
		driver.get("https://fq-eps-08:58442/ecc/login.jsp");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("1993");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jan@2020");
		driver.findElement(By.xpath("//area[contains(@onclick,'document.getElementById')]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		try {
			if(driver.findElement(By.xpath("//form[@id='header-form']/div[@class='header-table']//span[@class='sup']")).getText().equalsIgnoreCase(wel)) {
				System.out.println("Login Attempt Successfull");
			}
		} catch(Exception e) {
			try {
				System.out.println(driver.findElement(By.xpath("//form[@id='myform']/div[@class='not-logged-in']/span[@class='error']")).getText());
			}catch(Exception f) {
				System.out.println("Login Failure Reason not found");
			}
		}	
		driver.close();
		driver.quit();
	}
}
