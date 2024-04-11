package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.BrowserEngine;
import utilities.ElementLocators;
import utilities.TestData;

public class T03_RegistrationPageValidation {
	
	public static WebDriver driver;
	
	@Given("Registration page of the Forum web app")
	public void registration_page_of_the_forum_web_app() {
		System.out.println("----- Validation of the Registration Page functionality -----");
	}

	@Then("The browser is opened for Registration page")
	public void the_browser_is_opened_for_registration_page() {
		driver=BrowserEngine.browserConfig();
	}

	@Then("Registration page URL of the forum is loaded")
	public void registration_page_url_of_the_forum_is_loaded() {
		driver.get(TestData.registrationPageURL);
	}

	@Then("Title of the Registration page is validated")
	public void title_of_the_registration_page_is_validated() {
		String regPageTitleActual=driver.getTitle();
		Assert.assertEquals(TestData.regPageTitleExpected, regPageTitleActual);
	}

	@Then("Select Language")
	public void select_language() {
		WebElement language=driver.findElement(ElementLocators.language);
		Select selectLanguage=new Select(language);
		selectLanguage.selectByValue("English");
	}

	@Then("Select Title")
	public void select_title() {
		WebElement title=driver.findElement(ElementLocators.title);
		Select selectTitle=new Select(title);
		selectTitle.selectByValue("Mr");
	}

	@Then("Send the First name")
	public void send_the_first_name() {
		driver.findElement(ElementLocators.fname).sendKeys(TestData.regPageFName);
	}

	@Then("Send the Last name")
	public void send_the_last_name() {
		driver.findElement(ElementLocators.lname).sendKeys(TestData.regPageLName);
	}

	@Then("Send the Email address")
	public void send_the_email_address() {
		driver.findElement(ElementLocators.email).sendKeys(TestData.regPageEmail);
	}
	
	@Then("Send the registration password")
	public void send_the_registration_password() {
		driver.findElement(ElementLocators.passwordReg).sendKeys(TestData.regPagePW);
	}

	@Then("Select Gender")
	public void select_gender() {
		driver.findElement(ElementLocators.genderMale).click();
	}

	@Then("Send the Phone number")
	public void send_the_phone_number() {
		driver.findElement(ElementLocators.phone).sendKeys(TestData.regPagePhone);
	}

	@Then("Select the course")
	public void select_the_course() {
		WebElement course=driver.findElement(ElementLocators.course);
		Select selectCourse=new Select(course);
		selectCourse.selectByIndex(2);
	}

	@Then("Select Confirmation")
	public void select_confirmation() {
		driver.findElement(ElementLocators.confirm).click();
	}

	@Then("Click on Submit Button")
	public void click_on_submit_button() {
		driver.findElement(ElementLocators.submitReg).click();
	}

	@Then("User should be inside the registration Page")
	public void user_should_be_inside_the_registration_page() {
		System.out.println("----- User is inside the registration page -----");
	}

	@Then("Validate the Title of the registration page")
	public void validate_the_title_of_the_registration_page() {
		String insideRegPageTitleActual=driver.getTitle();
		Assert.assertEquals(TestData.insideRegPageTitleExpected, insideRegPageTitleActual);
	}

	@Then("Browser of the registration page is closed")
	public void browser_of_the_registration_page_is_closed() throws InterruptedException {
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	}
}
