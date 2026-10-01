
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Task3_BasicValidation  {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        // Expected value
        String expectedTitle = "The Internet";

        // Actual value
        String actualTitle = driver.getTitle();

        // Basic assertion logic
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS: Page title is correct");
        } else {
            System.out.println("FAIL: Page title is incorrect");
            System.out.println("Expected: " + expectedTitle);
            System.out.println("Actual: " + actualTitle);
        }

        driver.quit();
    }
}
