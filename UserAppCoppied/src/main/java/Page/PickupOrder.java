package Page;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.matcher.Matcher;

import WebBase.WebBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kotlin.jvm.Throws;
import kotlin.reflect.KProperty.Getter;
import Page.CompleteOrder;

public class PickupOrder extends WebBase {

//public static WebDriver driver;
public String fillcountry;
 public String lastEightCharacters;
 public String testString;
 
 CompleteOrder CompleteOrder = new CompleteOrder();

	private By Continue = By.xpath("//*[@id=\"cartFooter\"]/div/div[2]/div");

	private By LoginviaMobile = By.xpath("//*[@id=\"login\"]/div[3]/div[3]");

	private By Flag = By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[2]/div[2]/div");
	private By CountryValue= By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div[2]/div[2]/ul/li[1]/input");
	private By CountryCode = By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div[2]/div[2]/ul/li[2]");
	private By MobileNumber = By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[2]/input");
	private By Continue1 = By.xpath("//*[@id=\"login\"]/div[3]/div");
	private By StoreCredits = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[1]/span");
	private By ConfirmToPay = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div");
	private By Okaygotit = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[3]/div");
	private By remove = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div/div[2]/div/button[1]");
	private By Browse_Menu = By.xpath("//*[@id=\"root\"]/div/div/div[3]");
	
	

	public void Click_Continue() throws InterruptedException {

		clickOnElement(Continue, "Continue", 10);

	}


	public void Click_LoginviaMobile() throws InterruptedException {

		clickOnElement(LoginviaMobile, "LoginviaMobile", 10);
		Thread.sleep(1500);
	}

	public void Click_Flag() throws InterruptedException {

		clickOnElement(Flag, "Flag", 10);
		Thread.sleep(1500);
	}



	public void enterCountry() {
		fillCountryname();
		enterTextInTextbox(CountryValue, "Country Textbox", fillcountry, 10);

	}




	public void Click_CountryCode() throws InterruptedException {
		Thread.sleep(1500);

		clickOnElement(CountryCode, "CountryCode", 10);

	}


	public void EnterMobileNumber(String Mobile) {

		enterTextInTextbox(MobileNumber, "MobileNumber Textbox", Mobile, 10);

	}


	public void Click_Continue1() throws InterruptedException {

		clickOnElement(Continue1, "Continue1", 10);
		Thread.sleep(15000);

	}

	public void Click_StoreCredits() throws InterruptedException {

		clickOnElement(StoreCredits, "StoreCredits", 10);

	}


	public void Click_ConfirmToPay() throws InterruptedException {

		clickOnElement(ConfirmToPay, "ConfirmToPay", 10);
		Thread.sleep(15000);
	}


	public void Click_OkayGotIt() throws InterruptedException {

		clickOnElement(Okaygotit, "Okaygotit", 10);
		Thread.sleep(5000);
	}

	
	public String get_invoice_number() {
	    WebElement invoiceElement = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[position() >= 4 and position() <= 5]/div[1]/div[1]/div[2]"));
	    
	    		//#root > div > div > div.d-flex.flex-column.gap-3 > div:nth-child(5) > div.d-flex.justify-content-between.fs-18.px-20.py-2.pt-2 > div.title.d-flex.flex-column > div.text-muted.fs-12.fw-500"));
	                                                                  // #root > div > div > div.d-flex.flex-column.gap-3 > div:nth-child(4) > div.d-flex.justify-content-between.fs-18.px-20.py-2.pt-2 > div.title.d-flex.flex-column > div.text-muted.fs-12.fw-500
	    String invoiceNumber = invoiceElement.getText();
	    lastEightCharacters = invoiceNumber.substring(Math.max(0, invoiceNumber.length() - 8));  
	    System.out.println("Print Invoice Number inside pickuporder" + lastEightCharacters);
	    testString="Mahmood";
	    return lastEightCharacters;
	    
	}
	
	
	public void Click_remove() throws InterruptedException {

		clickOnElement(remove, "remove", 10);
		Thread.sleep(5000);
	}

	public void Click_Browse_Menu() throws InterruptedException {

		clickOnElement(Browse_Menu, "Browse_Menu", 10);
		Thread.sleep(5000);
	}

	
	
	public String fillCountryname() {
		String country = WebBase.currentCountry;
		if(country.equalsIgnoreCase("Malaysia")){
			fillcountry = "Malaysia"; //malaysia 
		}
		else
		{
			fillcountry = "Indonesia"; //Indonesia 
		}
		return fillcountry;
	}
}


