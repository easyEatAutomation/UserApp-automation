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

	private By usernamevalue = By.id("email");
	private By passwordvalue = By.cssSelector("input[type=password]");

	private By loginButton = By.cssSelector("button[class='wd-100 login-action-btn ant-btn ant-btn-primary ant-btn-lg']");

	private By login_sucess = By.xpath("//*[@id=\"cdk-overlay-0\"]/nz-message-container/div");

	private By click_nine = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[3]/div[3]");
	private By click_five = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[2]/div[2]");
	private By click_eight = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[3]/div[2]");
	private By click_six = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[2]/div[3]");
	private By click_SignIn = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[4]");
	private By SearchInvoice = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[1]/app-order-left/div[1]/div/div[2]/nz-input-group/input");
	private By Close_MarketingPopup = By.xpath("//*[contains(@id, \"mat-dialog\")]/app-new-feature-ad/div/img[1]");

   
	
	public void enterUsername(String username) {

		enterTextInTextbox(usernamevalue, "Username Textbox", username, 10);

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



		Thread.sleep(3000);
		//closeBrowser();		

	}


	public void Close_MarketingPopup() throws InterruptedException {
		// Attempt to click AutomateSMS
		clickOnElement(Close_MarketingPopup, "Close_MarketingPopup", 1000);
		// Assuming clickOnElement sets some flag to indicate success
		// Replace this with your actual logic if available

	}

	
	
	public void SearchInvoice(String invoiceNumber) throws InterruptedException {
		enterTextInTextbox(SearchInvoice, invoiceNumber, invoiceNumber, 10);
	}


}
