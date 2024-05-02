package Page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import WebBase.WebBase;

public class LoginPage extends WebBase {




	private By AddButton = By.xpath("//*[@id=\"uniquiMenuId0\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/div");

	private By Variant1 = By.xpath("//*[@id=\"241a91a444894ed6ad942e26a03edb0d\"]/div[2]/div[1]/span");
	
	private By Variant2 = By.xpath("//*[@id=\"bb0d52d7550e47c5ab48ddff89f63759\"]/div[2]/div[1]/span");
	private By Variant3 = By.xpath("//*[@id=\"f88441ed475240df894e509394892811\"]/div[2]/div[1]/span");
	private By AddVariant = By.xpath("//*[@id=\"uniquiMenuId0\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div");
	private By ViewCart = By.xpath("//*[@id=\"cartFooter\"]/div");
	private By PlaceOrder = By.xpath("//*[@id=\"cartFooter\"]/div/div[2]/div/div");
	private By Invoice = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[5]/div[1]/div[1]/div[2]");
	private By Minus = By.xpath("//*[@id=\"uniquiMenuId0\"]/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/button[1]");
	private By Search = By.xpath("//*[@id=\"root\"]/div/div[6]/div[2]/img");	
	private By Searchtext = By.xpath("//*[@id=\"menu_item_search_input\"]");
	private By SearchAdd = By.xpath("//*[@id=\"root\"]/div/div[8]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div");
	private By Addon1 = By.xpath("//*[@id=\"addon\"]/div[2]/div/div[1]/div[3]/div");
	private By VariantAdd = By.xpath("//*[@id=\"root\"]/div/div[8]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div");
	private By Skip = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[3]/div[1]/div");
	private By AddMore = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[6]/div[2]/div[1]/div");
	private By LoginButton = By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div/div/div/div/div[2]/div");


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

		 Thread.sleep(5000);
	}
	
	
	public void Click_AddVariant() throws InterruptedException {

		clickOnElement(AddVariant, "AddVariant", 10);
		
		Thread.sleep(1000);
		
	}
	
	
	public void Click_ViewCart() throws InterruptedException {

		clickOnElement(ViewCart, "ViewCart", 10);
		Thread.sleep(10000);
	}
	
	
	public void Click_PlaceOrder() throws InterruptedException {

		clickOnElement(PlaceOrder, "PlaceOrder", 10);
		Thread.sleep(10000);
	}


	public void Click_Minus() throws InterruptedException {

		clickOnElement(Minus, "Minus", 10);
		Thread.sleep(1000);
	}

	
	public void Click_Search() throws InterruptedException {

		clickOnElement(Search, "Search", 10);

	}
	
	
	public void EnterSearchtext(String Searchtextvalue) {

		enterTextInTextbox(Searchtext, "Entered Searchtext", Searchtextvalue, 10);

	}

	
	
	public void Click_SearchAdd() throws InterruptedException {

		clickOnElement(SearchAdd, "SearchAdd", 10);
		Thread.sleep(1000);
	}
	
	
	
	public void Click_Addon1() throws InterruptedException {

		clickOnElement(Addon1, "Addon1", 10);

	}
	
	
	public void Click_VariantAdd() throws InterruptedException {

		clickOnElement(VariantAdd, "VariantAdd", 10);
		Thread.sleep(1000);
	}
	
	public void Click_Skip() throws InterruptedException {

		clickOnElement(Skip, "Skip", 10);
		Thread.sleep(5000);
	}
	
	
	public void Click_AddMore() throws InterruptedException {

		clickOnElement(AddMore, "AddMore", 10);
		Thread.sleep(5000);
	}
	
	
	
	public void LoginButton() throws InterruptedException {

		clickOnElement(LoginButton, "LoginButton", 10);
		Thread.sleep(5000);
	}
	
    }
