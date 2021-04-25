package LoginPackage;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginMainPage {

	 private final WebDriver browser;
	 private final String url = "https://cc.healthrecoverysolutions.com/login";
	 public static WebDriverWait wait;
	public LoginMainPage(WebDriver browser) {
		// TODO Auto-generated constructor stub
		this.browser=browser;
	}
	
	protected LoginPageElements elements() {
	return new LoginPageElements(browser);
	}
	public LoginPageAssertion assertions() {
	 return new LoginPageAssertion(browser);
	}
	
	

	 public void navigate() {
	 
		 browser.navigate().to(url);
	     browser.manage().window().maximize();
	     System.out.println("Title text: "+browser.getTitle());
	     wait = new WebDriverWait(browser, 15000);
	 }
	 
	 
	 public void EnterUsernamdandPassowrd(String Username, String Password)
	 {
		 elements().LoginUsernametextbox().clear();
		 elements().LoginUsernametextbox().sendKeys(Username);
		 elements().LoginPasswordTextbox().clear();
		 elements().LoginPasswordTextbox().sendKeys(Password);
	
		 
	 }
	
	 
	 public void SigninButtonclick()
	 {
		 elements().Loginsinginbutton().click();
	 }
	 
	 public void SigninButtonEnter()
	 {
		 elements().Loginsinginbutton().sendKeys(Keys.ENTER);
	 }
	 public void ForgotPasswordLinkClick()
	 {
		 elements().Loginforgotpasswordlink().click();
	 }
	 
	 public void ForgotSubmitbuttonClick()
	 {
		 elements().Forgotsubmitbuttonispresent().click();
	 }
	 
	 public void EnterExistingUsername(String Username )
	 {
		 elements().ForgotUserTextboxispresent().sendKeys(Username);
	 }
	 
}
