package LoginPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class LoginTest 
{
	
	

	public static WebDriver driver;	
	public static WebDriverWait wait;

	/**Verify Login Page Details **/
  @Test
  public void VerifyLoginPageFieldsispresentTest() {
	  try
	  {

	  LoginMainPage L= new LoginMainPage(driver);
	  L.navigate();
	  L.assertions().Gettitle();
	  Thread.sleep(5000);
	  L.assertions().LoginTextPresent();
	  L.assertions().logoispresent();
	  L.assertions().LoginUsernameTextboxPresent();
	  L.assertions().LoginPasswordTextboxPresent();
	  L.assertions().LoginSinginbuttonispresent();
	  L.assertions().LoginForgotPasswordispresent();
	  }
	  catch (Exception ex)
	  {
		  System.out.println (ex.toString());
	      
		 
		  
	  }
	  
  }
  /** Verify whether the Signin Button is Disabled during Initial Load  **/
  @Test
  public void VerifySigninbuttonisdisbableddInitialLoad()
  {
	  try {
		  LoginMainPage L= new LoginMainPage(driver);
		  L.navigate();
		  L.assertions().Gettitle();
		  Thread.sleep(5000);
		  L.assertions().LoginSinginbuttonispresent();
		  L.assertions().LoginSinginbuttonisdisable();
		  
	} catch (Exception e) {
		 System.out.println ("Exception in the VerifySigninbuttonisdisbableddInitialLoad"+e.toString());
	}
  
  }
  /** Verify whether the Signin Button is Enabled after Enter Username and Password  **/
  
  @Test
  public void VerifySigninbuttonisEnabled()
  {
	  try {
		  LoginMainPage L= new LoginMainPage(driver);
		  L.navigate();
		  L.assertions().Gettitle();
		  Thread.sleep(5000);
		  L.EnterUsernamdandPassowrd("test", "test");
		  L.assertions().LoginSinginbuttonispresent();
		  L.assertions().LoginSinginbuttonisenable();
		  
	} catch (Exception e) {
		 System.out.println ("Exception in the VerifySigninbuttonisEnabled"+e.toString());
	}
  
  }
  /**Verify Whether the Invalid Username and password message is displayed by click on Signin button  **/
  @Test
  public void VerifyinvalidUsernameandpassword()
  {
	  try {
		  LoginMainPage L= new LoginMainPage(driver);
		  L.navigate();
		  L.assertions().Gettitle();
		  Thread.sleep(5000);
		  L.EnterUsernamdandPassowrd("test", "test");
		  L.SigninButtonclick();
		  Thread.sleep(5000);
		  L.assertions().InvalidMessageisdisplayed();
		  
		  
	} catch (Exception e) {
		 System.out.println ("Exception in the VerifySigninbuttonisEnabled"+e.toString());
	}
  
  }
  /**Verify Whether the Invalid Username and password message is displayed by click on Enter key**/
  @Test
  public void VerifyinvalidUsernameandpasswordbyclickingEnterKey()
  {
	  try {
		  LoginMainPage L= new LoginMainPage(driver);
		  L.navigate();
		  L.assertions().Gettitle();
		  Thread.sleep(5000);
		  L.EnterUsernamdandPassowrd("test", "test");
		  L.SigninButtonEnter();
		  Thread.sleep(5000);
		  L.assertions().InvalidMessageisdisplayed();
		  
		  
	} catch (Exception e) {
		 System.out.println ("Exception in the VerifySigninbuttonisEnabled"+e.toString());
	}
  
  }
  
  /**Verfiy whether the Forgot Password page is displayed after click on Forgot Password link**/
  @Test
  public void VerifyForgotPasswordPage()
  {
	  try {
		  LoginMainPage L= new LoginMainPage(driver);
		  L.navigate();
		  L.assertions().Gettitle();
		  Thread.sleep(5000);
		  L.ForgotPasswordLinkClick();
		  Thread.sleep(5000);
		  L.assertions().ForgotTextispresent();
		  L.assertions().ForgotTextTitleText();
		  L.assertions().ForgotBackbuttonispresent();
		  L.assertions().ForgotSubmitbuttonispresent();
		  
		  
	} catch (Exception e) {
		 System.out.println ("Exception in the VerifyForgotPasswordPage"+e.toString());
	}
  
  }
  
  
  /**Verfiy whether the user is able to submit the reset password request after click on Submit button**/
  @Test
  public void VerifyResetPassword()
  {
	  try {
		  LoginMainPage L= new LoginMainPage(driver);
		  L.navigate();
		  L.assertions().Gettitle();
		  Thread.sleep(5000);
		  L.ForgotPasswordLinkClick();
		  Thread.sleep(5000);
		  L.assertions().ForgotTextispresent();
		  L.assertions().ForgotTextTitleText();
		  L.assertions().ForgotBackbuttonispresent();
		  L.assertions().ForgotSubmitbuttonispresent();
		  L.EnterExistingUsername("Test");
		  Thread.sleep(3000);
		  L.ForgotSubmitbuttonClick();
		  Thread.sleep(5000);
		  L.assertions().ResetMessageisdisplayed();
		  
		  
		  
	} catch (Exception e) {
		 System.out.println ("Exception in the VerifyResetPassword"+e.toString());
	}
  
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  String FilePath="";
	  try
	  {
		  
	   	String[] S= {"--start-maximized","-incognito","--disable-popup-blocking"};
		FilePath = new java.io.File(".").getCanonicalPath()+ "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",FilePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments(S)	;
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15000);
		
	  }
	  catch (IOException ex)
	  {
		  System.out.println (ex.toString());
	      
		  System.out.println("Could not find file path " + FilePath);
		  
	  }
	 
  }

  @AfterMethod
  public void afterMethod() {
	
	  driver.quit();
	  
  }

 

}
