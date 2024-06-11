import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.firefoxdriver().setup();  // Эта строка автоматически загрузит правильную версию GeckoDriver
        driver = new FirefoxDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }
}