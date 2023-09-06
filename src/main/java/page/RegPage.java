package page;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {
    public final WebDriver driver;
    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "userEmail")
    private WebElement userEmailField;

    @FindBy(id = "userNumber")
    private WebElement userNumberField;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsContainerField;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    private WebElement genderRadioField;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthInputField;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPictureField;

    @FindBy(id = "react-select-3-input")
    private WebElement stateField;

    @FindBy(id = "react-select-4-input")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")
    private WebElement hoppyField;

    @FindBy(id = "submit")
    private WebElement submitButtonField;

    public RegPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegPage sendTextFirstName(String text) {
        firstNameField.sendKeys(text);
        return this;
    }

    public RegPage sendTextLastName(String text) {
        lastNameField.sendKeys(text);
        return this;
    }

    public RegPage sendUserEmail(String text) {
        userEmailField.sendKeys(text);
        return this;
    }

    public RegPage sendUserNumber(String text) {
        userNumberField.sendKeys(text);
        return this;
    }

    public RegPage sendSubjectsContainer(String text) {
        subjectsContainerField.sendKeys(text);
        subjectsContainerField.sendKeys(Keys.ENTER);
        return this;
    }

    public RegPage sendCurrentAddress(String text) {
        currentAddressField.sendKeys(text);
        return this;
    }
    public RegPage clickGenderRadioField() {
        genderRadioField.click();
        return this;
    }

    public RegPage clickDateOfBirthInputField(String text){
        dateOfBirthInputField.sendKeys(Keys.CONTROL+"a");
        dateOfBirthInputField.sendKeys(text);
        dateOfBirthInputField.sendKeys(Keys.ENTER);
        return this;
    }

    public RegPage sendUploadPictureField(String text) {
        uploadPictureField.sendKeys(text);
        return this;
    }

    public RegPage sendStendField(String text) {
        stateField.sendKeys(text);
        stateField.sendKeys(Keys.TAB);
        return this;
    }

    public RegPage sendCityField(String text) {
        cityField.sendKeys(text);
        cityField.sendKeys(Keys.TAB);
        return this;
    }

    public RegPage clickHobbyField() {
        hoppyField.click();
        return this;
    }

    public RegPage submit(){
        submitButtonField.sendKeys(Keys.ENTER);
        return this;
    }
}