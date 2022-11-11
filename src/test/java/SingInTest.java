import helpers.TestValues;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SingInTest extends BaseTest{

        @Test
        void test_TC_01_Valid_SingIn(){
            var loginPage = homePage.makeAppointmentButton();
            loginPage.enterUserName(TestValues.TEST_VALID_USERNAME);
            loginPage.enterpassword(TestValues.TEST_VALID_PASSWORD);
            var appointmentPage = loginPage.loginButtonOnLoginPage();

            assertEquals("Make Appointment", appointmentPage.getTextMakeAppointment());
        }

    @Test
    void test_TC_01_Valid_SingIn_2(){
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .loginButtonOnLoginPage();

        assertEquals("Make Appointment", appointmentPage.getTextMakeAppointment());
    }


}
