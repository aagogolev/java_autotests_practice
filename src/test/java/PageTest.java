import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page.RegPage;

public class PageTest extends BaseTest {
    private void showDriver() {
        System.out.println(getDriver());
    }

    @Test
    void test() {
        showDriver();
        new RegPage(getDriver())
                .sendTextFirstName("ivanov")
                .sendTextLastName("ivan")
                .sendUserEmail("ivanov@mail.ru")
                .sendUserNumber("1234567890")
                .sendCurrentAddress("test adres")
                .clickGenderRadioField()
                .sendSubjectsContainer("En")
                .clickDateOfBirthInputField("01/01/2013")
                .sendUploadPictureField("/home/admin/mnt/my_projects/java/autotest-example/autotests-example/img/gomer.png")
                .sendStendField("NCR")
                .sendCityField("Delhi")
                .clickHobbyField()
                .submit();
    }

}
