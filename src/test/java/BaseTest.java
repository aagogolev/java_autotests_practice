import config.BaseConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    private static final BaseConfig config = ConfigFactory.create(BaseConfig.class, System.getenv());
    private static WebDriver driver;

    @BeforeMethod
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", config.chromedriver());
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(config.loginpage());
    }

    @AfterMethod
    public static void teardown() {
        driver.close();
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
