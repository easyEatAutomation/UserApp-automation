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

public class TAOrder extends WebBase {

	public static WebDriver driver;
	public String lastEightCharacters;
	public String testString;
	

	private By AddButton = By.xpath("//*[@id=\"uniquiMenuId0\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/div");

	private By Variant1 = By.xpath("//*[@id=\"241a91a444894ed6ad942e26a03edb0d\"]/div[2]/div[1]/span");
	
	private By Variant2 = By.xpath("//*[@id=\"bb0d52d7550e47c5ab48ddff89f63759\"]/div[2]/div[1]/span");
	private By Variant3 = By.xpath("//*[@id=\"f88441ed475240df894e509394892811\"]/div[2]/div[1]/span");
	private By AddVariant = By.xpath("//*[@id=\"uniquiMenuId0\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div");
	private By ViewCart = By.xpath("//*[@id=\"cartFooter\"]/div");
	private By PlaceOrder = By.xpath("//*[@id=\"cartFooter\"]/div/div[2]/div/div");
	private By Pay_Cash = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[4]/div/div[1]/div/div");
	                                
	private By IndnPay_Cash = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div");
	                                    
	

	public void AddClick() throws InterruptedException {

		clickOnElement(AddButton, "Add Button", 10);

	}
	
	
	public void Click_Variant1() throws InterruptedException {

		clickOnElement(Variant1, "Variant1", 10);

	}
	
	public void Click_Variant2() throws InterruptedException {

		clickOnElement(Variant2, "Variant2", 10);

	}
	
	public void Click_Variant3() throws InterruptedException {

		clickOnElement(Variant3, "Variant3", 10);

	}
	
	
	public void Click_AddVariant() throws InterruptedException {

		clickOnElement(AddVariant, "AddVariant", 10);

	}
	
	
	public void Click_ViewCart() throws InterruptedException {

		clickOnElement(ViewCart, "ViewCart", 10);

	}
	
	
	public void Click_PlaceOrder() throws InterruptedException {

		clickOnElement(PlaceOrder, "PlaceOrder", 10);

	}

	/*
	 * public void Click_Pay_Cash() throws InterruptedException {
	 * 
	 * clickOnElement(Pay_Cash, "PayCash", 10);
	 * 
	 * }
	 */
	
	
	public void Click_Pay_Cash() throws InterruptedException {
	    if (clickOnElement(Pay_Cash, "PayCash", 10)) {
	        System.out.println("Clicked using PayCash");
	    } else if (clickOnElement(IndnPay_Cash, "IndnPayCash", 10)) {
	        System.out.println("Clicked using IndnPayCash");
	    } else {
	        throw new RuntimeException("Button not found using both IndnPayCash");
	    }
	}
	
	
	
	public String read_invoice_number() {
	    WebElement invoiceElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[6]/div[1]/div[1]/div[2]"));
	            //*[@id="root"]/div/div[1]/div[3]/div[6]/div[1]/div[1]/div[2]
	    String invoiceNumber = invoiceElement.getText();
	    String lastEightCharacters = invoiceNumber.substring(Math.max(0, invoiceNumber.length() - 8));  
	    System.out.println("Print Invoice Number inside pickuporder" + lastEightCharacters);
	    testString="Mahmood";
	    return lastEightCharacters;
	    
	}
	
}
