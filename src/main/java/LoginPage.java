import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    //toto je konstuktor , pouziva si pro inicilizace = prirazuje nejake hodnoty promenym v classe
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }


    @FindBy(xpath = "//input[@id='txt-username']")
    private WebElement userNameTextField;

    @FindBy(xpath = "//input[@id='txt-password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement loginButtonOnLoginPage;



    public LoginPage enterUserName(String userName){
        userNameTextField.click();
        userNameTextField.sendKeys(userName);
        return this;
    }

    public LoginPage enterpassword(String password){
        passwordTextField.click();
        passwordTextField.sendKeys(password);
        return this;
    }

    public AppointmentPage clickButtonOnLoginPage(){
        loginButtonOnLoginPage.click();
        return new AppointmentPage(driver);
    }

}
