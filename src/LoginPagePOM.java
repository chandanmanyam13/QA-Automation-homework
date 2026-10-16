import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePOM {

    private final WebDriverWait wait;

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");

    private final By loginButton =
            By.cssSelector("button[type='submit']");

    private final By errorMessage = By.id("flash");

    public LoginPagePOM(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void enterUsername(String username) {
        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameField)
        );

        field.clear();
        field.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(passwordField)
        );

        field.clear();
        field.sendKeys(password);
    }

    public void clickLogin() {
        wait.until(
                ExpectedConditions.elementToBeClickable(loginButton)
        ).click();
    }

    public String getErrorMessage() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMessage)
        ).getText().trim();
    }
}