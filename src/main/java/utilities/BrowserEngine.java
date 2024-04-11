package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserEngine {
public static WebDriver driver;
	
	public static WebDriver browserConfig() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mskad\\EclipseWorkspaces\\devops\\forumAutomationBDD\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("----- Chrome Browser opened -----");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		return driver;
	}
}
