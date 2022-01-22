package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookAccountSettings extends BasePage {

    private By accountButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]");
    private By logoutLink = By.xpath("//span[contains(text(),'Log Out')]");


    public FacebookAccountSettings(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrl() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountButton));
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    //need to create method to logout
    public void accountButtonSettings() {
        findElement(accountButton).click();

    }
    public void clickOnFacebookLogoutButton ()  {
        findElement(logoutLink).click();

    }

}
