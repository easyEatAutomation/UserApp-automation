import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class SeleniumTests {
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;

    @BeforeClass
    public static void setUp() {
        // Specify location and name of the report
        sparkReporter = new ExtentSparkReporter("extentReport.html");
        
        // Configuration to beautify report
        sparkReporter.config().setDocumentTitle("Automation Test Report");
        sparkReporter.config().setReportName("Selenium Test Report");
        sparkReporter.config().setTheme(Theme.DARK);

        // Attach reporter to extent reporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @Test
    public void exampleTest() {
        // Create test entry in the report
        ExtentTest test = extent.createTest("My First Test", "Sample description of what this test does");
        
        // Simulate test steps with log details
        test.pass("Navigated to the web page");
        test.info("This step shows usage of log(info, details)");

        // You would integrate Selenium calls here
        // For example: driver.get("http://example.com");
        
        test.pass("Entered username and password");
        test.pass("Clicked on login button");
        test.pass("Test completed");
    }

    @AfterClass
    public static void tearDown() {
        // Write test information from the started reporters to their output view
        extent.flush();
    }
}
