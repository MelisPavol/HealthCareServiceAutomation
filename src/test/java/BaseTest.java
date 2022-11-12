import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    void setup() {
        var link = "https://katalon-demo-cura.herokuapp.com/";
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(link);
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @AfterTest
    void closeBrowser() {
//          driver.close(); //Close webdriver!
        // driver.quit(); //Close chrome  browser
    }


}
