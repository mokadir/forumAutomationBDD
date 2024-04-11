package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.BrowserEngine;
import utilities.TestData;

public class T01_HomePageValidation {
	
	public static WebDriver driver;
	
	@Given("Home page of the Forum web app")
	public void home_page_of_the_forum_web_app() {
	    System.out.println("----- Validation of the Home Page functionality -----");
	}

	@Then("The browser is opened for home page")
	public void the_browser_is_opened_for_home_page() {
		driver=BrowserEngine.browserConfig();
	}

	@Then("Home page URL of the forum is loaded")
	public void home_page_url_of_the_forum_is_loaded() {
		driver.get(TestData.homePageURL);
	}

	@Then("Title of the home page is validated")
	public void title_of_the_home_page_is_validated() {
		String homePageTitleActual=driver.getTitle();
		Assert.assertEquals(TestData.homePageTitleExpected, homePageTitleActual);
	}

	@Then("Browser of the Home page is closed")
	public void browser_of_the_home_page_is_closed() throws InterruptedException {
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}
}
