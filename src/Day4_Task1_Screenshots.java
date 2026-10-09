
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

// Day4 Task1: Screenshot Handling
public class Day4_Task1_Screenshots {

    static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            // Create screenshots folder
            new File("screenshots").mkdirs();

            // Save screenshot
            FileHandler.copy(src,
                    new File("screenshots/" + fileName + ".png"));

            System.out.println("Screenshot saved: "
                    + fileName + ".png");

        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: "
                    + e.getMessage());
        }
    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://example.com");

            // Capture homepage screenshot
            takeScreenshot(driver, "homepage");

        } finally {
            driver.quit();
        }
    }
}

// Day4 Task2: Scroll Handling
class Day4_Task2_Scroll {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://example.com/longpage");

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            // Scroll down 500 pixels
            js.executeScript("window.scrollBy(0, 500)");

            System.out.println("Scrolled down by 500px.");

            // Find footer and scroll to it
            WebElement footer =
                    driver.findElement(By.id("footer"));

            js.executeScript(
                    "arguments[0].scrollIntoView(true);",
                    footer
            );

            System.out.println("Scrolled to footer element.");

        } catch (Exception e) {
            System.out.println("Scroll error: "
                    + e.getMessage());

        } finally {
            driver.quit();
        }
    }
}
