package stepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import Page.LoginPage;
import WebBase.WebBase;
import Page.CompleteOrder;
import Page.PickupOrder;
import Page.Promotion;
import Page.Loyalty;
import Page.CookingInstructions_RepeatPreviousItems;
import Page.TAOrder;
import Page.backbutton;
import Page.ActiveOrder_Void_Settle_POS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class stepDefination {


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
	Loyalty Loyalty = new Loyalty();
	
	public static String Invoice;
	public static String Invoice1;

	@Given("I open {string} browser and {string}")
	public void i_open_browser_and(String browserName, String URL) throws InterruptedException {
		WebBase.createDriver(browserName);
		WebBase.openWebsite(URL);
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
		System.out.println("Skip message12121212121212");

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
	
	
	@Then("get invoice1 number")
	public void get_invoice1_number() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("print invoice number inside stepdefnition..............");
		Invoice1 = PickupOrder.get_invoice_number();
//		CompleteOrder.setInvoice(Invoice);
//		stepDefination.setInvoice(Invoice);
		System.out.println("print invoice number inside stepdefnition" + Invoice1);
	}
	
	@Given("I open {string} browser and POS {string}")
	public void i_open_browser_and_POS(String browserName, String URL) {
		WebBase.createDriver(browserName);
		WebBase.openWebsite(URL);
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

	
	@And("search invoice1 number")
	public void search_invoice1_number() throws InterruptedException {
		CompleteOrder.SearchInvoice(Invoice1);
	}
	
	@Then("User Click on Start Preparing Button")
	public void User_Click_on_Start_Preparing_Button() throws InterruptedException {
		CompleteOrder.click_Start_Preparing();
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
	
	
}


		
		




