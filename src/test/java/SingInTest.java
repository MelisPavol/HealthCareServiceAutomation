import helpers.TestValues;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SingInTest extends BaseTest {

    @Test
    void test_HE_002_TC_01_Valid_SingIn() {
        var loginPage = homePage.makeAppointmentButton();
        loginPage.enterUserName(TestValues.TEST_VALID_USERNAME);
        loginPage.enterpassword(TestValues.TEST_VALID_PASSWORD);
        var appointmentPage = loginPage.clickButtonOnLoginPage();

        assertEquals("Make Appointment", appointmentPage.getTextMakeAppointment());
    }

    @Test
    void test_HE_002_TC_01_Valid_SingIn_2() {
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage();

        assertEquals("Make Appointment", appointmentPage.getTextMakeAppointment());
    }

    @Test
    void test_HE_002_TC_2_Invalid_Sing_in() {
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_INVALID_USERNAME)
                .enterpassword(TestValues.TEST_INVALID_PASSWORD)
                .clickButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }

    @Test
    void test_HE_002_TC_3_Valid_Sing_in_from_hamburger_menu() {
        var textMakeAppointment = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .getTextMakeAppointment();

        assertEquals("Make Appointment", textMakeAppointment);
    }

    @Test
    void test_HE_002_TC_4_Invalid_username() {
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_INVALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }

    @Test
    void test_HE_002_TC_5_Invalid_password() {
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_INVALID_PASSWORD)
                .clickButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }

    @Test
    void test_HE_002_TC_6_Invalid_test_Empty_textfield_username() {
        var appointmentPage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_INVALID_USERNAME_EMPTY)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage();

        assertEquals("Login failed! Please ensure the username and password are valid.", appointmentPage.getTextLoginFailed());
    }

    @Test
    void test_TC_7_Invalid_test_Empty_textfield_password() {
        var errorMessage = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_INVALID_PASSWORD_EMPTY)
                .clickButtonOnLoginPage()
                .getTextLoginFailed();
//- do promennej textLower sme ulozili vysledek feunkce
////        kterou sme urobili z promennej text
        assertEquals("Login failed! Please ensure the username and password are valid.", errorMessage);
    }

    @Test
    void test_HE_003_TC_1_Valid_Login_Make_appointment_Healt_Care_Program_Mediacare_Tokyo() {
        var facilityTokyoCURAAssert = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickTokyoCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicare()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextFacilityTokyoCURA();
        assertEquals(facilityTokyoCURAAssert,"Tokyo CURA Healthcare Center");

    }
    @Test
    void test_HE_003_TC_2_Valid_Login_Make_appointment_Healt_Care_Program_Mediacare_Hongkong() {
        var facilityHongkongCURAAssert = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickHongkongCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicare()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextfacilityHongkongCURA();

        assertEquals(facilityHongkongCURAAssert,"Hongkong CURA Healthcare Center");

    }

    @Test
    void test_HE_003_TC_3_Valid_Login_Make_appointment_Healt_Care_Program_Mediacare_Seoul() {
        var facilitySeoulCURAAssert = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickSeoulCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicare()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTEXTFacilitySeoulCURA();

        assertEquals(facilitySeoulCURAAssert,"Seoul CURA Healthcare Center");

    }
    @Test
    void test_HE_003_TC_4_No_Apply_for_hospital_readmission() {
        var noApplyCheckBox = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickSeoulCuraHealtCareCenter()
                .clickHealtCareProgramMedicare()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getNoApplyCheckBox();

        assertEquals(noApplyCheckBox,"No");

    }



}
