import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
    private WebDriver driver;
    //toto je konstuktor , pouziva si pro inicilizace = prirazuje nejake hodnoty promenym v classe
    public SummaryPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }
    @FindBy(xpath = "//i[@class='fa fa-bars']")
    private WebElement hamburgerMenuSummaryPage;

    @FindBy(xpath = "//a[normalize-space()='History']")
    private WebElement historyButton;

    public SummaryPage clickHamburgerMenuSummaryPage(){
        hamburgerMenuSummaryPage.click();
        return this;
    }

    public HistoryPage historyButton(){
        historyButton.click();
        return new HistoryPage(driver);
    }

}
