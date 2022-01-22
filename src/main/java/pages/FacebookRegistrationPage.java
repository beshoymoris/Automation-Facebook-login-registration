package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistrationPage extends BasePage {


    private WebDriver driver;

    private By registrationFrame = By.xpath("//textarea[@title=firstname]");
    private By firstnameField = By.name("firstname");
    private By lastnameField = By.name("lastname");
    private By emailMobileField = By.name("reg_email__");
    private By reemailMobileField = By.name("reg_email_confirmation__");
    private By passwordField = By.name("reg_passwd__");
    private By genderRadioButton = By.xpath("//label[contains(text(),'Male')]");
    private By signupButton = By.name("websubmit");


    public FacebookRegistrationPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }


    public void SeteregistrstionData() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(firstnameField).sendKeys("hamadaalfish");
        driver.findElement(lastnameField).sendKeys("johnblgnzbeel");
        driver.findElement(emailMobileField).sendKeys("open_vhxsoeu_user@tfbnw.net");
        driver.findElement(reemailMobileField).sendKeys("open_vhxsoeu_user@tfbnw.net");
        driver.findElement(passwordField).sendKeys("facebookpassword");
        Select dayDateField = new Select(driver.findElement(By.id("day")));
        dayDateField.selectByVisibleText("8");
        Select monthDateField = new Select(driver.findElement(By.id("month")));
        monthDateField.selectByVisibleText("Mar");
        Select yearDateField = new Select(driver.findElement(By.id("year")));
        yearDateField.selectByVisibleText("1995");
        driver.findElement(genderRadioButton).click();
        driver.findElement(signupButton).click();
        Thread.sleep(100000);

//cowelltaylor@gers-phyto.com
//        cowelltaylor@gers-phyto.com
//        vulkan1@manac.site
//        prasanta@codif.site
//        rdmah1@zipzx.site
//        lf73mike@wap-facebook.ml
//        inna210588@dreamyshop.club
//        blancawwymoure@eetieg.com
//        cot1983@prass.me
//        nuneton@paiucil.com
//        gostborisovna@hungtaoteile.com
       // https://emailfake.com/blog/fake-email-generator-for-facebook



    }
}
