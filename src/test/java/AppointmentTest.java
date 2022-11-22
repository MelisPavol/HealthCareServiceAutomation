import helpers.TestValues;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AppointmentTest extends BaseTest{

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
    void test_HE_003_TC_3_Valid_Login_Make_appointment_all_filled_out_Seoul() {
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
                .getTexTFacilitySeoulCURA();

        assertEquals(facilitySeoulCURAAssert,"Seoul CURA Healthcare Center");

    }
    @Test
    void test_HE003_TC_4_No_Apply_for_hospital_readmission() {
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
    @Test
    void test_HE_003_TC_5_Valid_Healthcare_Program_Medicaid() {
        var getTextHealthMedicaidAssert = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickTokyoCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicaid()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextHaelthMedicaidCheckBox();
        assertEquals(getTextHealthMedicaidAssert,"Medicaid");

    }
    @Test
    void test_HE_003_TC_6_TC_6_Valid_Healthcare_Program_None() {
        var getTextHealthNoneAssert = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickTokyoCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramNone()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextHealthNoneCheckBox();
        assertEquals(getTextHealthNoneAssert,"None");

    }
    @Test
    void test_HE_003_TC_7_Valid_Login_dont_write_comment_Hongkong() {
        var getTextComment = homePage
                .makeAppointmentButton()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickHongkongCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramNone()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextCommnet();
        System.out.println("tisk"+ getTextComment);

        assertEquals(getTextComment,"");

    }
    @Test
    void test_HE_003_TC_8_Valid_Login_From_Hamburger_Medicaid_Tokyo() {
        var getTextFacilityTokyoCURA = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickTokyoCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicaid()
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
        assertEquals(getTextFacilityTokyoCURA,"Tokyo CURA Healthcare Center");
    }

    @Test
    void test_HE_003_TC_9_Valid_Login_From_Hamburger_Menu_all_filled_out_Hongkong() {
        var getTextfacilityHongkongCURA = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickHongkongCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicaid()
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
        assertEquals(getTextfacilityHongkongCURA,"Hongkong CURA Healthcare Center");
    }

    @Test
    void test_HE_003_TC_10_Valid_Login_From_Hamburger_Menu_all_filled_out_Seoul() {
        var getTexTFacilitySeoulCURA = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickSeoulCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicaid()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTexTFacilitySeoulCURA();
        assertEquals(getTexTFacilitySeoulCURA,"Seoul CURA Healthcare Center");
    }
    @Test
    void test_HE_003_TC_11_Valid_Login_From_Hamburger_No_Apply_for_hospital_readmission() {
        var noApplyCheckBox = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickSeoulCuraHealtCareCenter()
                .clickHealtCareProgramMedicaid()
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
    @Test
    void test_HE_003_TC_12_Valid_Login_From_Hamburger_Menu_Medial_Care_MediaCare() {
        var getTextHealthMadicareCheckBox = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
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
                .getTextHealthMadicareCheckBox();
        assertEquals(getTextHealthMadicareCheckBox,"Medicare");
    }
    @Test
    void test_HE_003_TC_13_Valid_Login_From_Hamburger_Menu_Medial_Care_Medicaid() {
        var TextHaelthMedicaidCheckBox = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickSeoulCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicaid()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextHaelthMedicaidCheckBox();
        assertEquals(TextHaelthMedicaidCheckBox,"Medicaid");
    }
    @Test
    void test_HE_003_TC_14_Valid_Login_From_Hamburger_Menu_Medial_Care_None() {
        var TextHealthNoneCheckBox = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickSeoulCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramNone()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .commentTextField(TestValues.TEST_COMMENT_TEXTFIELD)
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextHealthNoneCheckBox();
        assertEquals(TextHealthNoneCheckBox,"None");
    }
    @Test
    void test_HE_003_TC_15_Valid_Login_From_Hamburger_Menu_dont_write_comment() {
        var TextComment = homePage
                .hamburgerMenu()
                .loginFromHamburgerMenu()
                .enterUserName(TestValues.TEST_VALID_USERNAME)
                .enterpassword(TestValues.TEST_VALID_PASSWORD)
                .clickButtonOnLoginPage()
                .clickSeoulCuraHealtCareCenter()
                .clickApplyForHospitalreadmission()
                .clickHealtCareProgramMedicaid()
                .clickVisitDate()
                .nextMount()
                .nextMount()
                .nextMount()
                .enterVisitDate()
                .clickButtonAppointment()
                .clickHamburgerMenuSummaryPage()
                .historyButton()
                .getTextCommnet();
        System.out.println("tisk"+ TextComment);

        assertEquals(TextComment,"");
    }

}
