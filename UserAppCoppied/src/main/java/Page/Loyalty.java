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

import WebBase.WebBase;
import kotlin.jvm.Throws;

public class Loyalty extends WebBase {

	public static WebDriver driver;
	


	private By LoyaltyCheckbox = By.xpath("//*[@id=\"root\"]/div/div[1]/div[5]/div[1]/span");
	private By VerifyLoyaltyCartBill = By.xpath("//*[@id=\"root\"]/div/div[1]/div[7]/div[2]/div/div[2]/div[1]/div");
	private By VerifyLoyaltyOrderStatus = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[4]/div[2]/div/div[2]/div[1]/div");
	                                                //*[@id="root"]/div/div/div[3]/div[4]/div[2]/div/div[2]
	private By VerifyLoyaltyPOS = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[2]/div[5]/div[2]/div[1]/div/p");
 	                                    
	
	public void LoyaltyCheckbox() throws InterruptedException {
		clickOnElement(LoyaltyCheckbox, "LoyaltyCheckbox" , 10);
		Thread.sleep(5000);
	}
	
	

	public void VerifyLoyaltyCartBill() throws InterruptedException {
		toastmessage(VerifyLoyaltyCartBill, "Loyalty Cashback" , 10);
		Thread.sleep(1000);
	}
	
	
	public void VerifyLoyaltyOrderStatus() throws InterruptedException {
		toastmessage(VerifyLoyaltyOrderStatus, "Loyalty Cashback" , 10);
		Thread.sleep(1000);
	}
	
	
	public void VerifyLoyaltyPOS() throws InterruptedException {
		toastmessage(VerifyLoyaltyPOS, "LOYALTY CASHBACK", 10);
		Thread.sleep(1000);
	}
	
}