package stepDefination;

import Page.ActiveOrder_Void_Settle_POS;
import Page.Bill_ActiveOrder_Void_Settle_POS;
import Page.Bill_completeOrder;
import Page.CompleteOrder;
import Page.CookingInstructions_RepeatPreviousItems;
import Page.LoginPage;
import Page.PickupOrder;
import Page.Promotion;
import Page.TAOrder;
import Page.backbutton;
import Page.Loyalty;
import Page.Bill_Delivery;
import Page.Bill_pickupOrder;
import Page.Bill_Calculation_On_POS;
import Page.TableReservation;
import Page.ServiceRequest;
import Page.FeedbackPage;
import WebBase.WebBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefination{


//	public WebDriver driver;
	
	WebBase WebBase = new WebBase();
	LoginPage loginPage  = new LoginPage();
	CompleteOrder CompleteOrder = new CompleteOrder();
	PickupOrder PickupOrder = new PickupOrder();
	TAOrder TAOrder = new TAOrder();
	ActiveOrder_Void_Settle_POS ActiveOrder_Void_Settle_POS = new ActiveOrder_Void_Settle_POS();
	backbutton backbutton = new backbutton();
	CookingInstructions_RepeatPreviousItems CookingInstructions_RepeatPreviousItems = new CookingInstructions_RepeatPreviousItems();
	Promotion Promotion = new Promotion();
	Bill_completeOrder Bill_completeOrder =  new Bill_completeOrder();
	Bill_ActiveOrder_Void_Settle_POS Bill_ActiveOrder_Void_Settle_POS = new Bill_ActiveOrder_Void_Settle_POS();
    Loyalty Loyalty = new Loyalty();
    Bill_Calculation_On_POS  Bill_Calculation_On_POS = new Bill_Calculation_On_POS();
    Bill_Delivery Bill_Delivery = new Bill_Delivery();
    Bill_pickupOrder Bill_pickupOrder = new Bill_pickupOrder();
    TableReservation TableReservation = new TableReservation();
    ServiceRequest ServiceRequest = new ServiceRequest();
    FeedbackPage FeedbackPage = new FeedbackPage();
    
    
    
    WebDriver driver;
    
	public static String Invoice;
	public static String final_bill;
    public static String Invoice1;
    String posWindowHandle;

	
	
	  @Given("I open {string} browser and {string}") 
	  public void i_open_browser_and(String browserName, String orderType) throws InterruptedException { 
	  WebBase.createDriver(browserName);
	  WebBase.openWebsiteWithHandlingMultipleWin(orderType);
	  Thread.sleep(2000);
    }
	 
	  @When("I switch to the UserApp windowws")
	    public void i_switch_to_the_userapp_window() throws Exception {
	        WebBase.driver.switchTo().window(WebBase.userAppWindowHandle);
	        Thread.sleep(2000);
	    }

	    @Then("the UserApp URL should be able to loaded")
	    public void the_userapp_url_should_be_loaded() throws Exception {
	        String expected = WebBase.getUserAppURL("pickup");
	        String actual = WebBase.driver.getCurrentUrl();
	        assert actual.equals(expected) : "Expected UserApp URL: " + expected + ", but got: " + actual;
	        Thread.sleep(2000);
	    }
	    
	  
		/*
		 * @Given("I open the home page") public void i_open_the_home_page() {
		 * WebDriverManager.chromedriver().setup(); // Automatically downloads correct
		 * driver version driver = new ChromeDriver();
		 * driver.get("https://easyeat.ai/r/automation_cafe_Malaysia12/3"); }
		 */
    
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
	
	@Then("user calculate item_total_sst_sc_pc_Discount_manually")
	public void user_calculate_item_total_sst_sc_pc_Discount_manually()  throws InterruptedException{
		Bill_ActiveOrder_Void_Settle_POS.itemTotal_sst_pc_sc_discount();
	}


	@Then("user click  on Place Order Button")
	public void click_on_Place_Order_Button() throws InterruptedException {
		loginPage.Click_PlaceOrder ();
	}
	
	
	@Then("user validate SST on user App")
	public void user_validate_SST_on_user_App() throws InterruptedException{
		Bill_ActiveOrder_Void_Settle_POS.sst_validation();
	}

	@Then("user validate SC on user App")
	public void user_validate_SC_on_user_App() throws InterruptedException{
		Bill_ActiveOrder_Void_Settle_POS.sc_validation();
	}

	@Then("user validate PC on user App")
	public void user_validate_PC_on_user_App() throws InterruptedException{
		Bill_ActiveOrder_Void_Settle_POS.pc_validation();
	}
	
	@Then("user calculate and validate the Bill")
	public void user_calculate_and_validate_the_Bill() throws InterruptedException{
		final_bill = Bill_ActiveOrder_Void_Settle_POS.bill_calculation_and_validation();
	}


	@Then("user click on add more Button on userApp")
	public void user_click_on_add_more_Button_on_userApp()  throws InterruptedException{
		Bill_ActiveOrder_Void_Settle_POS.add_more_buttom();
	}
	
	@Then("user calculate item total sst sc pc Discount manually add more")
	public void user_calculate_item_total_sst_sc_pc_Discount_manually_add_more()  throws InterruptedException{
		Bill_ActiveOrder_Void_Settle_POS.itemTotal_sst_pc_sc_discount_after_add_more();
	}
	
	@Then("User Click on Minus icon")
	public void User_Click_on_Minus_icon() throws InterruptedException {
		loginPage.Click_Minus();
		
	}

	@When("User Click on Search icon")
	public void User_Click_on_Search_icon() throws InterruptedException {
		loginPage.Click_Search();
		
	}
	
	@Then("User enter {string}")
	public void user_enter(String Searchtext) {	 
	    loginPage.EnterSearchtext(Searchtext);
	 }
	
	
	@Then("User Click on SearchAdd button")
	public void User_Click_on_SearchAdd_button() throws InterruptedException {
		loginPage.Click_SearchAdd();
	}
	
	
	
	@Then("User Click on Addon1")
	public void User_Click_on_Addon1() throws InterruptedException {
		loginPage.Click_Addon1();
	}
	
	
	@Then("User Click on Variant Add Button")
	public void User_Click_on_Variant_Add_Button() throws InterruptedException {
		loginPage.Click_VariantAdd();
	}
	
	@Then("user click on Skip button")
	public void user_click_on_Skip_button() throws InterruptedException {
		loginPage.Click_Skip();

	}
	
	
	@Then("user click on Add More Button")
	public void user_click_on_Add_More_Button() throws InterruptedException {
		loginPage.Click_AddMore();
	}
	
	
	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		loginPage.LoginButton();
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
	
	@Then("user write countryname")
	public void user_write_countryname() {
		PickupOrder.enterCountry();
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
		
	
	@Then("user remove item")
	public void user_remove_item() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_remove();
	}
	
	@Then("user click on browse menu")
	public void user_click_on_browse_menu() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		PickupOrder.Click_Browse_Menu();
	}
	
	@Then("get invoice number")
	public void get_invoice_number() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("print invoice number inside stepdefnition..............");
		Invoice = PickupOrder.get_invoice_number();
