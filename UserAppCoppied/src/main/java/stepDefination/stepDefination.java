package stepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import Page.LoginPage;
import WebBase.WebBase;
import Page.CompleteOrder;
import Page.PickupOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class stepDefination {


//	public WebDriver driver;
	
	WebBase webBase = new WebBase();
	LoginPage loginPage  = new LoginPage();
	CompleteOrder CompleteOrder = new CompleteOrder();
	PickupOrder PickupOrder = new PickupOrder();
	
	public static String Invoice;

	@Given("I open {string} browser and {string}")
	public void i_open_browser_and(String browserName, String URL) throws InterruptedException {
		webBase.createDriver(browserName);
		webBase.openWebsite(URL);
	}
	@When("User is on Menu Page")
	public void user_is_on_Menu_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("User is on Menu Page");
	}

	@Then("User Click on Add button")
	public void click_on_Add_Button() throws InterruptedException {


		loginPage.AddClick();
	}

	@And("Click on Variant1")
	public void click_on_Variant1() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		loginPage.Click_Variant1();

	}

	@And("Click on Variant2")
	public void click_on_Variant2() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		loginPage.Click_Variant2();

	}

	@And("Click on Variant3")
	public void click_on_Variant3() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		loginPage.Click_Variant3();

	}


	@Then("User Click on AddVariant Button")
	public void click_on_AddVariant_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		loginPage.Click_AddVariant();

	}


	@Then("user click  on View Cart Button")
	public void click_on_View_Cart_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		loginPage.Click_ViewCart ();

	}

	@Then("user click  on Place Order Button")
	public void click_on_Place_Order_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		loginPage.Click_PlaceOrder ();

	}


	@Then("user click  on Continue Button")
	public void click_on_Continue_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_Continue();

	}
	
	@Then("user click  on Login via Mobile Number Button")
	public void click_on_Login_via_Mobile_Number_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_LoginviaMobile();

	}
	
	@Then("user click on Flag")
	public void click_on_Flag() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_Flag();

	}
	
	@Then("user write {string}")
	public void user_write(String Country) {
		PickupOrder.enterCountry(Country);
	}
	
	
	@Then("user click on Malaysia Country code")
	public void click_on_Malaysia_Country_code() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_CountryCode();
	}
	
	
	@Then("user set mobile number {string}")
	public void user_set_mobile_number(String Mobile) {
		PickupOrder.EnterMobileNumber(Mobile);
	}
	
	
	@Then("user click on Continue1 Button")
	public void click_on_Continue1_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_Continue1();

	}
	
	@Then("select StoreCredits Checkbox")
	public void select_StoreCredits_Checkbox() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_StoreCredits();

	}
	
	
	@Then("click on Confirm to pay Button")
	public void click_on_Confirm_to_pay_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_ConfirmToPay();

	}
	
	
	@Then("click on Okay got it button")
	public void click_on_Okay_got_it_Button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_OkayGotIt();
	}
		
	
	@Then("get invoice number")
	public void get_invoice_number() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Invoice = PickupOrder.get_invoice_number();
//		CompleteOrder.setInvoice(Invoice);
//		stepDefination.setInvoice(Invoice);
		System.out.println("print invoice number inside stepdefnition" + Invoice);
	}
	
	@Given("I open {string} browser and POS {string}")
	public void i_open_browser_and_POS(String browserName, String URL) {
		webBase.createDriver(browserName);
		webBase.openWebsite(URL);
	}
	@When("User is on Login Page")
	public void user_is_on_Login_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("User is on Login Page");
	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {


		CompleteOrder.enterUsername(username);
		CompleteOrder.enterPassword(password);
	}

	@And("Click on Login button")
	public void click_on_loginButton() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		CompleteOrder.loginClick();

	}

	@Then("User should get logged in")
	public void user_should_get_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is Logged In");
		System.out.println("test for Invoice" + Invoice);
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() throws InterruptedException {

		CompleteOrder.login_successfully();

	}


	@Then("user click  {string}")
	public void user_click(String string) throws InterruptedException {

		CompleteOrder.click_nine();
		CompleteOrder.click_five();
		CompleteOrder.click_eight();
		CompleteOrder.click_six();

	}
	@Then("click on SignIn button")
	public void click_on_SignIn_button() throws InterruptedException {
		CompleteOrder.click_SignIn();

	}

	@Then("close marketing pop up")
	public void close_marketing_pop_up() throws InterruptedException {
		CompleteOrder.Close_MarketingPopup();

	}

	
	@And("search invoice number")
	public void search_invoice_number() throws InterruptedException {
		CompleteOrder.SearchInvoice(Invoice);
	    
	    
	}
}
		
		

		
	


