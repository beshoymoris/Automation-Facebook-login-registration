package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.FacebookAccountSettings;
import pages.FacebookHomePage;
import pages.FacebookLoginPage;
import pages.FacebookRegistrationPage;
import utilities.Helper;


public class BaseTests {

    private WebDriver driver;
    protected FacebookHomePage facebookHomePage;
    protected FacebookLoginPage facebookloginPage;
    protected FacebookAccountSettings facebookAccountSettingsPage;
    protected FacebookRegistrationPage facebookRegistrationPage;
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        facebookHomePage = new FacebookHomePage (driver);
        facebookloginPage = new FacebookLoginPage(driver);
        facebookAccountSettingsPage = new FacebookAccountSettings(driver);
        facebookRegistrationPage = new FacebookRegistrationPage(driver);

    }

    @AfterSuite
    public  void tearDown (){
        driver.quit();
    }

    @AfterMethod
    public void screenshotOnFailure (ITestResult result){
        if (result.getStatus() == ITestResult.FAILURE){
            System.out.println("Failed!...Tacking Screenshot");
            Helper.captureScreenshot(driver, result.getName());
        }
    }
}
