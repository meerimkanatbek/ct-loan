package com.ct.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ct.utilities.Driver;


public class ContactInfoHomePage {
	Actions action;
	WebDriverWait wait;
	private WebDriver driver;
	Select selectCountry;
	 public ContactInfoHomePage (){
		 this.driver = Driver.getInstance();
			PageFactory.initElements(this.driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id='Section1-li']/h2")
	 public WebElement contactLogo;
	 
	 @FindBy (xpath ="(//input[@type='text'])[6]")
	 public WebElement streetAddress;
	 
	 @FindBy (xpath ="(//input[@type='text'])[7]")
	 public WebElement addressLine2;
	 
	 @FindBy(xpath ="(//input[@type='text'])[8]")
	 public WebElement City;
	 
	 @FindBy(xpath="(//input[@type='text'])[9]")
	 public WebElement State;
	 
	 @FindBy(xpath ="(//input[@type='text'])[10]")
	 public WebElement postalZip;
	 
	 @FindBy (id="Address_Country")
	 public  WebElement Country;
	 
	 @FindBy(name="Number1")
	 public WebElement number;
	 
	 @FindBy(name="Email")
	 public WebElement email;
	 
	 @FindBy(name="Email1")
	 public WebElement workEmail;
	 
	 @FindBy(xpath="(//*/button[@class='fmSmtButton next_previous'])[3]")
	 public WebElement nextButton;
	 
	 @FindBy(xpath=".//*[@id='Number1-li']/div[1]/span/input")
	 public WebElement Extension;
	 
	 @FindBy(name="Email")
	 public WebElement PersonalEmail;
	 
	 @FindBy(xpath="//*[@id='Address_Country']")
	 public WebElement Country2;
	 
	 @FindBy(xpath="(//div/span/input[@name='countrycode'])[1]")
	 public WebElement personalPh1;
	 
	
	 @FindBy(xpath="(//div/span/input[@name='countrycode'])[2]")
	 public WebElement personalPh2;
	 
	 @FindBy(xpath="//*[@id='error-Email']")
	 public WebElement emailErrorMPersonal;
	 
	 @FindBy(xpath="//*[@id='error-Email1']")
	 public WebElement emailErrorMWork;
	
	 

	 
	 

}