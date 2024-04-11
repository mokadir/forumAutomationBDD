package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.BrowserEngine;
import utilities.ElementLocators;
import utilities.TestData;

public class T02_LoginPageValidation {
	
	public static WebDriver driver;
	
	@Given("Login page of the Forum web app")
	public void login_page_of_the_forum_web_app() {
		System.out.println("----- Validation of the Login Page functionality -----");
	}
	
	@Then("The browser is opened for login page")
	public void the_browser_is_opened_for_login_page() {
		driver=BrowserEngine.browserConfig();
	}
	
	@Then("Login page URL of the forum is loaded")
	public void login_page_url_of_the_forum_is_loaded() {
		driver.get(TestData.loginPageURL);
	}

	@Then("Title of the Login page is validated")
	public void title_of_the_login_page_is_validated() {
		String loginPageTitleActual=driver.getTitle();
		Assert.assertEquals(TestData.loginPageTitle1Expected, loginPageTitleActual);
	}

	@Then("Send the user ID")
	public void send_the_user_id() {
		driver.findElement(ElementLocators.name).sendKeys(TestData.loginUID);
	}

	@Then("Send the password")
	public void send_the_password() {
		driver.findElement(ElementLocators.passwordLogin).sendKeys(TestData.loginPW);
	}

	@Then("Click on SignIn Button")
	public void click_on_sign_in_button() {
		driver.findElement(ElementLocators.submitLogin).click();
	}

	@Then("User should be inside the profile Page")
	public void user_should_be_inside_the_profile_page() {
		System.out.println("----- User is inside the profile page -----");
	}

	@Then("Validate the Title of the profile page")
	public void validate_the_title_of_the_profile_page() {
		String afterLoginTitleActual=driver.getTitle();
		Assert.assertEquals(afterLoginTitleActual, TestData.afterLoginTitleExpectged);
	}

	@Then("Browser of the login page is closed")
	public void browser_of_the_login_page_is_closed() throws InterruptedException {
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}
}
