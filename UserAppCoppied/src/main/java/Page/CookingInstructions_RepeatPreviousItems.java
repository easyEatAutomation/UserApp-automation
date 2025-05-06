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
//import kotlin.jvm.Throws;

public class CookingInstructions_RepeatPreviousItems extends WebBase {

	public static WebDriver driver;
	


	private By PlusMenu = By.xpath("//*[@id=\"uniquiMenuId0\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/button[3]");
	private By RepeatPrevious = By.xpath("//*[@id=\"uniquiMenuId0\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[3]/div[2]/div");
	private By PlusCart = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div/div[2]/div/button[3]");
	private By RepeatPreviousCart = By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[2]");
	private By CookingInstructions = By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div");
	private By CookingInstructionsCheckbox = By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div[2]/div[2]/span");
	private By AddItemsforInstructions = By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[2]/div/div[3]");
	private By QuickNotes = By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[2]/div/div[3]/div[1]");
	private By AddInstructions = By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[2]/div/textarea");
	private By AddInstructionsButton = By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div/div[2]/div/div[4]/div[2]");
	private By Verify_Instructions = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[3]/div[3]/app-order-right/div/div[2]/div[3]/div/div[1]/div/div[3]");
	                                           
	private By Verify_InstructionsOrderStatus = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[3]/div[2]/div/div/div/div[5]/div/span");
	
	
	public void PlusMenu() throws InterruptedException {
		clickOnElement(PlusMenu, "PlusMenu", 10);
		Thread.sleep(2000);
	}


	
	public void RepeatPrevious() throws InterruptedException {
		clickOnElement(RepeatPrevious, "RepeatPrevious", 10);
		Thread.sleep(4000);
	}
	
	public void PlusCart() throws InterruptedException {
		clickOnElement(PlusCart, "PlusCart", 10);
		Thread.sleep(2000);
	}
	
	
	public void RepeatPreviousCart() throws InterruptedException {
		clickOnElement(RepeatPreviousCart, "RepeatPreviousCart", 10);
		Thread.sleep(2000);
	}
	
	
	
	
	public void CookingInstructions() throws InterruptedException {
		clickOnElement(CookingInstructions, "CookingInstructions", 10);
		Thread.sleep(2000);
	}
	
	
	
	public void CookingInstructionsCheckbox() throws InterruptedException {
		clickOnElement(CookingInstructionsCheckbox, "CookingInstructionsCheckbox", 10);
		Thread.sleep(2000);
	}
	
	
	
	public void AddItemsforInstructions() throws InterruptedException {
		clickOnElement(AddItemsforInstructions, "AddItemsforInstructions", 10);
		Thread.sleep(2000);
	}
	
	
	public void QuickNotes() throws InterruptedException {
		clickOnElement(QuickNotes, "QuickNotes", 10);
		Thread.sleep(2000);
	}
	
	
	public void AddInstructions(String notes) {

		enterTextInTextbox(AddInstructions, "AddInstructions", notes, 10);

	}

	
	
	public void AddInstructionsButton() throws InterruptedException {
		clickOnElement(AddInstructionsButton, "AddInstructionsButton", 10);
		Thread.sleep(2000);
	}
	
	
	public void Verify_Instructions() throws InterruptedException {
		toastmessage(Verify_Instructions, "Note - Spicy , keep it spicy", 10);
		Thread.sleep(1000);
	}
	
	
	public void Verify_InstructionsOrderStatus() throws InterruptedException {
		toastmessage(Verify_InstructionsOrderStatus, "Spicy , keep it spicy", 10);
		Thread.sleep(5000);
	}
	
}