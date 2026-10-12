import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day5_MiniProject1 {

    static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            File source = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            Path folder = Paths.get("screenshots");
            Files.createDirectories(folder);

            Files.copy(
                    source.toPath(),
                    folder.resolve(fileName + ".png"),
                    StandardCopyOption.REPLACE_EXISTING
            );

            System.out.println("Screenshot saved: " + fileName + ".png");

        } catch (IOException | RuntimeException e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");

            WebDriverWait wait =
                    new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement username = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("username")
                    )
            );

            username.sendKeys("tomsmith");
            driver.findElement(By.id("password"))
                    .sendKeys("SuperSecretPassword!");

            takeScreenshot(driver, "login_form_filled");

            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.cssSelector("button[type='submit']")
                    )
            ).click();

            wait.until(ExpectedConditions.urlContains("/secure"));

            WebElement successMessage = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("flash")
                    )
            );

            String actual = successMessage.getText();
            String expected = "You logged into a secure area!";

            takeScreenshot(driver, "login_result");

            if (!actual.contains(expected)) {
                throw new AssertionError(
                        "FAIL: Unexpected login message: " + actual
                );
            }

            System.out.println("PASS: Login successful");

        } catch (RuntimeException | AssertionError e) {
            takeScreenshot(driver, "login_failure");
            throw e;

        } finally {
            driver.quit();
        }
    }
}
