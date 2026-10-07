

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void handleMultipleWindows() {

        driver.get(
                "https://the-internet.herokuapp.com/windows"
        );

        String parentWindow = driver.getWindowHandle();

        driver.findElement(
                By.linkText("Click Here")
        ).click();

        Set<String> windows =
                driver.getWindowHandles();

        for (String window : windows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                String title = driver.getTitle();

                System.out.println("New Window Title: " + title);

                String heading =
                        driver.findElement(By.tagName("h3"))
                                .getText();

                Assert.assertEquals(
                        heading,
                        "New Window"
                );
            }
        }

        driver.close();

        driver.switchTo().window(parentWindow);

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("/windows")
        );
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
