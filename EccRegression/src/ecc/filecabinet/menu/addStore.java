package ecc.filecabinet.menu;

import java.util.StringJoiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ecc.webdriver.DriverType;
import ecc.webdriver.WebDriverInitiate;

public class addStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pageTitle="Stores";
		String subPageTitle="Add EPS Store";
		System.setProperty("webdriver.chrome.driver", "D:\\DKV\\Misc\\chromedriver_win32\\chromedriver.exe");
		WebDriverInitiate webDriverInitiate=new WebDriverInitiate();
		WebDriver driver= webDriverInitiate.getWebDriver(DriverType.CHROME);
		driver.manage().window().maximize();
		driver.get("https://fq-eps-08:58442/ecc/login.jsp");
		
//		WebDriverWait wait= new WebDriverWait(driver,10);
		Actions actions= new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("1993");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jan@2020");
		driver.findElement(By.xpath("//area[contains(@onclick,'document.getElementById')]")).click();
		//FileCabinet menu hover
		WebElement filecab_menu=driver.findElement(By.xpath("//div[@id='header-form:j_id21']"));
		actions.moveToElement(filecab_menu).build().perform();
		//Select Stores option in the menu
		//Check for role is done
		try {
			driver.findElement(By.xpath("//div[@id='header-form:j_id23']/span[2]")).click();			
			try {
				if(driver.findElement(By.xpath("//div[@id='j_id162_body']")).getText().equals(pageTitle)) {					
					System.out.println("User was redirected to "+pageTitle+" Page");
				}
			}catch(Exception e1) {
				System.out.println("User was not redirected to "+pageTitle+" Page");
			}
		}catch(Exception e2) {
			System.out.println("User does not have Store View/Edit Role");
		}
		
		driver.findElement(By.xpath("//input[@id='searchForm:AddStore']")).click();
		try {
			String subPageTitleRec=driver.findElement(By.xpath("//table[@id='addStoreForm:Title_Grid']/tbody/tr[1]/td/span[1]")).getText().concat(" ".concat(driver.findElement(By.xpath("//table[@id='addStoreForm:Title_Grid']/tbody/tr[1]/td/span[2]")).getText()));
			if(subPageTitleRec.equals(subPageTitle)) {
				System.out.println("User now on "+subPageTitleRec+" Page");				
			}
		}catch(Exception e3){
			System.out.println("User not redirected to "+subPageTitle+" Page");
		}	
		
//		driver.close();
//		driver.quit();
	}
}