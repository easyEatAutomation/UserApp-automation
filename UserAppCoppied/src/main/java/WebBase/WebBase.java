package WebBase;

import java.time.Duration;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebBase {

	public static WebDriver driver;
	public static String userAppWindowHandle;
	public static String posAppWindowHandle;

	protected static String userAppHandle;
	protected static String posAppHandle;
	protected static String POSWindow;
	protected static String userWindow;
	private WebDriver userDriver;
	private WebDriver posDriver;

	public static String Environment = "prod"; // Switch between Environments
	public static String currentCountry = "malaysia"; // switch between countries

	public void createDriver(String browserName) {
		try {
			String osName = System.getProperty("os.name");

			if (osName.toLowerCase().contains("windows".toLowerCase())) {
				if (browserName.toLowerCase().contains("chrome".toLowerCase())) {
// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");
//WebDriver driver = new ChromeDriver(options);
					driver = new ChromeDriver(options);

				} else if (browserName.toLowerCase().contains("Mozilla fire fox".toLowerCase())) {
					System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();

				} else {
					System.setProperty("webdriver.msedge.driver", "./Drivers/msedgedriver.exe");
					driver = new EdgeDriver();

				}

			} else {
				if (browserName.toLowerCase().contains("chrome".toLowerCase())) {
					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--remote-allow-origins=*");
//WebDriver driver = new ChromeDriver(options);
					driver = new ChromeDriver(options);

				} else if (browserName.toLowerCase().contains("Mozilla fire fox".toLowerCase())) {
					System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();

				} else {
// add safari
				}

			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Unable to create driver.Probably browser is crashed");
		}
	}

// Get URL of order service type based on the country and environment
	public static String getUserAppURL(String orderType) {
		String country = currentCountry.toLowerCase();
		String env = Environment.toLowerCase();

		switch (env) {
		case "prod":
			switch (country) {
			case "indonesia":
				switch (orderType.toLowerCase()) {
				case "dinein":
					return "https://easyeat.id/r/automation_cafe_Indonesia121/1?source=qr&tableId=a1&tableNo=1";
				case "dinein1":
					return "https://easyeat.id/r/automation_cafe_Indonesia121/1?source=qr&tableId=a2&tableNo=2";
				case "takeaway":
					return "https://easyeat.id/r/automation_cafe_Indonesia121/3/ta";
				case "pickup":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/3?page=2";
				case "delivery":
					return "https://easyeat.id/r/automation_cafe_Indonesia121/3";
				}
				break;

			case "malaysia":
				switch (orderType.toLowerCase()) {
				case "dinein":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/1?source=qr&tableId=a1&tableNo=333";
				case "dinein1":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/1?source=qr&tableId=a2&tableNo=2";
				case "takeaway":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/3/ta";
				case "pickup":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/3?page=2";
				case "delivery":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/2";
				}
				break;
			}
			break;

		case "dev":
			switch (country) {
			case "indonesia":
				switch (orderType.toLowerCase()) {
				case "dinein":
					return "https://app-dev.easyeat.id/r/automation_cafe_Indonesia121/1?source=qr&tableId=a1&tableNo=1";
				case "takeaway":
					return "https://easyeat.id/r/automation_cafe_Indonesia121/3/ta";
				case "pickup":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/3?page=2";
				case "delivery":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/2";
				}
				break;

			case "malaysia":
				switch (orderType.toLowerCase()) {
				case "dinein":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/1?source=qr&tableId=a1&tableNo=333";
				case "takeaway":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/3/ta";
				case "pickup":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/3?page=2";
				case "delivery":
					return "https://easyeat.ai/r/automation_cafe_Malaysia12/1";
				}
				break;
			}
			break;
		}

		throw new RuntimeException(
				"No URL found for environment: " + env + ", country: " + country + ", and orderType: " + orderType);
	}

// Get POS URL based on environment and country
	public static String getPOSURL() {
		String country = currentCountry.toLowerCase();
		String env = Environment.toLowerCase();

		switch (env) {
		case "prod":
			switch (country) {
			case "indonesia":
				return "https://partner.easyeat.id/login";
			case "malaysia":
			default:
				return "https://partner.easyeat.ai/login";
			}

		case "dev":
			switch (country) {
			case "indonesia":
				return "https://partner-dev.easyeat.id/login";
			case "malaysia":
			default:
				return "https://partner-dev.easyeat.ai/login";
			}

		default:
			throw new RuntimeException("Unsupported environment: " + env);
		}
	}

// Type = userapp, pos, web, etc.
	/*
	 * public void openWebsite(String order_Type) {
	 * 
	 * // Use a regular switch statement to get the correct URL based on the order
	 * type String url; switch (order_Type.toLowerCase()) { case "dinein": case
	 * "dinein1": case "takeaway": case "pickup": case "delivery": url =
	 * getUserAppURL(order_Type); // Get the user app URL userWindowHandle =
	 * driver.getWindowHandle(); break;
	 * 
	 * case "posurl": url = getPOSURL(); // Get the POS system URL
	 * 
	 * break;
	 */
	public void openWebsite(String orderType) {
		switch (orderType.toLowerCase()) {
		case "dinein":
		case "dinein1":
		case "takeaway":
		case "pickup":
		case "delivery":
//openUserApp(orderType);
			break;
		case "posurl":
//openPOSApp();
			break;
		default:
			throw new IllegalArgumentException("Unknown order type: " + orderType);
		}
	}

	public void openWebsiteWithHandlingMultipleWin(String orderType) {
		switch (orderType.toLowerCase()) {
		case "pickup":
		case "dinein":
		case "dinein1":
		case "takeaway":
		case "delivery":
			driver.get(getUserAppURL(orderType));
			userAppWindowHandle = driver.getWindowHandle();
			break;
		case "posurl":
			driver.switchTo().newWindow(WindowType.WINDOW);
			posAppWindowHandle = driver.getWindowHandle();
			driver.get(getPOSURL());
			break;
		default:
			throw new IllegalArgumentException("Unknown order type: " + orderType);
		}
	}

	/*
	 * public void verifySecswitchtoPOSAppAgain(String posurl) {
	 * switchToWindow(posurl); }
	 */

	/*
	 * private void openPOSApp() { if (posAppHandle == null) {
	 * driver.get(getPOSURL()); posAppHandle = driver.getWindowHandle();
	 * System.out.println("POS App launched."); } else {
	 * System.out.println("Pos app already open"); } }
	 * 
	 * public void switchToUserApp() { String expectedTitle = "User App Title"; //
	 * replace with actual title or part of it for (String handle :
	 * driver.getWindowHandles()) { driver.switchTo().window(handle); if
	 * (driver.getTitle().contains(expectedTitle)) {
	 * System.out.println("Switched to User App"); } }
	 * System.out.println("User App window not found."); }
	 * 
	 * public void switchToPOSApp() { String expectedTitle = "POS App Title"; //
	 * replace with actual title or part of it for (String handle :
	 * driver.getWindowHandles()) { driver.switchTo().window(handle); if
	 * (driver.getTitle().contains(expectedTitle)) {
	 * System.out.println("Switched to POS App"); } }
	 * System.out.println("POS App window not found."); } public WebDriver
	 * getDriver() { return driver; }
	 */

	/*
	 * public void closeAll() { if (driver != null) { driver.quit(); } }
	 */

	/*
	 * public void openWebsite() { initializeSystemProperties(); String
	 * applicationUrl = System.getProperty("url"); try {
	 * driver.manage().window().maximize(); driver.get(applicationUrl); } catch
	 * (Exception e) { System.out.println("Unable to open website"); } }
	 */

	/*
	 * public void openWebsite(String URL) { try {
	 * driver.manage().window().maximize(); driver.get(URL); } catch (Exception e) {
	 * System.out.println("Unable to open website"); } }
	 */

	protected void moveSlider(By sliderLocator, int xOffset, int yOffset) {
		try {
//WebDriverWait wait = new WebDriverWait(driver, 10);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(sliderLocator));
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider, xOffset, yOffset).perform();
			System.out.println("Slider moved successfully");
		} catch (Exception e) {
			System.out.println("Unable to move slider");
		}
	}

	protected boolean clickOnElement(By locator, String elementName, long waitTime) {
		boolean isClicked = false;
		try {
//WebDriverWait wait = new WebDriverWait(driver, 10);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleClick.click();
			isClicked = true;
			System.out.println("Successfully clicked on : " + elementName);
		} catch (Exception e) {
			System.out.println("Unable to click on: " + elementName);
		}
		return isClicked;
	}

	protected String toastmessage(By locator, String elementName, long waitTime) {
		String eleEnterText = null;
		try {
//WebDriverWait wait = new WebDriverWait(driver, 10);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleClick.getText();

			System.out.println("Toast Message is verified : " + eleClick.getText());

			Assert.assertEquals(eleClick.getText(), elementName);

		} catch (Exception e) {
			System.out.println("Unable to see toast message" + elementName);
		}
		return eleEnterText;
	}

	protected boolean verifyPage(By locator, String elementName, long waitTime) {
		boolean isVerified = false;
		try {
//WebDriverWait wait = new WebDriverWait(driver, 10);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
//WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
			String text = element.getText();
			System.out.println("Text fetched successfully from element: " + text); // Log success message
			return text;
		} catch (Exception e) {
			System.out.println("Unable to get text from element: " + e.getMessage()); // Log error message along with
// exception details
// Consider rethrowing the exception or handling it differently based on your
// requirements
			return null;
		}
	}

	protected WebElement enterTextInTextbox(By locator, String elementName, String text, long waitTime) {
		WebElement eleEnterText = null;
		try {

//WebDriverWait wait = new WebDriverWait(driver, 10);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			eleEnterText = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleEnterText.click();
			eleEnterText.clear();
			eleEnterText.sendKeys(text);
			System.out.println("Successfully Enter Text in : " + elementName);
		} catch (Exception e) {
			System.out.println("Unable to enter text in : " + elementName);
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
