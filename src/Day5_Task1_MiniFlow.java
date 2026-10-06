import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day5_Task1_MiniFlow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            driver.findElement(By.id("user-name"))
                    .sendKeys("standard_user");

            driver.findElement(By.id("password"))
                    .sendKeys("secret_sauce");

            driver.findElement(By.id("login-button"))
                    .click();

            WebDriverWait wait =
                    new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement products = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.className("title")
                    )
            );

            String actual = products.getText();

            if (actual.equals("Products")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } finally {
            driver.quit();
        }
    }
}
class SeleniumBase {
static WebDriver setUp() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    return driver;
}

static void tearDown(WebDriver driver) {
    if (driver != null) driver.quit();
}
}

class Day5_Task2_Refactor {
    public static void main(String[] args) {
        WebDriver driver = SeleniumBase.setUp();
        driver.get("https://example.com");
        System.out.println("Title: " + driver.getTitle());
        SeleniumBase.tearDown(driver);
    }
}