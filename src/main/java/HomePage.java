import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
//toto je konstuktor , pouziva si pro inicilizace = prirazuje nejake hodnoty promenym v classe
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    };

    @FindBy(xpath = "//a[@id='btn-make-appointment']")
    private WebElement makeAppointmentButton;

    @FindBy(xpath = "//i[@class='fa fa-bars']")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    private WebElement loginFromHamburgerMenu;


    public HomePage hamburgerMenu(){
        hamburgerMenu.click();
        return this;
    }

    public LoginPage makeAppointmentButton(){
        makeAppointmentButton.click();
        return new LoginPage(driver);
    }

    public LoginPage loginFromHamburgerMenu(){
        loginFromHamburgerMenu.click();
        return new LoginPage(driver);
    }


}


