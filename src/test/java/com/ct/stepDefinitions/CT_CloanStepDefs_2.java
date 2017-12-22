package com.ct.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.pages.CT_CloanHomePage_2;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CT_CloanStepDefs_2 {

	// private WebDriver driver = Driver.getInstance();
	private WebDriver driver = Driver.getInstance();
	private WebElement iframe = driver.findElement(By.cssSelector(".wpb_text_column.wpb_content_element iframe"));
	private CT_CloanHomePage_2 page2 = new CT_CloanHomePage_2();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@When("^I am Enter Personal Information First Name as \"([^\"]*)\"$")
	public void i_am_Enter_Personal_Information_First_Name_as(String arg1) throws Throwable {
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//*[@id='SingleLine-li']//*[@name='SingleLine']")).sendKeys(arg1);
	}

	@When("^I am Enter Personal Information Middle Name as \"([^\"]*)\"$")
	public void i_am_Enter_Personal_Information_Middle_Name_as(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id='SingleLine1-li']//*[@name='SingleLine1']")).sendKeys(arg1);
	}

	@When("^I am Enter Personal Information Last Name \"([^\"]*)\"$")
	public void i_am_Enter_Personal_Information_Last_Name(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id='SingleLine2-li']//*[@name='SingleLine2']")).sendKeys(arg1);
	}

	@When("^I am Select Personal Information Genger as \"([^\"]*)\"$")
	public void i_am_Select_Personal_Information_Genger_as(String arg1) throws Throwable {
		driver.findElement(By.cssSelector("#Radio_1")).click();
	}

	@When("^I am Enter Personal Information Date of Birth as \"([^\"]*)\"$")
	public void i_am_Enter_Personal_Information_Date_of_Birth_as(String arg1) throws Throwable {
		driver.findElement(By.cssSelector(".tempContDiv #Date-date")).sendKeys(arg1);
	}

	@When("^I am Enter Personal Information Personal File ID as \"([^\"]*)\"$")
	public void i_am_Enter_Personal_Information_Personal_File_ID_as(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id='Number-li']//*[@name='Number']")).sendKeys(arg1);
	}

	@Then("^I am Click on Next Button$")
	public void i_am_Click_on_Next_Button() throws Throwable {
		driver.findElement(By.cssSelector(".fmSmtButton.next_previous")).click();
	}

	/*
	 * From Here start Script for CTL-44
	 */
	@Given("^I amd Enter Street Address as \"([^\"]*)\"$")
	public void i_amd_Enter_Street_Address_as(String streetAddress) throws Throwable {
		page2.streetAddress.sendKeys(streetAddress);
	}

	@When("^I amd Enter Address Line Second as \"([^\"]*)\"$")
	public void i_amd_Enter_Address_Line_Second_as(String secondLine) throws Throwable {
		page2.addressLine2.sendKeys(secondLine);
	}

	@When("^I amd Enter City as \"([^\"]*)\"$")
	public void i_amd_Enter_City_as(String city) throws Throwable {
		page2.city.sendKeys(city);
	}

	@When("^I amd Enter State as \"([^\"]*)\"$")
	public void i_amd_Enter_State_as(String state) throws Throwable {
		page2.state.sendKeys(state);
	}

	@When("^I amd Enter Postal / ZIP Code as \"([^\"]*)\"$")
	public void i_amd_Enter_Postal_ZIP_Code_as(String zipCode) throws Throwable {
		page2.zipCode.sendKeys(zipCode);
	}

	// rESUABLE METHOD FOR SELECTING COUNTRY
	@When("^I amd Enter Country as \"([^\"]*)\"$")
	public void i_amd_Enter_Country_as(String country) throws Throwable {
		page2.country.sendKeys(country);

		/*
		 * WHO write those line here? why???????????? (RK)
		 */
		// CT_HomePage2 home = new CT_HomePage2();
		// Select coun = new Select(home.country);
		// int size = home.countryOptions.size();
		// for (int i = 0; i < size; i++) {
		// coun.selectByIndex(i);
		// }

	}

	@When("^I amd Enter Personal Phone Number as \"([^\"]*)\"$")
	public void i_amd_Enter_Personal_Phone_Number_as(String personalPhone) throws Throwable {
		
		String[] numbers = personalPhone.split("-");
		page2.personalNum1.sendKeys(numbers[0]);
		page2.personalNum2.sendKeys(numbers[1]);
		page2.personalNum3.sendKeys(numbers[2]);
	}

	@When("^I amd Enter Work Phone Number as \"([^\"]*)\"$")
	public void i_amd_Enter_Work_Phone_Number_as(String workPhone) throws Throwable {
		
		String[] numbers = workPhone.split("-");

		page2.workNum1.sendKeys(numbers[0]);
		page2.workNum2.sendKeys(numbers[1]);
		page2.workNum3.sendKeys(numbers[2]);
	}

	@When("^I amd Enter Extenstion as \"([^\"]*)\"$")
	public void i_amd_Enter_Extenstion_as(String extantion) throws Throwable {
		page2.extension.sendKeys(extantion);
	}

	@When("^I amd Enter Personal Email as \"([^\"]*)\"$")
	public void i_amd_Enter_Personal_Email_as(String personEmail) throws Throwable {
		page2.personalEmail.sendKeys(personEmail);
	}

	@When("^I amd Enter Work Email as \"([^\"]*)\"$")
	public void i_amd_Enter_Work_Email_as(String workEmail) throws Throwable {
		page2.workEmail.sendKeys(workEmail);
	}

	@Then("^I am Click Next Button and verify switch to Employment Information Page$")
	public void i_am_Click_Next_Button_and_verify_switch_to_Employment_Information_Page() throws Throwable {
//		elementIsClickable(page2.next);
		page2.next.click();
//		driver.findElement(By.xpath("//ul[@page_no='2']//button[@class='fmSmtButton next_previous']//em[contains(text(), 'Next')]"));
	}

	@Then("^I am verified that empty Street Address input box shows Error$")
	public void i_am_verified_that_empty_Street_Address_input_box_shows_Error() throws Throwable {
		WebElement error = driver
				.findElement(By.xpath("//*[@name='Address_AddressLine1']/parent::*[@class='addOne error1']"));
		Assert.assertTrue(error.isDisplayed());

	}

	@Then("^I am verified that empty Street AddressTwo input box shows Error$")
	public void i_am_verified_that_empty_Street_AddressTwo_input_box_shows_Error() throws Throwable {
		WebElement error = driver
				.findElement(By.xpath("//*[@name='Address_AddressLine2']/parent::*[@class='addOne error1']"));
		Assert.assertTrue(error.isDisplayed());
	}

	@Then("^I am verified that empty Street AddressTwo input box shows$")
	public void i_am_verified_that_empty_Street_AddressTwo_input_box_shows() throws Throwable {
		Assert.assertTrue(page2.errorAddress.isDisplayed());
	}

	@Then("^I am verified that Empty Address Field Error is appers$")
	public void i_am_verified_that_Empty_Address_Field_Error_is_appers() throws Throwable {
		Assert.assertTrue(page2.errorAddress.isDisplayed());
	}
	
	@Then("^I am verified that Error of Empty Personal Phone number is appers$")
	public void i_am_verified_that_Error_of_Empty_Personal_Phone_number_is_appers() throws Throwable {
		Assert.assertTrue(page2.errorPersonalNum.isDisplayed());
	}

	@Then("^I am verified that Error of Empty Work Phone number is appers$")
	public void i_am_verified_that_Error_of_Empty_Work_Phone_number_is_appers() throws Throwable {
		Assert.assertTrue(page2.errorWorkNum1.isDisplayed());
	}
	
	@Then("^I am verified that Error of Person Email is appers$")
	public void i_am_verified_that_Error_of_Person_Email_is_appers() throws Throwable {
		Assert.assertTrue(page2.errorPersonalEmail.isDisplayed());
	}

	@Then("^I am verified that Error of Work Email is appers$")
	public void i_am_verified_that_Error_of_Work_Email_is_appers() throws Throwable {
		System.out.println(page2.errorWorkEmail.getText());
		Assert.assertTrue(page2.errorWorkEmail.isDisplayed());
	}
	
	public static void elementIsClickable(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }
    }



}