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

    @Test
    void test_TC_2_Invalid_Sing_in(){
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_INVALID_USERNAME)
                .enterpassword(TestValues.TEST_INVALID_PASSWORD)
                .loginButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }

    @Test
    void test_TC_3_Valid_Sing_in_from_hamburger_menu(){
            var appointmentPage = homePage
                    .hamburgerMenu()
                    .loginFromHamburgerMenu()
                    .enterUserName(TestValues.TEST_VALID_USERNAME)
                    .enterpassword(TestValues.TEST_VALID_PASSWORD)
                    .loginButtonOnLoginPage();

        assertEquals("Make Appointment", appointmentPage.getTextMakeAppointment());
    }

    @Test
    void test_TC_4_Invalid_username(){
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_INVALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .loginButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }

    @Test
    void test_TC_5_Invalid_password(){
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_INVALID_PASSWORD)
                .loginButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }

    @Test
    void test_TC_6_Invalid_test_Empty_textfield_username() {
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_INVALID_USERNAME_EMPTY)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .loginButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }
    @Test
    void test_TC_7_Invalid_test_Empty_textfield_password(){
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_INVALID_PASSWORD_EMPTY)
                .loginButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }


}
