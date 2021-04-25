package LoginPackage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class LoginPageElements {
	
	private final WebDriver driver;
	
	public LoginPageElements(WebDriver driver) {
		 this.driver = driver;
	}
	
	
	

	public WebElement LoginUsernametextbox() {
		
		if (_funWaitWithSeconds(By.id("loginEmail")))
		 {
		 return driver.findElement(By.id("loginEmail"));
		 }
		 else {
		
		 return null;
		 }
		
	}
		
	 public WebElement LoginPasswordTextbox() {
		 if (_funWaitWithSeconds(By.id("password")))
		 {
		 return driver.findElement(By.id("password"));
		 }
		 else {
		 return null;
		}
		 
	 }
	
	 public WebElement LoginText() {
		 if (_funWaitWithSeconds(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/form/div[1]/h3")))
		 {
		 return driver.findElement(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/form/div[1]/h3"));
		 }
		 else {
		
		 return null;
		 }
	 }
		
	 public WebElement Loginlogo() {
			
		 if (_funWaitWithSeconds(By.xpath("//*[@id='loginHeaderLogo']")))
		 {
			 return driver.findElement((By.xpath("//*[@id='loginHeaderLogo']")));
		 }
		 else
		 {
			 return null;
		 }
	 }
	 
	 public WebElement Loginforgotpasswordlink() {
			
			if (_funWaitWithSeconds(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/form/div[4]/a")))
			 {
			 return driver.findElement(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/form/div[4]/a"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 
	 public WebElement Loginsinginbutton() {
			
			if (_funWaitWithSeconds(By.id("loginSubmitButton")))
			 {
			 return driver.findElement(By.id("loginSubmitButton"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	
	 

	 public WebElement InvalidMessage() {
			
			if (_funWaitWithSeconds(By.xpath("//*[@Class='cg-notify-message-template']/span")))
			 {
			 return driver.findElement(By.xpath("//*[@Class='cg-notify-message-template']/span"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 
	 
	 ////*[@id="loginPage"]/div[2]/div/div[1]/div[2]/div/forgot-password-component/form/div[1]/h3
	 
	 public WebElement ForgotText() {
			
			if (_funWaitWithSeconds(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/div/forgot-password-component/form/div[1]/h3")))
			 {
			 return driver.findElement(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/div/forgot-password-component/form/div[1]/h3"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 
	 public WebElement ForgotTextTitle() {
			
			if (_funWaitWithSeconds(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/div/forgot-password-component/form/div[1]/p")))
			 {
			 return driver.findElement(By.xpath("//*[@id='loginPage']/div[2]/div/div[1]/div[2]/div/forgot-password-component/form/div[1]/p"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 
	 public WebElement ForgotUserTextboxispresent() {
			
			if (_funWaitWithSeconds(By.id("resetPassword_username")))
			 {
			 return driver.findElement(By.id("resetPassword_username"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 //resetPasswordBackButton
	 public WebElement ForgotBackbuttonispresent() {
			
			if (_funWaitWithSeconds(By.id("resetPasswordBackButton")))
			 {
			 return driver.findElement(By.id("resetPasswordBackButton"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 
	 
	 public WebElement Forgotsubmitbuttonispresent() {
			
			if (_funWaitWithSeconds(By.id("resetPasswordSaveButton")))
			 {
			 return driver.findElement(By.id("resetPasswordSaveButton"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 
	 public WebElement ResetSucessMessage() {
			
			if (_funWaitWithSeconds(By.xpath("//*[@Class='cg-notify-message-template']/span")))
			 {
			 return driver.findElement(By.xpath("//*[@Class='cg-notify-message-template']/span"));
			 }
			 else {
			
			 return null;
			 }
			
		}
	 public boolean _funWaitWithSeconds(By byLocator){
			try {
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
						.withTimeout(30, TimeUnit.SECONDS) //30 seconds
						.pollingEvery(5, TimeUnit.SECONDS) // 5 seconds
						.ignoring(NoSuchElementException.class)
						.ignoring(StaleElementReferenceException.class);
					wait.until(ExpectedConditions.presenceOfElementLocated(byLocator));
					
				return true;
			} catch (Exception e) {
				System.out.println("Exception in wait with secondds. "+e.getMessage());
				return false;
			}
		}
	 
	 
}
