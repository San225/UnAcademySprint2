package StepDefination1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import uncademy.PageFactory1;

public class LoginStep1 extends Base {
	 static WebDriver driver;
	PageFactory1 pf;


	@Given("^Open url of unacademy application$")
	public void open_url_of_unacademy_application() throws IOException { 
		driver = initilizeBrowser();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://unacademy.com/");
		takeScreenshot("Login_Page");
	}
	@When("I Click on the {string} button on home page of unacademy application")
	public void i_click_on_the_button_on_home_page_of_unacademy_application(String string) {
		pf = new PageFactory1(driver);
		pf.VerifyStartLearning();
	}

	@Then("User should navigate to login page of unacademy application")
	public void user_should_navigate_to_login_page_of_unacademy_application() {
		System.out.println("User is navigated to login page");
	}

	@Then("Message will be displayed as we are in login page")
	public void message_will_be_displayed_as_we_are_in_login_page() throws IOException {
		System.out.println("User is on login page");
		takeScreenshot("Sign in");
	}

	@Then("click on search")
	public void click_on_search() {
		pf=new PageFactory1(driver);
		pf.ClickOnSearch();
	}
	@When("^Click on login option on homepage$")
	public void click_on_login_option_on_homepage()  {
		pf = new PageFactory1(driver);
		pf.Login();   
	}

	@Then("^click on login button$")
	public void click_on_login_button() {
		pf = new PageFactory1(driver);
		pf.LoginAfterEnteringNumber();
	}

	@Then("^Verify user able to login successfully$")
	public void verify_user_able_to_login_successfully() {
		pf= new PageFactory1(driver);
		pf.VerifyingLoginPage();
	}

	@And("^Enter registered valid \"([^\"]*)\" into the Text field$")
	public void enter_registered_valid_something_into_the_text_field(String mobilenumber) {
		pf= new PageFactory1(driver);
		pf.MobileTextField(mobilenumber);
	}



	@And("^click on verifyotp button option$")
	public void click_on_veifyotp_button_option()  {
		pf= new PageFactory1(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[3]/div[2]/div[2]/button"))).click();
		pf.OtpVerifyButton();
	}

	@And("^Enter otp from your logned number$")
	public void enter_otp_from_your_logned_number() throws InterruptedException {
		Thread.sleep(35000);

	}
	@Then("click on okgotit")
	public void click_on_okgotit()  {
		pf= new PageFactory1(driver);
		pf.ClickOnokgotit();  
	}



	//@Then("click on search1")
	//public void click_on_search1() {
	//pf=new PageFactory1(driver);
	//pf.ClickOnsearch1();
	// }

	// @Then("Message will displayed as we are in recaplink page")
	//public void message_will_displayed_as_we_are_in_recaplink_page() {
	//pf= new PageFactory1(driver); 

	//}
	@Then("click on my goals")
	public void click_on_my_goals() throws IOException {
		pf = new PageFactory1(driver);
		pf.ClickonGoal();
		takeScreenshot("Goal_Page");
	}

	@Then("click on add to goal section")
	public void click_on_add_to_goal_section() throws IOException {
		pf = new PageFactory1(driver);
		pf.ClickonaddGoal();
		takeScreenshot("goal");
	}

	@Then("Message will displayed as we are in search for goal page")
	public void message_will_displayed_as_we_are_in_search_for_goal_page() {
		System.out.println("Course will be displayed");
	}

	@Given("Click on Search button before enter courses name")
	public void click_on_search_button_before_enter_courses_name() throws InterruptedException, IOException {
		pf = new PageFactory1(driver);
		pf.ClickonSearchButton();
		takeScreenshot("search1");
	}

	@Then("Enter the {string} into the search text field")
	public void enter_the_into_the_search_text_field(String string) throws IOException {
		pf = new PageFactory1(driver);
		takeScreenshot("Search_Page");

	}

	@Then("Click on Search button1")
	public void click_on_search_button() throws InterruptedException, IOException {
		pf = new PageFactory1(driver);
		pf.ClickonSearchButton1();
		takeScreenshot("Search");
	}

	@Then("Verify the Course is added to goal section")
	public void verify_the_course_is_added_to_goal_section() throws InterruptedException, IOException  {
		pf = new PageFactory1(driver);
		pf.verifyGoal();
		takeScreenshot("Course");
		

	}

	public static void takeScreenshot(String tName) throws IOException {      
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File file = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file,new File("C:\\Unacademy26\\AcademySprint\\Screenshots/" +tName +".jpg"));
	}

}





