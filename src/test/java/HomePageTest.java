import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

        @Test
        @DisplayName("TC_01_Valid_SingIn")
//        @CsvSource(value = {"John Doe,ThisIsNotAPassword"})
        void test_TC_01_Valid_SingIn(){
            var loginPage = homePage.makeAppointmentButton();
            loginPage.enterUserName("John Doe");
            loginPage.enterpassword("ThisIsNotAPassword");
            loginPage.loginButtonOnLoginPage();




        }




}
