import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentPage {
    private WebDriver driver;
    //toto je konstuktor , pouziva si pro inicilizace = prirazuje nejake hodnoty promenym v classe
    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }
    @FindBy(xpath = "//select[@id='combo_facility']")
    private WebElement dropDownSelector;

    @FindBy(xpath = "//option[@value='Tokyo CURA Healthcare Center']")
    private WebElement tokyoCuraHealtCareCenter;

    @FindBy(xpath = "//option[@value='Hongkong CURA Healthcare Center']")
    private WebElement hongkongCuraHealtCareCenter;

    @FindBy(xpath = "//option[@value='Seoul CURA Healthcare Center']")
    private WebElement seoulCuraHealtCareCenter;

    @FindBy(xpath = "//label[@for='chk_hospotal_readmission']")
    private WebElement applyForHospitalReadmission;

    @FindBy(xpath = "//label[@xpath='1']")
    private WebElement healtCareProgramMedicareRadioButton;

    @FindBy(xpath = "//input[@value='Medicaid']")
    private WebElement healtCareProgramMedicaidRadioButton;

    @FindBy(xpath = "//input[@value='None']")
    private WebElement healtCareProgramNoneRadioButton;

    @FindBy(xpath = "//div[@class='col-sm-12 text-center'] /h2")
    private WebElement makeAppointText;


    public void clickDropDown(){
        dropDownSelector.click();
    }
    public void clickTokyoCuraHealtCareCenter(){
        tokyoCuraHealtCareCenter.click();
    }
    public void clickHongkongCuraHealtCareCenter(){
        hongkongCuraHealtCareCenter.click();
    }

    public void clickSeoulCuraHealtCareCenter(){
        seoulCuraHealtCareCenter.click();
    }

    public void clickApplyForHospitalreadmission (){
        applyForHospitalReadmission.click();
    }
    public void clickHealtCareProgramMedicare(){
        healtCareProgramMedicareRadioButton.click();
    }
    public void clickHealtCareProgramMedicaid(){
        healtCareProgramMedicaidRadioButton.click();
    }
    public void clickHealtCareProgramNone(){
        healtCareProgramNoneRadioButton.click();
    }
    public String getTextMakeAppointment(){
        return makeAppointText.getText();
    }


}
