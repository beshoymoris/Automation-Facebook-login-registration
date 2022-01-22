package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage extends BasePage {


    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("loginbutton");
    private By wPswrdMssg = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]");
    private By wEmailmssg = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]");


    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }



    public void Setemailandpassword(String email,String password){
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();


    }

    public String Checkpasswordmessage(){

        String Wmessage = driver.findElement(wPswrdMssg).getText();
        return Wmessage;

    }
    public String Checkemailmessage(){

        String Wmessage = driver.findElement(wEmailmssg).getText();
        return Wmessage;

    }

}
