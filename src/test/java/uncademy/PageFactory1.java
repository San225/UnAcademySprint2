package uncademy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class PageFactory1 {
	
	 static WebDriver driver;
	public PageFactory1(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	}
	
	//click on start learning
		@FindBy(xpath = "//button[contains(@class, 'e1gvoanf0 css-1jqben9-StyledButton-StyledStartLearning es6r9411')]")     
		WebElement VerifySL;
	//----------------------Login Start(path of webElements)------------------------
	
	//after entering url
	@FindBy(xpath="//button[contains(@class, 'e10vnqp01 css-1wh8yp5-StyledButton-ButtonWrapper es6r9411')]") 
	 WebElement LoginButton;
	//Clicking on Mobile number text field
	@FindBy(xpath="//input[@placeholder='Enter your mobile number']") 
	WebElement LoginTextField;
	
	//Clicking on login after entering mobile number
	@FindBy(xpath="(//button[@aria-label=\"Login\"])[2]") 
	WebElement LoginButton1;
	
	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	WebElement ClickonSearch;
	
	//Clicking on verify otp button after entering otp
	@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div[2]/button") 
	WebElement EnterOtp;
	
	//@FindBy(xpath = "//button[@aria-label=\"Verify OTP\"]")
	//WebElement VerifyonOtp;
	
	//Verifying login page by selecting on web element in the web page
	@FindBy(xpath="//button[contains(@class,' e16350na2 css-em2t7w-StyledButton-Verify es6r9411')]")
	WebElement VerifyLoginPage;
	
	@FindBy(xpath="//div[text()='OK GOT IT']")
	WebElement ClickOnokgotit;
	 
	//----------------------Login Stop(path of webElements)-------------------------
	
	//----------------------Search Valid data(path of webElements)-------------------
	//@FindBy(xpath = "//*[@id=\"searchTab\"]/div/div")
     //WebElement ClickOnsearch1;	
	@FindBy(xpath = "//button//*[@focusable='false']")
	WebElement ClickonGoal;
	@FindBy(xpath = "//p[text() = 'Add another goal']")
	WebElement ClickonaddGoal;
	@FindBy(xpath="(//div//*[@viewBox=\"0 0 80 80\"])[2]")
	WebElement ClickonX;
	@FindBy(xpath="//input[@id=\"searchInput\"]")
  	WebElement ClickonSearchButton;
	@FindBy(xpath = "//*[@id=\"searchTab\"]/div[2]/div[2]/div")
	WebElement ClickonSearchButton1;
	@FindBy(xpath = "//p[text()='IIT JEE']")
	WebElement VerifyCourse;
	//@FindBy(xpath="//p[text()= 'Experience our 2021 recap']")
	//WebElement ClickOnRecaplink;
	
	//----------------------Login Start(Operations on webElements)------------------------
	public void Login() 
	{
		LoginButton.click();
	}
	public void VerifyStartLearning() {
		VerifySL.click();
	}
	public void MobileTextField(String number) 
	{
		LoginTextField.sendKeys(number);
	}
	public void LoginAfterEnteringNumber()
	{
		LoginButton1.click();
	}
	public void ClickOnSearch()
	{
		ClickonSearch.click();
	}
	
	public void OtpVerifyButton() {
		
	}
	
     public void VerifyingLoginPage()
	{
		boolean displayed = VerifyLoginPage.isDisplayed();
		System.out.println(displayed);
	}
	//----------------------Login Stop(Operations on webElements)------------------------
	public void ClickOnokgotit()  {
	  ClickOnokgotit.click();
		
	}
	//Click on search button before entering data
    
    // public void ClickOnsearch1() {
    	// ClickOnsearch1.click();
     //}
   public void ClickonGoal()
   {
	  ClickonGoal.click();
   }
  public void ClickonaddGoal() {
	    ClickonaddGoal.click();
   }
  public void ClickonSearchButton() throws InterruptedException {
	  Thread.sleep(2000);
	  ClickonX.click();
	  Thread.sleep(2000);
	  ClickonSearchButton.click();
	  ClickonSearchButton.sendKeys("IIT JEE");
  }
   public void ClickonSearchButton1() throws InterruptedException {
	  Thread.sleep(2000);
	  ClickonSearchButton1.click();
  }
  public void verifyGoal() throws InterruptedException {
	  ClickonGoal.click();
	  Thread.sleep(1000);
	 Assert.assertEquals(VerifyCourse.getText(), "IIT JEE");
  }
  
 //public void ClickOnRecaplink() {
	//ClickOnRecaplink.click();
//}


}
    

