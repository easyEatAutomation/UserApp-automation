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

public class Promotion extends WebBase {

	public static WebDriver driver;
	


	private By ApplyCoupon = By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/div");
	private By SetCouponCode = By.xpath("//*[@id=\"root\"]/div/div[1]/div[5]/div/div[1]/div[2]/div/div");
	private By SelectCoupon = By.xpath("//*[@id=\"root\"]/div/div[1]/div[5]/div/div[2]/div[2]/div[1]/div[2]/div");
	private By VerifyDiscount = By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/div/div/div/span[1]");
	private By VerifyDiscountCartBill = By.xpath("//*[@id=\"root\"]/div/div[1]/div[5]/div[2]/div/div[2]/div[1]/div");
	private By VerifyDiscountOrderStatus = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[2]/div/div[2]/div[1]/div");
	private By VerifyDiscountPOS = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[2]/div[1]/div/p");

	
	
	public void ApplyCoupon() throws InterruptedException {
		clickOnElement(ApplyCoupon, "ApplyCoupon", 7000);
		Thread.sleep(5000);
	}
	
	
	
	public void SetCouponCode(String CouponCode) {

		enterTextInTextbox(SetCouponCode, "SetCouponCode", CouponCode, 10);

	}
	
	
	
	public void SelectCoupon() throws InterruptedException {
		clickOnElement(SelectCoupon, "SelectCoupon", 7000);
		Thread.sleep(5000);
	}
	
	
	public void VerifyDiscount() throws InterruptedException {
		toastmessage(VerifyDiscount, "Discount (\"GET10\")", 10);
		Thread.sleep(1000);
	}


	
	public void VerifyDiscountCartBill() throws InterruptedException {
		toastmessage(VerifyDiscountCartBill, "Discount (\"GET10\")", 10);
		Thread.sleep(1000);
	}
	
	
	public void VerifyDiscountOrderStatus() throws InterruptedException {
		toastmessage(VerifyDiscountOrderStatus, "Discount(\"GET10\")", 10);
		Thread.sleep(1000);
	}
	
	
	public void VerifyDiscountPOS() throws InterruptedException {
		toastmessage(VerifyDiscountPOS, "DISCOUNT(\"GET10\")", 10);
		Thread.sleep(1000);
	}
	
}