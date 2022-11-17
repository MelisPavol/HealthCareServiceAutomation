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

    @FindBy(xpath = "//input[@id='radio_program_medicare']")
    private WebElement healtCareProgramMedicareRadioButton;

    @FindBy(xpath = "//input[@value='Medicaid']")
    private WebElement healtCareProgramMedicaidRadioButton;

    @FindBy(xpath = "//input[@value='None']")
    private WebElement healtCareProgramNoneRadioButton;

    @FindBy(xpath = "//div[@class='col-sm-12 text-center'] /h2")
    private WebElement makeAppointText;

    @FindBy(xpath = "//p[@class='lead text-danger']")
    private WebElement getTextLoginFailed;

    @FindBy(xpath = "//input[@id='txt_visit_date']")
    private WebElement clickVisitDate;

    @FindBy(xpath = "//td[normalize-space()='23']")
    private WebElement enterVisitDate;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
    private WebElement nextMounth;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")
    private WebElement prevMounth;

    @FindBy(xpath = "//textarea[@id='txt_comment']")
    private WebElement clickCommentTextField;

    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    private WebElement clickBookAppointment;


    public AppointmentPage clickDropDown(){
        dropDownSelector.click();
        return this;
    }
    public AppointmentPage clickTokyoCuraHealtCareCenter(){
        tokyoCuraHealtCareCenter.click();
        return this;
    }
    public AppointmentPage clickHongkongCuraHealtCareCenter(){
        hongkongCuraHealtCareCenter.click();
        return this;
    }

    public AppointmentPage clickSeoulCuraHealtCareCenter(){
        seoulCuraHealtCareCenter.click();
        return this;
    }

    public AppointmentPage clickApplyForHospitalreadmission (){
        applyForHospitalReadmission.click();
        return this;
    }
    public AppointmentPage clickHealtCareProgramMedicare(){
        healtCareProgramMedicareRadioButton.click();
        return this;
    }
    public AppointmentPage clickHealtCareProgramMedicaid(){
        healtCareProgramMedicaidRadioButton.click();
        return this;
    }
    public AppointmentPage clickHealtCareProgramNone(){
        healtCareProgramNoneRadioButton.click();
        return this;
    }
    public String getTextMakeAppointment(){
        return makeAppointText.getText();
    }
    public String getTextLoginFailed(){
        return getTextLoginFailed.getText();
    }
    public AppointmentPage clickVisitDate(){
        clickVisitDate.click();
        return this;
    }
    public AppointmentPage enterVisitDate(){
        enterVisitDate.click();
        return this;
    }
    public AppointmentPage nextMount(){
        nextMounth.click();
        return this;
    }
    public AppointmentPage prevMount(){
        prevMounth.click();
        return this;
    }

    public AppointmentPage clickCommentTF(String comment){
        //clickCommentTextField.click();
        clickCommentTextField.sendKeys(comment);
       return this;
    }

    public SummaryPage clickButtonAppointment(){
        clickBookAppointment.click();
        return new SummaryPage(driver);
    }

}
