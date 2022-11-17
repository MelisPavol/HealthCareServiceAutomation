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
    private WebElement tokyoCuraHealtCareCenterDropDownElement;

    @FindBy(xpath = "//option[@value='Hongkong CURA Healthcare Center']")
    private WebElement hongkongCuraHealtCareCenterDropDownElement;

    @FindBy(xpath = "//option[@value='Seoul CURA Healthcare Center']")
    private WebElement seoulCuraHealtCareCenterDropDownElement;

    @FindBy(xpath = "//label[@for='chk_hospotal_readmission']")
    private WebElement applyForHospitalReadmissionCheckBox;

    @FindBy(xpath = "//input[@id='radio_program_medicare']")
    private WebElement healtCareProgramMedicareRadioButton;

    @FindBy(xpath = "//input[@value='Medicaid']")
    private WebElement healtCareProgramMedicaidRadioButton;

    @FindBy(xpath = "//input[@value='None']")
    private WebElement healtCareProgramNoneRadioButton;

    @FindBy(xpath = "//div[@class='col-sm-12 text-center'] /h2")
    private WebElement makeAppointText;

    @FindBy(xpath = "//p[@class='lead text-danger']")
    private WebElement textLoginFailed;

    @FindBy(xpath = "//input[@id='txt_visit_date']")
    private WebElement calendar;

    @FindBy(xpath = "//td[normalize-space()='23']")
    private WebElement visitDate;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
    private WebElement nextMounthArrow;

    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")
    private WebElement prevMounthArrow;

    @FindBy(xpath = "//textarea[@id='txt_comment']")
    private WebElement commentTextField;

    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    private WebElement bookAppointmentButton;


    public AppointmentPage clickDropDown(){
        dropDownSelector.click();
        return this;
    }
    public AppointmentPage clickTokyoCuraHealtCareCenter(){
        tokyoCuraHealtCareCenterDropDownElement.click();
        return this;
    }
    public AppointmentPage clickHongkongCuraHealtCareCenter(){
        hongkongCuraHealtCareCenterDropDownElement.click();
        return this;
    }

    public AppointmentPage clickSeoulCuraHealtCareCenter(){
        seoulCuraHealtCareCenterDropDownElement.click();
        return this;
    }

    public AppointmentPage clickApplyForHospitalreadmission (){
        applyForHospitalReadmissionCheckBox.click();
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
        return textLoginFailed.getText();
    }
    public AppointmentPage clickVisitDate(){
        calendar.click();
        return this;
    }
    public AppointmentPage enterVisitDate(){
        visitDate.click();
        return this;
    }
    public AppointmentPage nextMount(){
        nextMounthArrow.click();
        return this;
    }
    public AppointmentPage prevMount(){
        prevMounthArrow.click();
        return this;
    }

    public AppointmentPage commentTextField(String comment){
        commentTextField.sendKeys(comment);
        return this;
    }

    public SummaryPage clickButtonAppointment(){
        bookAppointmentButton.click();
        return new SummaryPage(driver);
    }

}
