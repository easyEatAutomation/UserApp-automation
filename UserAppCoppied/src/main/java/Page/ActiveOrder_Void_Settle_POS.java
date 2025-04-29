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
	private By ActiveBanner = By.xpath("/html/body/div/div/div[8]/div/div/div/div/div");
	
	private By SettleBill = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[3]/div[1]/button[2]/span");
	private By IndnSettleBill = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[2]/span");       
	private By Cash = By.xpath("/html/body/app-root/body/div/div/div/app-settle/div/div/app-payment-method/div[3]/div/button[3]/p");
	                    
	private By enterAmount = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div[1]/button[2]");
	private By nextButton = By.xpath("//div[@id=\"new-order-details-id\"]//button");
			//div[@id=\"new-order-details-id\"]/div[2]/button");
	                             
	private By pendingAmountDoneButton = By.xpath("//*[@id=\\\"new-order-details-id\\\"]/div[2]/button[2]");
	private By DoneButtonBillingPage = By.xpath("/html/body/app-root/body/div/div/div/app-settle/div/app-cart/div/div[3]/div/div");
	private By VoidIcon = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[2]/div[3]/div/div[2]/img");
	private By IndnVoidIcon = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[3]/div[3]/div[2]/img");
	private By VoidDish = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-void-dish/div/div[3]/button");
	private By AddItems = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[3]/div[1]/button[1]/span");                                
	private By IndnAddItems = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[1]/span");
			
	private By ItemNameA = By.xpath("/html/body/app-root/body/div/div/div/app-pos-order/section/div/div/app-dish-display/div[2]/div[2]/div[3]/div/div[3]/p");                                
	private By IndnItemNameA = By.xpath("/html/body/app-root/body/div/div/div/app-pos-order/section/div/div/app-dish-display/div[2]/div[2]/div[2]/div/div[2]/p");
			
	
	private By CreateOrder = By.xpath("/html/body/app-root/body/div/div/div/app-pos-order/section/div/app-cart/div/div[3]/div[2]/button[1]/span");
	                                        
	public void OrderStatusBack()throws InterruptedException {
		clickOnElement(OrderStatusBack, "OrderStatusBack", 10);
		Thread.sleep(20000);
	}
	
	
	public void ActiveBanner()throws InterruptedException {
		clickOnElement(ActiveBanner, "ActiveBanner", 1000);
		Thread.sleep(1500);
	}
	
	
	
	/*
	 * public void SettleBill()throws InterruptedException {
	 * clickOnElement(SettleBill, "Clicked on Settle Bill", 10);
	 * Thread.sleep(15000); }
	 */

	
	public void SettleBill() throws InterruptedException {
	    if (clickOnElement(SettleBill, "SettleBill", 10)) {
	    	Thread.sleep(15000);
	        System.out.println("Clicked using SettleBill");
	    } else if (clickOnElement(IndnSettleBill, "IndnSettleBill", 10)) {
	    	Thread.sleep(15000);
	        System.out.println("Clicked using IndnSettleBill");
	    } else {
	        throw new RuntimeException("Button not found using both SettleBill");
	    }
	}
	
	
	public void Cash()throws InterruptedException {

		clickOnElement(Cash, "Cash Bill", 10);
		Thread.sleep(1500);
	}

	
	
	public void enterAmount () throws InterruptedException {

		clickOnElement(enterAmount, "Clicked on full Amount", 10);
		Thread.sleep(1500);
	}
	

	public void nextButton () throws InterruptedException {

		clickOnElement(nextButton, "Clicked on Next Button", 10);

		Thread.sleep(1500);
    }
	
	
	
	public void pendingAmountDoneButton () throws InterruptedException {

		clickOnElement(pendingAmountDoneButton, "Clicked on Pending Amount Done Button", 10);
		Thread.sleep(1500);

	}
	
	
	public void DoneButtonBillingPage() throws InterruptedException {

		clickOnElement(DoneButtonBillingPage,"Clicked on Done button on Billing Page", 10);
		Thread.sleep(1500);

	}
	
	/*
	 * public void VoidIcon() throws InterruptedException { clickOnElement(VoidIcon,
	 * "Clicked on Void Icon", 10); Thread.sleep(2000);
	 * 
	 * }
	 */
	
	public void VoidIcon() throws InterruptedException {
	    if (clickOnElement(VoidIcon, "VoidIcon", 10)) {
	    	Thread.sleep(1000);
	        System.out.println("Clicked using VoidIcon");
	    } else if (clickOnElement(IndnVoidIcon, "IndnVoidIcon", 10)) {
	    	Thread.sleep(1000);
	        System.out.println("Clicked using IndnVoidIcon");
	    } else {
	        throw new RuntimeException("Button not found using both VoidIcon");
	    }
	}
        

	public void VoidDish() throws InterruptedException {
		clickOnElement(VoidDish, "Clicked on Void Dish", 10);
     Thread.sleep(5000);
	}
	
	
	/*
	 * public void AddItems() throws InterruptedException { clickOnElement(AddItems,
	 * "Items Added Into cart", 10); Thread.sleep(1000); }
	 */
	
	
	public void AddItems() throws InterruptedException {
	    if (clickOnElement(AddItems, "AddItems", 10)) {
	    	Thread.sleep(1000);
	        System.out.println("Clicked using AddItems");
	    } else if (clickOnElement(IndnAddItems, "IndnAddItems", 10)) {
	    	Thread.sleep(1000);
	        System.out.println("Clicked using IndnAddItems");
	    } else {
	        throw new RuntimeException("Button not found using both AddItems");
	    }
	}
        
	
	/*
	 * public void ItemNameA() throws InterruptedException {
	 * 
	 * clickOnElement(ItemNameA, "Selected ItemA", 10); Thread.sleep(1000);
	 * 
	 * 
	 * }
	 */

	public void ItemNameA() throws InterruptedException {
	    if (clickOnElement(ItemNameA, "ItemNameA", 10)) {
	    	Thread.sleep(1000);
	        System.out.println("Clicked using ItemNameA");
	    } else if (clickOnElement(IndnItemNameA, "IndnItemNameA", 10)) {
	    	Thread.sleep(1000);
	        System.out.println("Clicked using IndnItemNameA");
	    } else {
	        throw new RuntimeException("Button not found using both ItemNameA");
	    }
	}

	public void CreateOrder() throws InterruptedException {

		clickOnElement(CreateOrder, "Clicked on Create Order button on Cart screen", 10);

	}

	
}