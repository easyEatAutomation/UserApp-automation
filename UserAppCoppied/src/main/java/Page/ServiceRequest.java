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
import Page.CompleteOrder;

public class ServiceRequest extends WebBase {

//public static WebDriver driver;



	private By BellIcon = By.xpath("/html/body/div/div/div[1]/div[1]/div/img[1]");
	private By CallTheServer = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/button/span/small");
	private By Cutlery = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/div[2]/button[1]/div");
	private By AddCutlery = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/div[2]/div[1]/div[2]/button");
    private By Sauces = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/div[2]/button[3]/div/div[2]");
	private By TomatoSauce = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/div[2]/div[1]/div[2]/button");
	private By DoneButton = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/div/div[2]/div[2]");
	private By RequestItembutton = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/div[3]/div[2]/div");
	private By RequestMoreButton = By.xpath("/html/body/div/div/div[9]/div/div/div[2]/div/div[2]/div[1]/div");
	private By TableService = By.xpath("/html/body/app-root/body/div/div/div[1]/app-sidenav/div/div[2]/div[1]/div[4]/div/div[2]/a/span");
	private By MarkDoneButton = By.xpath("/html/body/app-root/body/div/div/div[2]/app-table-service/div/div[3]/div/div[1]/div[2]");
	
	
	
	

	public void BellIcon() throws InterruptedException {

		clickOnElement(BellIcon, "BellIcon", 10);

	}
	
	
	
	public void CallTheServer() throws InterruptedException {

		clickOnElement(CallTheServer, "CallTheServer", 10);

	}

	
	
	public void Cutlery() throws InterruptedException {
		clickOnElement(Cutlery, "Cutlery", 10);

	}
	
	
	public void AddCutlery() throws InterruptedException {

		clickOnElement(AddCutlery, "AddCutlery", 10);

	}
	
	
	public void Sauces() throws InterruptedException {

		clickOnElement(Sauces, "Sauces", 10);

	}
	
	
	public void TomatoSauce() throws InterruptedException {

		clickOnElement(TomatoSauce, "TomatoSauce", 10);

	}
	

	
	public void RequestItembutton() throws InterruptedException {

		clickOnElement(RequestItembutton, "RequestItembutton", 10);
		Thread.sleep(500);
	}
	
	
	public void RequestMoreButton() throws InterruptedException {

		clickOnElement(RequestMoreButton, "RequestMoreButton", 10);
		Thread.sleep(1000);
	}
	
	
	
	public void DoneButton() throws InterruptedException {

		clickOnElement(DoneButton, "DoneButton", 10);

	}
	
	public void TableService() throws InterruptedException {

		clickOnElement(TableService, "TableService", 10);

	}
	
	
	public void MarkDoneButton() throws InterruptedException {

		clickOnElement(MarkDoneButton, "MarkDoneButton", 10);
		Thread.sleep(500);
	}
}
