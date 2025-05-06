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
//import kotlin.jvm.Throws;
//import kotlin.reflect.KProperty.Getter;


public class TableReservation extends WebBase {
	
	
	private By LoginToBook = By.xpath("/html/body/div/div/div[1]/div[2]/div[2]");

	private By BookSeatButton = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]");

	private By SelectGuest = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[4]/span[1]");

	private By PaxContinue = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]");

	private By SelectDate = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]");
	                                 
	private By SelectTime = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[4]/div[3]");
			                         //html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[4]/div[1]");
	                                  
	private By DateContinue = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[5]/div");

	private By TypeName = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/form/div[1]/input");
	private By TypeEmailId = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/form/div[2]/input");
	private By TypeContactNo = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/form/div[3]/input");
	private By TableProceedButton = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div[2]/div");
	
	private By AnySpecialRequest = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[4]/div[1]");
	                                        
	private By AddAnOccasion = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[4]/div[3]");
	
	private By EnterSpecialRequest = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/div[2]/textarea");
	
	private By RequestSubmitButton = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/div[3]");
	
	private By ChooseAnOccasion = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/div[2]/div[1]");
	
	private By OccasionSubmitButton = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/div[3]");
	private By BookNowButton = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[5]/div");
	
	private By POSTableBookingTab = By.xpath("/html/body/app-root/body/div/div/div[1]/app-sidenav/div/div[2]/div[1]/div[6]/div/div[2]/a/span");
	
	private By BookingRequest = By.xpath("/html/body/app-root/body/div/div/div[2]/app-table-bookings/div/div[1]/div/button[2]");
	private By AcceptButton = By.xpath("/html/body/div[1]/div[4]/div/nz-modal-container/div/div/div/app-booking-requests-modal/div/div[2]/div/div[2]/button[1]");
	private By SelectTable = By.xpath("/html/body/div[1]/div[6]/div/nz-modal-container/div/div/div/app-checkin-booking-modal/div/div[2]/div/div/button[2]");
	private By CheckSelectTable = By.xpath("/html/body/div[1]/div[3]/div/nz-modal-container/div/div/div/app-checkin-booking-modal/div/div[2]/div/div/button[2]");
	private By CloseBookingRequestWindow = By.xpath("/html/body/div[1]/div[4]/div/nz-modal-container/div/div/div/app-booking-requests-modal/div/div[1]/div[2]");
	private By TomorrowButton = By.xpath("/html/body/app-root/body/div/mat-sidenav-container/mat-sidenav-content/app-table-bookings/div/div[2]/div[2]/div[1]/div[2]");
	private By CheckinButton = By.xpath("/html/body/app-root/body/div/div/div[2]/app-table-bookings/div/div[2]/div[3]/div[1]/div[2]/div/div[2]/button[2]");
	
	
	public void LoginToBook() throws InterruptedException {

		clickOnElement(LoginToBook, "LoginToBook", 10);

	}


	public void BookSeatButton() throws InterruptedException {

		clickOnElement(BookSeatButton, "BookSeatButton", 10);

	}
	
	
	
	public void SelectGuest() throws InterruptedException {

		clickOnElement(SelectGuest, "SelectGuest", 10);

	}
	
	
	
	public void PaxContinue() throws InterruptedException {

		clickOnElement(PaxContinue, "PaxContinue", 10);
		Thread.sleep(500);

	}
	
	
	public void SelectDate() throws InterruptedException {

		clickOnElement(SelectDate, "SelectDate", 10);
		Thread.sleep(1000);

	}
	
	
	public void SelectTime() throws InterruptedException {

		clickOnElement(SelectTime, "SelectTime", 10);

	}
	
	
	public void DateContinue() throws InterruptedException {

		clickOnElement(DateContinue, "DateContinue", 10);

		Thread.sleep(1000);
	}
	
	
	public void TypeName(String Name) {

		enterTextInTextbox(TypeName, "TypeName", Name, 10);

	}

	public void TypeEmailId(String EmailId) {

		enterTextInTextbox(TypeEmailId, "TypeEmailId", EmailId, 10);

	}
	
	public void TypeContactNo(String ContactNo) {

		enterTextInTextbox(TypeContactNo, "TypeContactNo", ContactNo, 10);

	}

	
	public void TableProceedButton() throws InterruptedException {

		clickOnElement(TableProceedButton, "TableProceedButton", 10);
		Thread.sleep(1000);
	}
	

	
	public void AnySpecialRequest() throws InterruptedException {

		clickOnElement(AnySpecialRequest, "AnySpecialRequest", 10);

	}
	
	
	
	public void EnterSpecialRequest(String Request) {

		enterTextInTextbox(EnterSpecialRequest, "EnterSpecialRequest", Request, 10);

	}
	
	
	
	public void AddAnOccasion() throws InterruptedException {

		clickOnElement(AddAnOccasion, "AddAnOccasion", 10);

	}
	
	
	public void RequestSubmitButton() throws InterruptedException {

		clickOnElement(RequestSubmitButton, "RequestSubmitButton", 10);
		Thread.sleep(1000);
	}
	
	public void ChooseAnOccasion() throws InterruptedException {

		clickOnElement(ChooseAnOccasion, "ChooseAnOccasion", 10);

	}
	
	
	
	public void OccasionSubmitButton() throws InterruptedException {

		clickOnElement(OccasionSubmitButton, "OccasionSubmitButton", 10);
		Thread.sleep(1000);
	}
	
	
	
	public void BookNowButton() throws InterruptedException {

		clickOnElement(BookNowButton, "BookNowButton", 10);

	}

	
	public void POSTableBookingTab() throws InterruptedException {

		clickOnElement(POSTableBookingTab, "POSTableBookingTab", 10);

	}

	
	
	public void BookingRequest() throws InterruptedException {

		clickOnElement(BookingRequest, "BookingRequest", 10);

	}
	
	
	public void AcceptButton() throws InterruptedException {

		clickOnElement(AcceptButton, "AcceptButton", 10);

	}
	
	public void TomorrowButton() throws InterruptedException {

		clickOnElement(TomorrowButton, "TomorrowButton", 10);

	}
	
	
	public void SelectTable() throws InterruptedException {

		clickOnElement(SelectTable, "SelectTable", 10);
		Thread.sleep(500);

	}
	
	
	public void CheckSelectTable() throws InterruptedException {

		clickOnElement(CheckSelectTable, "CheckSelectTable", 10);
		

	}
	
	public void CloseBookingRequestWindow() throws InterruptedException {

		clickOnElement(CloseBookingRequestWindow, "CloseBookingRequestWindow", 10);

	}
	
	
	public void CheckinButton() throws InterruptedException {

		clickOnElement(CheckinButton, "CheckinButton", 10);

	}
	
	

}
