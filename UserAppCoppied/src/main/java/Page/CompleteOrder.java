	package Page;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Page.PickupOrder;

import WebBase.WebBase;
import kotlin.jvm.Throws;

public class CompleteOrder extends WebBase {

	//private static final String String = null;

	public static WebDriver driver;
	public String userEmailId;
	
	private By usernamevalue = By.id("email");
	private By passwordvalue = By.cssSelector("input[type=password]");

	private By loginButton = By.xpath("/html/body/app-root/body/div/div/div/app-login/div/div[1]/div/form/nz-form-item[3]/nz-form-control/div/div/button/span");
	
	private By login_sucess = By.xpath("//*[@id=\"cdk-overlay-0\"]/nz-message-container/div");

	private By click_nine = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[3]/div[3]");
	private By click_five = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[2]/div[2]");
	private By click_eight = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[3]/div[2]");
	private By click_six = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[2]/div[3]");
	private By click_SignIn = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[4]");
	private By SearchInvoice = By.cssSelector("input[type=\"search\"]");
			//html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[1]/app-order-left/div[1]/div/div[2]/nz-input-group/input");
	private By Close_MarketingPopup = By.xpath("//*[contains(@id, \"mat-dialog\")]/app-new-feature-ad/div/img[1]");
	private By Start_Preparing = By.xpath("//app-order-right//button[span[normalize-space(text())='START PREPARING']]\r\n");
	private By IndnStart_Preparing = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]/span");
	private By Dispatched = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[3]/div[2]/button[2]/span");
	private By IndnDispatched = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]/span");
	private By Complete = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[3]/div[2]/button[2]/span");
	private By IndnComplete = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]/span");
	private By SelectCash = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-payment-pending/div/div[2]/app-payment-options/div/nz-spin/div/div/div[2]");
	                                  //div[@id="mat-mdc-dialog-0"]//app-payment-options//div[3]/p
	                                    //*[@id="mat-mdc-dialog-0"]/div/div/app-payment-pending/div/div[2]/app-payment-options/div/nz-spin/div/div/div[4]
	private By SwipeComplete = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-payment-pending/div/div[3]/button");

	
   
	
	public void enterUsername() {
		getuserEmailId();
		enterTextInTextbox(usernamevalue, "Username Textbox", userEmailId, 10);

	}
	
	

	public void enterPassword(String password) {

		enterTextInTextbox(passwordvalue, "Password Textbox", password, 10);

	}

	public void loginClick() throws InterruptedException {

		clickOnElement(loginButton, "Login Button", 10);

	}

	public void login_successfully() throws InterruptedException {
		Thread.sleep(1000);
		toastmessage(login_sucess, "Login successful", 10);

	}

	public void click_nine()throws InterruptedException {

		clickOnElement(click_nine, "click nine", 10);

	}

	public void click_five()throws InterruptedException {

		clickOnElement(click_five, "click five", 10);

	}
	public void click_eight()throws InterruptedException {

		clickOnElement(click_eight, "click eight", 10);

	}
	public void click_six()throws InterruptedException {

		clickOnElement(click_six, "click six", 10);
	}

	public void click_SignIn() throws InterruptedException 
	{
		clickOnElement(click_SignIn, "click Sign In", 10);
		Thread.sleep(5000);
		//closeBrowser();		

	}


	public void Close_MarketingPopup() throws InterruptedException {
		// Attempt to click AutomateSMS
		clickOnElement(Close_MarketingPopup, "Close_MarketingPopup", 10);
		// Assuming clickOnElement sets some flag to indicate success
		// Replace this with your actual logic if available

	}

	
	
	public void SearchInvoice(String invoiceNumber) throws InterruptedException {
		enterTextInTextbox(SearchInvoice, invoiceNumber, invoiceNumber, 10);
		Thread.sleep(10000);
	}


	/*
	 * public void click_Start_Preparing()throws InterruptedException {
	 * 
	 * clickOnElement(Start_Preparing, "Start Preparing", 10); Thread.sleep(10000);
	 * }
	 */
	
	
	public void click_Start_Preparing() throws InterruptedException {
	    if (clickOnElement(Start_Preparing, "Start_Preparing", 10)) {	    	
	        System.out.println("Clicked using Start_Preparing");
	        Thread.sleep(10000);
	    } else if (clickOnElement(IndnStart_Preparing, "IndnStart_Preparing", 10)) {
	        System.out.println("Clicked using IndnStart_Preparing");
	        Thread.sleep(10000);
	    } else {
	        throw new RuntimeException("Button not found using both IndnStart_Preparing");
	    }
	}
	
	
	/*
	 * public void click_Dispatched()throws InterruptedException {
	 * 
	 * clickOnElement(Dispatched, "Dispatched", 10); Thread.sleep(10000); }
	 */
	
	
	public void click_Dispatched() throws InterruptedException {
	    if (clickOnElement(Dispatched, "Dispatched", 10)) {
	        System.out.println("Clicked using Dispatched");
	        Thread.sleep(10000);
	    } else if (clickOnElement(IndnDispatched, "IndnDispatched", 10)) {
	        System.out.println("Clicked using IndnDispatched");
	        Thread.sleep(10000);
	    } else {
	        throw new RuntimeException("Button not found using both IndnDispatched");
	    }
	}
	
	/*
	 * public void click_Complete()throws InterruptedException {
	 * 
	 * clickOnElement(Dispatched, "Dispatched", 10); Thread.sleep(10000); }
	 */
	
	
	public void click_Complete() throws InterruptedException {
	    if (clickOnElement(Complete, "Complete", 10)) {
	        System.out.println("Clicked using Complete");
	    } else if (clickOnElement(IndnComplete, "IndnComplete", 10)) {
	        System.out.println("Clicked using IndnComplete");
	    } else {
	        throw new RuntimeException("Button not found using both IndnComplete");
	    }
	}
	
	
	public void SelectCash()throws InterruptedException{
		clickOnElement(SelectCash, "Select Cash", 10);
		Thread.sleep(2000);

	}
	
	public void SwipeComplete () throws InterruptedException{
		clickOnElement(SwipeComplete, "SwipeComplete", 10);
		Thread.sleep(2000);

	}
	
	
	public String getuserEmailId() {
		String country = WebBase.currentCountry;
		if(country.equalsIgnoreCase("Malaysia")){
			userEmailId = "magic@easyeat.ai"; //malaysia Id
		}
		else
		{
			userEmailId = "indnmagic@easyeat.ai"; //Indonesia Id
		}
		return userEmailId;
	}
}




