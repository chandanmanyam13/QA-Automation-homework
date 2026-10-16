import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void baseSetUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(alwaysRun = true)
    public void baseTearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

class Day4_Task3_BaseClass extends BaseTest {

    @Test
    public void testHomePageTitle() {
        driver.get("https://example.com");

        String actualTitle = driver.getTitle();

        System.out.println("Page title: " + actualTitle);

        assertEquals(
                actualTitle,
                "Example Domain",
                "Page title does not match"
        );
    }
}
