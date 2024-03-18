package WebBase;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebBase {
	
	
	protected static WebDriver driver;
	
	public void createDriver(String browserName) {
		try {
			String osName = System.getProperty("os.name");
			
			if(osName.toLowerCase().contains("windows".toLowerCase())) {
				if(browserName.toLowerCase().contains("chrome".toLowerCase())) {
			        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			        
					//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
					driver = new ChromeDriver();
				} else if(browserName.toLowerCase().contains("Mozilla fire fox".toLowerCase())) {
					System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();
							
				} else {
					System.setProperty("webdriver.msedge.driver","./Drivers/msedgedriver.exe");
					driver = new EdgeDriver();
													
				}  
			
			} else {
				if(browserName.toLowerCase().contains("chrome".toLowerCase())) {
					System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver");
					driver = new ChromeDriver();
				} else if(browserName.toLowerCase().contains("Mozilla fire fox".toLowerCase())) {
					System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();
									
				}  else {
					//add safari							
				} 	
				
			}
		}
			catch (Exception e) {
			System.out.println("Unable to create driver.Probably browser is crashed");
		}
		}

public void openWebsite(String URL) {
	try {
		driver.manage().window().maximize();
		driver.get(URL);
	} catch (Exception e) {
		System.out.println("Unable to open website");
	}
}

	
	protected boolean clickOnElement(By locator, String elementName, long waitTime) {
		boolean isClicked = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver,1000);
			WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleClick.click();
			isClicked = true;
			System.out.println("Successfully clicked on : " +elementName);
		} catch (Exception e) {
			System.out.println("Unable to click on: " +elementName);
		}
		return isClicked;
	}
	
	
	protected String toastmessage(By locator, String elementName, long waitTime) {
		String eleEnterText = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver,1000);
			WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleClick.getText();
			
			System.out.println("Toast Message is verified : "+eleClick.getText());
			
			Assert.assertEquals(eleClick.getText(),elementName);
			
			
		} catch (Exception e) {
			System.out.println("Unable to see toast message" +elementName);
		}
		return eleEnterText;
	}
	
	protected boolean verifyPage(By locator, String elementName, long waitTime) {
		boolean isVerified = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver,1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			isVerified = true;
			System.out.println("Successfully verify the page");
			
		} catch (Exception e) {
			System.out.println("Unable to verify page");
		}
		return isVerified;
		
	}
	
	   protected String getText(By elementLocator) {
	        try {
	            @SuppressWarnings("deprecation")
				WebDriverWait wait = new WebDriverWait(driver, 1000); // Adjust the timeout as needed

	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
	            String text = element.getText();
	            System.out.println("Text fetched successfully from element: " + text); // Log success message
	            return text;
	        } catch (Exception e) {
	            System.out.println("Unable to get text from element: " + e.getMessage()); // Log error message along with exception details
	            // Consider rethrowing the exception or handling it differently based on your requirements
	            return null;
	        }
	    }

	
	protected WebElement enterTextInTextbox(By locator, String elementName, String text, long waitTime) {
		WebElement eleEnterText = null;
		try {
			
			WebDriverWait wait = new WebDriverWait(driver,1000);
			
			eleEnterText = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleEnterText.click();
			eleEnterText.clear();
			eleEnterText.sendKeys(text);
			System.out.println("Successfully Enter Text in : " +elementName);
		} catch (Exception e) {
			System.out.println("Unable to enter text in : " +elementName);
		}
		return eleEnterText;
	}
	
	public void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Unable to close browser");
		}
	}
	
}
