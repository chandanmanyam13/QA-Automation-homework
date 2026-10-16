import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4_Task2_ReusableTests {

    private WebDriver driver;
    private LoginPagePOM loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        loginPage = new LoginPagePOM(driver);
    }

    @Test
    public void testInvalidLogin() {
        loginPage.enterUsername("wronguser");
        loginPage.enterPassword("wrongpass");
        loginPage.clickLogin();

        String actualMessage = loginPage.getErrorMessage();

        System.out.println("Actual error message: " + actualMessage);

        Assert.assertTrue(
                actualMessage.contains("Your username is invalid!"),
                "Expected invalid username message, but received: "
                        + actualMessage
        );
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}