//		CompleteOrder.setInvoice(Invoice);
//		stepDefination.setInvoice(Invoice);
		System.out.println("print invoice number inside stepdefnition" + Invoice);
	}

	@And("search invoice1 number")
	public void search_invoice1_number() throws InterruptedException {
		CompleteOrder.SearchInvoice(Invoice1);
	}

 

	@Then("verify status is prepared in userapp")
	public void verify_status_is_prepared_in_userapp() throws InterruptedException {
		CompleteOrder.Prepared();
	}
	
	
	@Then("verify status is preparing in userapp")
	public void verify_status_is_preparing_in_userapp() throws InterruptedException {
		CompleteOrder.Preparing();
	}
	
	
	@Then("get invoice1 number")
	public void get_invoice1_number() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("print invoice number inside stepdefnition..............");
		Invoice1 = PickupOrder.get_invoice_number();
//		CompleteOrder.setInvoice(Invoice);
//		stepDefination.setInvoice(Invoice);
		System.out.println("print invoice number inside stepdefnition" + Invoice1);
	}
	
	
//	@Given("I open {string} browser and POS {string}")
//	public void i_open_browser_and_POS(String browserName, String URL) throws Exception {
//		WebBase.createDriver(browserName);
//		WebBase.openWebsite(URL);
//		
//	}
	
	
	@And("I open {string} browser and POS {string}")
    public void i_open_browser_and_POS(String browserName, String orderType) throws Exception {
        WebBase.openWebsiteWithHandlingMultipleWin(orderType); 
        Thread.sleep(2000);
    }
	
	@When("I switch to the POS windowws")
    public void i_switch_to_the_pos_window() throws Exception {
        WebBase.driver.switchTo().window(WebBase.posAppWindowHandle);
        Thread.sleep(2000);
      }

    @Then("the POS URL should be able to loaded")
    public void the_pos_url_should_be_loaded() throws Exception {
        String expected = WebBase.getPOSURL();
        String actual = WebBase.driver.getCurrentUrl();
        assert actual.equals(expected) : "Expected POS URL: " + expected + ", but got: " + actual;
        Thread.sleep(2000);
    }
	
	
	
	
	 
	
	@When("User is on Login Page")
	public void user_is_on_Login_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("User is on Login Page");
	}
	
	
	@And("user click on bell icon")
	public void user_click_on_bell_icon() throws InterruptedException {
		
		ServiceRequest.BellIcon();
	}

	
	@Then("user click on CallTheServer button")
	public void user_click_on_CallTheServer_button() throws InterruptedException {
		
		ServiceRequest.CallTheServer();
	}
	
	@Then("user click on Cutlery button")
	public void user_click_on_Cutlery_button() throws InterruptedException {
		
		ServiceRequest.Cutlery();
	}
	
	@Then("user click on AddCutlery button")
	public void user_click_on_AddCutlery_button() throws InterruptedException {
		
		ServiceRequest.AddCutlery();
	}
	
	
	
	@Then("user click on Sauces button")
	public void user_click_on_Sauces_button() throws InterruptedException {
		
		ServiceRequest.Sauces();
	}
	
	@Then("user click on TomatoSauce button")
	public void user_click_on_TomatoSauce_button() throws InterruptedException {
		
		ServiceRequest.TomatoSauce();
	}
	
	
	@Then("user click on RequestItembutton")
	public void user_click_on_RequestItembutton_button() throws InterruptedException {
		
		ServiceRequest.RequestItembutton();
	}
	
	
	@Then("user click on RequestMoreButton")
	public void user_click_on_RequestMoreButton() throws InterruptedException {
		
		ServiceRequest.RequestMoreButton();
	}
	
	
	@Then("user click on DoneButton")
	public void user_click_on_DoneButton() throws InterruptedException {
		
		ServiceRequest.DoneButton();
	}
	
	
	@Then("user click on TableService")
	public void user_click_on_TableService() throws InterruptedException {
		
		ServiceRequest.TableService();
	}
	
	
	@Then("user click on MarkDoneButton")
	public void user_click_on_MarkDoneButton() throws InterruptedException {
		
		ServiceRequest.MarkDoneButton();
	}
	
	
	@Then("User enters Emailid and password {string}")
	public void user_enters_Emailid_and_password(String password) {


		CompleteOrder.enterUsername();
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
	
	
	@Then("Validate the userApp bill on POS")
	public void validate_the_userApp_bill_on_POS() throws InterruptedException{
		System.out.println("5555555: " + final_bill);
	  Bill_completeOrder.Bill_validation_on_pos(final_bill);
	}

	
	@Then("User Click on Start Preparing Button")
	public void User_Click_on_Start_Preparing_Button() throws InterruptedException {
		CompleteOrder.click_Start_Preparing();
	}
	
	@Then("User Click on Dispatched Button")
	public void User_Click_on_Dispatched_Button() throws InterruptedException {
		CompleteOrder.click_Dispatched();
	}
	
	
	@Then("User Click on Complete Button")
	public void User_Click_on_Complete_Button() throws InterruptedException {
		CompleteOrder.click_Complete();
	}
	
	@Then("user will select the payment option as cash")
	public void user_will_select_the_payment_option_as_cash() throws InterruptedException {
		CompleteOrder.SelectCash();
	}

	@Then("bill swipe for full amount")
	public void bill_swipe_for_full_amount() throws InterruptedException {
		CompleteOrder.SwipeComplete();
	}
	
	
	@Then("user click on Pay Cash to the Server")
	public void user_click_on_Pay_Cash_to_the_Server() throws InterruptedException {
		TAOrder.Click_Pay_Cash();
	}
	
	@Then("read invoice number")
	public void read_invoice_number() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("print invoice number inside stepdefnition..............");
		Invoice = TAOrder.read_invoice_number();
//		CompleteOrder.setInvoice(Invoice);
//		stepDefination.setInvoice(Invoice);
		System.out.println("print invoice number inside stepdefnition" + Invoice);
	}
	
	
	
	@When("Click on Settle Bill button")
	public void Click_on_Settle_Bill_button() throws InterruptedException {
	   ActiveOrder_Void_Settle_POS.SettleBill();
	   
	   
	}
	
	@Then("User will select payment option")
	public void User_will_select_payment_option() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.Cash();
	}
	
	
	@Then("User will select full amount")
	public void user_will_select_full_amount() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.enterAmount();
	}
	
	@Then("Click on Next button")
	public void click_on_Next_button() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.nextButton();
	    
	}
	
	
	
	@Then("User will click on Done button on Pop up")
	public void user_will_click_on_Done_button_on_Pop_up() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.pendingAmountDoneButton();
	}

	@Then("User will click on Done button and Order will be paid")
	public void user_will_click_on_Done_button_and_Order_will_be_paid() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.DoneButtonBillingPage();
	}
	
	
	@Then("user click on Order Status back button")
	public void user_click_on_Order_Status_back_button() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.OrderStatusBack();
	}
	
	
	@Then("user click on active banner")
	public void user_click_on_active_banner() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.ActiveBanner();
	}
	
	
	
	@Then("user will click on Void Icon")
	public void user_will_click_on_Void_Icon() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.VoidIcon();
	    
	}
	
	@Then("user will click on Void Dish Button")
	public void user_will_click_on_Void_Dish_Button() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.VoidDish();
	}
	
	@When("User clicks on add items")
	public void user_clicks_on_add_items() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.AddItems();
	}
	
	
	@Then("select Items A") 
	public void select_Items_A() throws InterruptedException {
		ActiveOrder_Void_Settle_POS.ItemNameA();
		
	    
	}
	

	@Then("Click on Create Order button")
	public void click_on_Create_Order_button()throws InterruptedException {
		ActiveOrder_Void_Settle_POS.CreateOrder();
	    
	}
	
	
	
	@Then("user click on cart back button")
	public void user_click_on_cart_back_button()throws InterruptedException {
		backbutton.Cartback();
	    
	}
	
	
	@Then("user click on payment back button")
	public void user_click_on_payment_back_button()throws InterruptedException {
		backbutton.Paymentback();
   }
	
	
	
	@Then("user click on Pay Now button")
	public void user_click_on_Pay_Now_button()throws InterruptedException {
		backbutton.PayNow();
   }
	
	
	@Then("user click on profile icon")
	public void user_click_on_profile_icon()throws InterruptedException {
		backbutton.ProfileIcon();
   }
	
	
	@Then("user click on Order History")
	public void user_click_on_Order_History()throws InterruptedException {
		backbutton.MyOrders();
   }
	
	
	
	@Then("user click on Order History back button")
	public void user_click_on_Order_History_back_button()throws InterruptedException {
		backbutton.OrderHistoryback();
   }
	
	
	@Then("user click on profile back button")
	public void user_click_on_profile_back_button()throws InterruptedException {
		backbutton.Profileback();
   }
	
	
	
	@Then("user click on menu profile icon")
	public void user_click_on_menu_profile_icon()throws InterruptedException {
		backbutton.ProfileIconMenu();
   }
	
	
	
	@Then("user click on plus icon on menu page")
	public void user_click_on_plus_icon_menu_page()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.PlusMenu();
   }
	
	
	
	
	@Then("user click on repeat previous button")
	public void user_click_on_repeat_previous_button()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.RepeatPrevious();
   }
	
	
	
	@Then("user click on plus icon on cart page")
	public void user_click_on_plus_icon_on_cart_page()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.PlusCart();
   }
	
	
	@Then("user click on repeat previous button on cart")
	public void user_click_on_repeat_previous_button_on_cart()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.RepeatPreviousCart();
   }
	
	
	
	
	@Then("user click on cooking instructions")
	public void user_click_on_cooking_instructions()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.CookingInstructions();
   }
	
	
	//bill calculation after add more item
	
	@Then("user calculate item total sst sc pc Discount manually after adding more item from POS")
	public void user_calculate_item_total_sst_sc_pc_Discount_manually_after_adding_more_item_from_POS() throws InterruptedException{
		Bill_Calculation_On_POS.itemTotal_sst_pc_sc_discount_POS_afterAddmore_item();
	}

	@Then("user validate SST on POS after addMoreItem")
	public void user_validate_SST_on_POS_after_addMoreItem() throws InterruptedException{
		Bill_Calculation_On_POS.sst_validation_after_addMoreItem();
	}

	@Then("user validate SC on user POS after addMoreItem")
	public void user_validate_SC_on_user_POS_after_addMoreItem() throws InterruptedException{
		Bill_Calculation_On_POS.sc_validation_after_addMoreItem();
	}

	@Then("user validate PC on user POS after addMoreItem")
	public void user_validate_PC_on_user_POS_after_addMoreItem() throws InterruptedException{
		Bill_Calculation_On_POS.pc_validation_after_addMoreItem();
	}

	@Then("user calculate and validate the Bill on POS after addMoreItem")
	public void user_calculate_and_validate_the_Bill_on_POS_after_addMoreItem() throws InterruptedException{
        Bill_Calculation_On_POS.bill_calculation_and_validation_after_addMoreItem();
	}
	
	// bill calculation after void item
	
	@Then("user calculate item total sst sc pc Discount manually after voiding item from POS")
	public void user_calculate_item_total_sst_sc_pc_Discount_manually_after_voiding_item_from_POS() throws InterruptedException{
		Bill_Calculation_On_POS.itemTotal_sst_pc_sc_discount_POS_after_voidItem();
	}
	
	@Then("user validate SST on POS after void iten")
	public void user_validate_SST_on_POS_after_void_iten() throws InterruptedException{
		Bill_Calculation_On_POS.sst_validation_after_voidItem();
	}

	@Then("user validate SC on user POS after void item")
	public void user_validate_SC_on_user_POS_after_void_item() throws InterruptedException{
		Bill_Calculation_On_POS.sc_validation_after_voidItem();
	}

	@Then("user validate PC on user POS after void item")
	public void user_validate_PC_on_user_POS_after_void_item() throws InterruptedException{
		Bill_Calculation_On_POS.pc_validation_after_voidItem();
	}

	@Then("user calculate and validate the Bill on POS after void item")
	public void user_calculate_and_validate_the_Bill_on_POS_after_void_item() throws InterruptedException{
		Bill_Calculation_On_POS.bill_calculation_and_validation_after_voidItem();
	}
	

	// bill_Delivery Order
	
	@Then("user calculate item_total_sst_sc_pc_Discount_manually_for_DL_order")
	public void user_calculate_item_total_sst_sc_pc_Discount_manually_for_DL_order() throws InterruptedException{
		Bill_Delivery.itemTotal_sst_pc_sc_discount();
	}

	@Then("user validate SST on user App_for_DL_order")
	public void user_validate_SST_on_user_App_for_DL_order() throws InterruptedException{
		Bill_Delivery.sst_validation();
	}

	@Then("user validate SC on user App_for_DL_order")
	public void user_validate_SC_on_user_App_for_DL_order() throws InterruptedException{
		Bill_Delivery.sc_validation();
	}

	@Then("user validate PC on user App_for_DL_order")
	public void user_validate_PC_on_user_App_for_DL_order() throws InterruptedException{
		Bill_Delivery.pc_validation();
	}

	@Then("user calculate and validate the Bill_for_DL_order")
	public void user_calculate_and_validate_the_Bill_for_DL_order() throws InterruptedException{
		final_bill = Bill_Delivery.bill_calculation_and_validation();
	}

	@Then("Validate the userApp bill on POS_for_DL_order")
	public void validate_the_userApp_bill_on_POS_for_DL_order() throws InterruptedException{
		Bill_completeOrder.Bill_validation_on_pos_for_dl_order(final_bill);
	}
	
	
	//Bill PickUp Order
	
	@Then("user calculate item_total_sst_sc_pc_Discount_manually_for_PU_order")
	public void user_calculate_item_total_sst_sc_pc_Discount_manually_for_PU_order() throws InterruptedException{
	  Bill_pickupOrder.itemTotal_sst_pc_sc_discount();
	}

	@Then("user validate SST on user App_for_PU_order")
	public void user_validate_SST_on_user_App_for_PU_order() throws InterruptedException{
		Bill_pickupOrder.sst_validation();
	}

	@Then("user validate SC on user App_for_PU_order")
	public void user_validate_SC_on_user_App_for_PU_order() throws InterruptedException{
		Bill_pickupOrder.sc_validation();
	}

	@Then("user validate PC on user App_for_PU_order")
	public void user_validate_PC_on_user_App_for_PU_order() throws InterruptedException{
		Bill_pickupOrder.pc_validation();
	}

	@Then("user calculate and validate the Bill_for_PU_order")
	public void user_calculate_and_validate_the_Bill_for_PU_order() throws InterruptedException{
		final_bill = Bill_pickupOrder.bill_calculation_and_validation();
	}

	@Then("Validate the userApp bill on POS_for_PU_order")
	public void validate_the_userApp_bill_on_POS_for_PU_order() throws InterruptedException{
		Bill_completeOrder.Bill_validation_on_pos_for_PU_order(final_bill);
	}


	
	@Then("user click on check box")
	public void user_click_on_check_box()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.CookingInstructionsCheckbox();
   }
	
	
	
	@Then("user click on add items for instructions button")
	public void user_click_on_add_items_for_instructions_button()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.AddItemsforInstructions();
   }
	
	
	@Then("user click on quick notes")
	public void user_click_on_quick_notes()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.QuickNotes();
   }
	
	
	@Then("user add instructions {string}")
	public void user_enters(String notes) {


		CookingInstructions_RepeatPreviousItems.AddInstructions(notes);
	}
	

	@Then("user click on add instructions button")
	public void user_click_on_add_instructions_button()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.AddInstructionsButton();
   }
	
	
	@Then("verify instructions on POS")
	public void verify_instructions_on_POS()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.Verify_Instructions();
   }
	
	
	@Then("verify instructions on order status page")
	public void verify_instructions_on_order_status_page()throws InterruptedException {
		CookingInstructions_RepeatPreviousItems.Verify_InstructionsOrderStatus();
   }
	
	
	@Then("user click on apply coupon")
	public void user_click_on_apply_coupon()throws InterruptedException {
		Promotion.ApplyCoupon();
   }
	
	
	
	
	@Then("enter coupon code {string}")
	public void enter_coupon_code(String CouponCode) {


		Promotion.SetCouponCode(CouponCode);
	}
	
	
	@Then("click on Apply button")
	public void user_click_on_apply_button()throws InterruptedException {
		Promotion.SelectCoupon();
   }
	
	
	@Then("verify discount is showing in cart page")
	public void verify_discount_is_showing_in_cart_page()throws InterruptedException {
		Promotion.VerifyDiscount();
   }
	
	
	@Then("verify discount is showing in cart bill")
	public void verify_discount_is_showing_in_cart_bill()throws InterruptedException {
		Promotion.VerifyDiscountCartBill();
   }
	
	
	@Then("verify discount is showing in order status page")
	public void verify_discount_is_showing_in_order_status_page()throws InterruptedException {
		Promotion.VerifyDiscountOrderStatus();
   }
	
	
	@Then("verify discount is showing in POS")
	public void verify_discount_is_showing_in_POS()throws InterruptedException {
		Promotion.VerifyDiscountPOS();
   }
	
	
	
	@Then("user click on loyalty checkbox")
	public void user_click_on_loyalty_checkbox()throws InterruptedException {
		Loyalty.LoyaltyCheckbox();
   }
	
	
	
	@Then("verify loyalty showing in cart bill")
	public void verify_loyalty_showing_in_cart_bill()throws InterruptedException {
		Loyalty.VerifyLoyaltyCartBill();
   }
	
	
	
	@Then("verify loyalty showing in order status page")
	public void verify_loyalty_showing_in_order_status_page()throws InterruptedException {
		Loyalty.VerifyLoyaltyOrderStatus();
   }
	
	
	@Then("verify loyalty showing in POS")
	public void verify_loyalty_showing_in_POS()throws InterruptedException {
		Loyalty.VerifyLoyaltyPOS();
   }
	
	@Then("I close browser")
	public void i_close_browser() {
		WebBase.closeBrowser();

	}
	
	//Table Reservation
	@When("user click on Login to book a seat button")
	public void user_click_on_Login_to_book_a_seat_button()throws InterruptedException {
		TableReservation.LoginToBook();
   }
	
	
	
	@Then("user click on book a seat button")
	public void user_click_on_book_a_seat_button()throws InterruptedException {
		TableReservation.BookSeatButton();
   }
	
	
	
	@Then("user select number of guest")
	public void user_select_number_of_guest()throws InterruptedException {
		TableReservation.SelectGuest();
   }
	
	
	
	@Then("user click on Pax Continue Button")
	public void user_click_on_Pax_Continue_Button()throws InterruptedException {
		TableReservation.PaxContinue();
   }
	
	
	
	@Then("user select the date")
	public void user_select_the_date()throws InterruptedException {
		TableReservation.SelectDate();
   }
	
	
	@Then("user select the time")
	public void user_select_the_time()throws InterruptedException {
		TableReservation.SelectTime();
   }
	
	
	@Then("user click on Date Continue Button")
	public void user_click_on_Date_Continue_Button()throws InterruptedException {
		TableReservation.DateContinue();
   }
	
	
	
	@Then("user enter name {string}")
	public void user_enter_name(String Name) {


		TableReservation.TypeName(Name);
	}
	
	
	@Then("user enter email id {string}")
	public void user_enter_email_id(String EmailId) {


		TableReservation.TypeEmailId(EmailId);
	}
	
	
	@Then("user enter contact no {string}")
	public void user_enter_contact_no(String ContactNo) {


		TableReservation.TypeContactNo(ContactNo);
	}
	
	
	@Then("user click on proceed button")
	public void user_click_on_proceed_Button()throws InterruptedException {
		TableReservation.TableProceedButton();
   }
	
	
	@Then("user click on any special request")
	public void user_click_on_any_special_request()throws InterruptedException {
		TableReservation.AnySpecialRequest();
   }
	
	
	@Then("user enter special request {string}")
	public void user_enter_special_request(String Request) {


		TableReservation.EnterSpecialRequest(Request);
	}
	
	
	@Then("user click on request submit button")
	public void user_click_on_request_submit_button()throws InterruptedException {
		TableReservation.RequestSubmitButton();
   }
	
	
	@Then("user click on add an occasion")
	public void user_click_on_add_an_occasion()throws InterruptedException {
		TableReservation.AddAnOccasion();
   }
	
	
	@Then("user choose an occasion")
	public void user_choose_an_occasion()throws InterruptedException {
		TableReservation.ChooseAnOccasion();
   }
	
	
	@Then("user click on occcasion submit button")
	public void user_click_on_occcasion_submit_button()throws InterruptedException {
		TableReservation.OccasionSubmitButton();
   }
	
	
	@Then("user click on book now button")
	public void user_click_on_book_now_Button()throws InterruptedException {
		TableReservation.BookNowButton();
	}
	
	
	@Then("user click on table booking tab")
	public void user_click_on_table_booking_tab()throws InterruptedException {
		TableReservation.POSTableBookingTab();
	}
	
	@Then("user click on booking requests button")
	public void user_click_on_booking_requests_button()throws InterruptedException {
		TableReservation.BookingRequest();
	}
	
	
	@Then("user click on accept button")
	public void user_click_on_accept_button()throws InterruptedException {
		TableReservation.AcceptButton();
	}
	
	
	@Then("user select the table")
	public void user_select_the_table()throws InterruptedException {
		TableReservation.SelectTable();
	}
	
	
	@Then("user close the booking request window")
	public void user_close_the_booking_request_window()throws InterruptedException {
		TableReservation.CloseBookingRequestWindow();
	}
	
	
	@Then("user click on tomorrow button")
	public void user_click_on_tomorrow_button()throws InterruptedException {
		TableReservation.TomorrowButton();
	}
	
	
	@Then("user click on checkin button")
	public void user_click_on_checkin_button()throws InterruptedException {
		TableReservation.CheckinButton();
	}
	
	
	@Then("user select the checkin table")
	public void user_select_the_checkin_table()throws InterruptedException {
		TableReservation.CheckSelectTable();
	}
	
	
	
	@Then("user click on smiley")
	public void user_click_on_smiley() throws InterruptedException {
		FeedbackPage.Smiley();
	}	
		
		
	@Then("user click on Excellent Taste")
	public void user_click_on_Excellent_Taste() throws InterruptedException {
		FeedbackPage.Excellenttaste();
	}	
		
	
	@Then("user give 5 star")
	public void user_give_5_star() throws InterruptedException {
		FeedbackPage.FiveStar();
	}	
		
	
	
	@Then("user enter feedback {string}")
	public void user_enter_feedback(String feedback) throws InterruptedException {
		FeedbackPage.WriteFeedback(feedback);
	}	
		
	
	
	@Then("user click on feedback submit button")
	public void user_click_on_feedback_submit_button() throws InterruptedException {
		FeedbackPage.FeedbackSubmit();
	}	
		
		
	
	
	
}