package LoginPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPageAssertion {

	private final WebDriver browser;
	public LoginPageAssertion(WebDriver browser) {
		
		 this.browser = browser;
	}
	
	protected LoginPageElements elements() {
		 return new LoginPageElements(browser);
	}

		
	
	public void Gettitle()
	{	
		Assert.assertEquals(browser.getTitle(), "HRS | ClinicianConnect");
	}
	
	 public void logoispresent()
	 {
		 Assert.assertEquals(true,elements().Loginlogo().isDisplayed());
		 
		 highlightWebelement(elements().Loginlogo());
	 }
	 
	 public void LoginTextPresent()
	 {
		 Assert.assertEquals(true,elements().LoginText().isDisplayed());
		 
		 highlightWebelement(elements().LoginText());
	 }
	 
	 public void highlightWebelement(WebElement Element)
	 {
		 ((JavascriptExecutor) browser).executeScript("arguments[0].style.backgroundColor = 'MediumSeaGreen'", Element);
		 ((JavascriptExecutor) browser).executeScript("arguments[0].style.border='55px solid Tomato'", Element);
	 }
	 
	 public void LoginUsernameTextboxPresent()
	 {
		 Assert.assertEquals(true,elements().LoginUsernametextbox().isDisplayed());
		 
		 highlightWebelement(elements().LoginUsernametextbox());
	 }
	 
	 public void LoginPasswordTextboxPresent()
	 {
		 Assert.assertEquals(true,elements().LoginPasswordTextbox().isDisplayed());
		 
		 highlightWebelement(elements().LoginPasswordTextbox());
	 }
	 
	 public void LoginSinginbuttonispresent()
	 {
		 Assert.assertEquals(true,elements().Loginsinginbutton().isDisplayed());
		 
		 highlightWebelement(elements().Loginsinginbutton());
	 }
	 
	 public void LoginForgotPasswordispresent()
	 {
		 Assert.assertEquals(true,elements().Loginforgotpasswordlink().isDisplayed());
		 
		 highlightWebelement(elements().Loginforgotpasswordlink());
	 }
	 
	 public void LoginSinginbuttonisdisable()
	 {
		 Assert.assertEquals(false,elements().Loginsinginbutton().isEnabled());
		 
		 highlightWebelement(elements().Loginsinginbutton());
	 }
	
	 public void LoginSinginbuttonisenable()
	 {
		 Assert.assertEquals(true,elements().Loginsinginbutton().isEnabled());
		 
		 highlightWebelement(elements().Loginsinginbutton());
	 }
	 
	 public void InvalidMessageisdisplayed()
	 {
		
		 Assert.assertEquals(elements().InvalidMessage().getText(),"Username and/or password invalid");
		 
		
	 }
	 
	 public void ForgotTextispresent()
	 {
		 Assert.assertEquals(elements().ForgotText().getText(),"FORGOT PASSWORD?");
		 highlightWebelement(elements().ForgotText());
	 }
	 
	 
	 public void ForgotTextTitleText()
	 {
		 Assert.assertEquals(elements().ForgotTextTitle().getText(),"Enter your username below to reset your password.");
		 highlightWebelement(elements().ForgotTextTitle());
	 }
	 
	 public void ForgotUsernametextboxispresent()
	 {
		 Assert.assertEquals(true,elements().ForgotUserTextboxispresent().isDisplayed());
		 
		 highlightWebelement(elements().ForgotUserTextboxispresent());
		 
	 }
	 
	 
	 public void ForgotBackbuttonispresent()
	 {
		 Assert.assertEquals(true,elements().ForgotBackbuttonispresent().isDisplayed());
		 
		 highlightWebelement(elements().ForgotBackbuttonispresent());
		 
	 }
	 
	 public void ForgotSubmitbuttonispresent()
	 {
		 Assert.assertEquals(true,elements().Forgotsubmitbuttonispresent().isDisplayed());
		 
		 highlightWebelement(elements().Forgotsubmitbuttonispresent());
		 
	 }
	 
	 public void ResetMessageisdisplayed()
	 {
		
		 Assert.assertEquals(elements().ResetSucessMessage().getText(),"Reset password request successfully submitted.");
		 
		
	 }
}
