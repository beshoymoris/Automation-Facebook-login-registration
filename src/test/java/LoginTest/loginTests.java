package LoginTest;

import base.BaseTests;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.hamcrest.core.StringContains;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;


public class loginTests extends BaseTests {


    CSVReader reader;

    @Test
    public void testlogin() throws IOException, CsvValidationException, InterruptedException {
        //get path of csv file
        String CSV_file = System.getProperty("user.dir")+"\\src\\test\\java\\data\\UserLoginData.csv";
        reader = new CSVReader(new FileReader(CSV_file));
        String [] csvCell;
        //while loop to find last value on csv file
        while((csvCell =reader.readNext())!=null){
            String emailF = csvCell[1];
            String passF = csvCell[2];
            String testCase = "";
            switch(csvCell[0]){


                case "ValidEmailEmptyPassword":
                    facebookHomePage.clickOnFacebookLoginButton();
                    facebookloginPage.Setemailandpassword(emailF, passF);
                    org.junit.Assert.assertThat(facebookloginPage.Checkpasswordmessage(), StringContains.containsString(csvCell[3]));
                    break;

                case "ValidEmailValidPassword":
                    facebookHomePage.clickOnFacebookLoginButton();
                    facebookloginPage.Setemailandpassword(emailF, passF);
                    org.junit.Assert.assertThat(facebookAccountSettingsPage.getCurrentUrl(), StringContains.containsString(csvCell[3]));
                    facebookAccountSettingsPage.accountButtonSettings();
                    facebookAccountSettingsPage.clickOnFacebookLogoutButton();
                    break;

                case "ValidEmailInvalidPassword":
                    facebookHomePage.clickOnFacebookLoginButton();
                    facebookloginPage.Setemailandpassword(emailF, passF);
                    org.junit.Assert.assertThat(facebookloginPage.Checkpasswordmessage(), StringContains.containsString(csvCell[3]));
                    break;

                case "InValidEmailInvalidPassword":
                    facebookHomePage.clickOnFacebookLoginButton();
                    facebookloginPage.Setemailandpassword(emailF, passF);
                    org.junit.Assert.assertThat(facebookloginPage.Checkpasswordmessage(), StringContains.containsString(csvCell[3]));
                    break;

                case "EmptyEmailWithPassword":
                    facebookHomePage.clickOnFacebookLoginButton();
                    facebookloginPage.Setemailandpassword(emailF, passF);
                    org.junit.Assert.assertThat(facebookloginPage.Checkemailmessage(), StringContains.containsString(csvCell[3]));
                    break;

                case "EmptyEmailEmptyPassword":
                    facebookHomePage.clickOnFacebookLoginButton();
                    facebookloginPage.Setemailandpassword(emailF, passF);
                    org.junit.Assert.assertThat(facebookloginPage.Checkemailmessage(), StringContains.containsString(csvCell[3]));
                    break;

                    default:
                    System.out.println("Please Check Excel sheet");

            }




    }

    }
}
