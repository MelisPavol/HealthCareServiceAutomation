import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {
    private WebDriver driver;
    //toto je konstuktor , pouziva si pro inicilizace = prirazuje nejake hodnoty promenym v classe
    public HistoryPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }
    @FindBy(xpath = "//p[ text() = 'Tokyo CURA Healthcare Center']")
    private WebElement facilityTokyoCURA;

    @FindBy(xpath = "//p[ text() = 'Hongkong CURA Healthcare Center']")
    private WebElement facilityHongkongCura;

    @FindBy(xpath = "//p[ text() = 'Seoul CURA Healthcare Center']")
    private WebElement facilitySeoulCURA;

    @FindBy(xpath = "//p[ text() ='Yes']")
    private WebElement yesApplyForRealmissionCheckBox;

    @FindBy(xpath = "//p[ text() ='No']")
    private WebElement noApplyForRealmisionCheckBox;

    @FindBy(xpath = "//p[ text() ='Medicaid']")
    private WebElement healthCareMedicaidAssert;

    @FindBy(xpath = "//p[ text() ='None']")
    private WebElement healtCareNoneAssert;

    @FindBy(xpath = "//p[ text() ='Medicare']")
    private WebElement haeltCareMedicareAssert;

    @FindBy(xpath = "//p[@id='comment']")
    private WebElement comment;

    public String getTextFacilityTokyoCURA(){
       return facilityTokyoCURA.getText();
    }

    public String getTextfacilityHongkongCURA() { return facilityHongkongCura.getText();}

    public String getTEXTFacilitySeoulCURA() { return facilitySeoulCURA.getText();}

    public String getNoApplyCheckBox(){ return noApplyForRealmisionCheckBox.getText();}

    public String getYesApplyCheckBox (){ return yesApplyForRealmissionCheckBox.getText();}

    public String getTextHaelthMedicaidCheckBox(){return healthCareMedicaidAssert.getText();}

    public String getTextHealthNoneCheckBox(){return healtCareNoneAssert.getText();}

    public String getTextHealthMadicareCheckBox(){return healthCareMedicaidAssert.getText();}

    public String getTextCommnet(){return comment.getText();}


}
