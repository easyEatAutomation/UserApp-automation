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

public class ActiveOrder_Void_Settle_POS extends WebBase {

	//public static WebDriver driver;
	

	
	private By OrderStatusBack = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[1]/div[1]/img");
	private By ActiveBanner = By.xpath("//*[@id=\"root\"]/div/div[8]/div/div/div/div/div/div/div[3]/div");
	private By SettleBill = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[2]");
	private By Cash = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/div/app-payment-method/div[3]/div/button[2]/p");
	private By enterAmount = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div[1]/button[2]");
	private By nextButton = By.xpath("//*[@id=\"new-order-details-id\"]/div[2]/div/button");
	private By pendingAmountDoneButton = By.xpath("//*[@id=\"new-order-details-id\"]/div[2]/button[2]");
	private By DoneButtonBillingPage = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/app-cart/div/div[3]/div/div");
	
	private By VoidIcon = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[3]/div/div[2]/img");
	private By VoidDish = By.xpath("//*[contains(@id, 'mat-dialog')]/app-void-dish/div/div[3]/button");
	                           
	private By AddItems = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[1]");
	
	private By ItemNameA = By.xpath("//*[@id=\"6720700bf3a22676692eeca18184da14f805364706f62006c57ba66c845b870a\"]/div[3]/div/div[1]/img");
	private By CreateOrder = By.xpath("/html/body/app-root/body/div/div[2]/div/app-pos-order/section/div/app-cart/div/div[3]/div[2]/button[1]");
	
	
	public void OrderStatusBack()throws InterruptedException {
		clickOnElement(OrderStatusBack, "OrderStatusBack", 1000);
		Thread.sleep(1500);
	}
	
	
	public void ActiveBanner()throws InterruptedException {
		clickOnElement(ActiveBanner, "ActiveBanner", 1000);
		Thread.sleep(1500);
	}
	
	
	
	public void SettleBill()throws InterruptedException {
		clickOnElement(SettleBill, "Clicked on Settle Bill", 1000);
		Thread.sleep(15000);


	}

	public void Cash()throws InterruptedException {

		clickOnElement(Cash, "Cash Bill", 1000);
	}

	
	
	public void enterAmount () throws InterruptedException {

		clickOnElement(enterAmount, "Clicked on full Amount", 1000);
		Thread.sleep(1500);
	}
	

	public void nextButton () throws InterruptedException {

		clickOnElement(nextButton, "Clicked on Next Button", 1000);

		Thread.sleep(1500);
    }
	
	
	
	public void pendingAmountDoneButton () throws InterruptedException {

		clickOnElement(pendingAmountDoneButton, "Clicked on Pending Amount Done Button", 1000);
		Thread.sleep(1500);

	}
	
	
	public void DoneButtonBillingPage() throws InterruptedException {

		clickOnElement(DoneButtonBillingPage,"Clicked on Done button on Billing Page", 1000);
		Thread.sleep(1500);

	}
	
	public void VoidIcon() throws InterruptedException {
		clickOnElement(VoidIcon, "Clicked on Void Icon", 1000 );
		Thread.sleep(2000);

	}

	public void VoidDish() throws InterruptedException {
		clickOnElement(VoidDish, "Clicked on Void Dish", 1000 );

	}
	
	
	public void AddItems() throws InterruptedException {
		clickOnElement(AddItems, "Items Added Into cart", 1000);
		Thread.sleep(1000);
	}

	
	public void ItemNameA() throws InterruptedException {

		clickOnElement(ItemNameA, "Selected ItemA", 1000);
		Thread.sleep(1000);


	}



	public void CreateOrder() throws InterruptedException {

		clickOnElement(CreateOrder, "Clicked on Create Order button on Cart screen", 1000);

	}

	
}