import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day4_Task1_Waits {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dynamicElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("dynamicContent"))
        );

        System.out.println("Dynamic element handled with implicit and explicit waits.");
        driver.quit();
    }
}

// Day4_Task2: Navigation Commands
class Day4_Task2_Navigation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.get("https://example.com/page2");

        driver.navigate().back();
        System.out.println("Navigated back. Current URL: " + driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("Navigated forward. Current URL: " + driver.getCurrentUrl());

        driver.navigate().refresh();
        System.out.println("Page refreshed.");

        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.quit();
    }
}

// Day4_Task3: Browser Window Management
class Day4_Task3_WindowManage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        driver.manage().window().maximize();
        System.out.println("Window maximized.");

        driver.manage().window().minimize();
        System.out.println("Window minimized.");

        driver.close(); // closes current window
        System.out.println("Current window closed.");
        // driver.quit(); // would quit the whole browser session
    }
}

