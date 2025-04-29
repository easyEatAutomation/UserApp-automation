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

public class ServiceRequest extends WebBase {

//public static WebDriver driver;



	private By Cartback = By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div/div[1]/div[1]/img");
	private By Paymentback = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[1]/img");
	private By PayNow = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[6]/div[2]/div[2]/div");
	private By ProfileIcon = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/img[2]");
    private By ProfileIconMenu = By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img[2]");
	private By MyOrders = By.xpath("//*[@id=\"root\"]/div/div[3]/div[3]/div[2]/div[1]/div");
	private By OrderHistoryback = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[1]/img");
	private By Profileback = By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/img");

	
	
	
	
	

	public void Cartback() throws InterruptedException {

		clickOnElement(Cartback, "Cartback", 10);

	}
	
	
	
	public void Paymentback() throws InterruptedException {

		clickOnElement(Paymentback, "Paymentback", 10);

	}

	
	
	public void PayNow() throws InterruptedException {
		clickOnElement(PayNow, "PayNow", 10);

	}
	
	
	public void ProfileIcon() throws InterruptedException {

		clickOnElement(ProfileIcon, "ProfileIcon", 10);

	}
	
	
	public void MyOrders() throws InterruptedException {

		clickOnElement(MyOrders, "MyOrders", 10);

	}
	
	
	public void OrderHistoryback() throws InterruptedException {

		clickOnElement(OrderHistoryback, "OrderHistoryback", 10);

	}
	
	
	public void Profileback() throws InterruptedException {

		clickOnElement(Profileback, "Profileback", 10);

	}
	
	
	public void ProfileIconMenu() throws InterruptedException {

		clickOnElement(ProfileIconMenu, "ProfileIconMenu", 10);

	}
	
}
