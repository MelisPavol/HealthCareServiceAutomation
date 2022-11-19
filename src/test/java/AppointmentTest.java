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
                .getTEXTFacilitySeoulCURA();

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









}
