package RegistrationTests;

import base.BaseTests;
import org.testng.annotations.Test;

public class registrationTests extends BaseTests {


    @Test
    public void testRegistration () throws InterruptedException {

        facebookHomePage.clickOnFacebookRegistrationButton();
        facebookRegistrationPage.SeteregistrstionData();

    }
}
