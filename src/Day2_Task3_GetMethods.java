
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task3_GetMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        // Locate username textbox
        WebElement username =
                driver.findElement(By.id("username"));

        // Get attribute value
        String usernameType =
                username.getAttribute("type");

        System.out.println("Username type: " + usernameType);

        // Locate login button
        WebElement loginButton =
                driver.findElement(By.cssSelector("button[type='submit']"));

        // Get button text
        String buttonText =
                loginButton.getText();

        System.out.println("Button text: " + buttonText);

        // Verify values
        if (usernameType.equals("text")) {
            System.out.println("Username type verification PASSED");
        } else {
            System.out.println("Username type verification FAILED");
        }

        if (buttonText.equals("Login")) {
            System.out.println("Button text verification PASSED");
        } else {
            System.out.println("Button text verification FAILED");
        }

        driver.quit();
    }
}