package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FacebookHomePage extends BasePage {

    private By loginButton = By.linkText("Log In");
    private By registrationtButton = By.linkText("Create New Account");

    public FacebookHomePage(WebDriver driver) {
        super(driver);


    }

    public FacebookLoginPage clickOnFacebookLoginButton ()  {
        findElement(loginButton).click();

        return new FacebookLoginPage(driver);
    }

    public FacebookRegistrationPage clickOnFacebookRegistrationButton (){

        findElement(registrationtButton).click();
        return new FacebookRegistrationPage(driver);
    }

}
