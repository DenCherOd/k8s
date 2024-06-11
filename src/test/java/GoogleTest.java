import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

    private WebDriver driver;

    @BeforeTest
    private void beforeTest() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    private void testGoogleSearch() {
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        GoogleTest googleTest = new GoogleTest();
        googleTest.beforeTest();
        googleTest.testGoogleSearch();
    }
}