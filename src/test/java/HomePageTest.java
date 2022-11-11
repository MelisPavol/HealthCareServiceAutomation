import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageTest extends BaseTest{

        @Test
        void test_TC_01_Valid_SingIn(){
            var loginPage = homePage.makeAppointmentButton();
            loginPage.enterUserName("John Doe");
            loginPage.enterpassword("ThisIsNotAPassword");
            var appointmentPage = loginPage.loginButtonOnLoginPage();

            assertEquals("Make Appointment", appointmentPage.getTextMakeAppointment());
        }


}
