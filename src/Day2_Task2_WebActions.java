import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Task2_WebActions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        // Locate username textbox
        WebElement username =
                driver.findElement(By.id("username"));

        // Enter username
        username.sendKeys("tomsmith");

        // Locate password textbox
        WebElement password =
                driver.findElement(By.id("password"));

        // Enter password
        password.sendKeys("SuperSecretPassword!");

        // Locate Login button
        WebElement loginButton =
                driver.findElement(By.cssSelector("button[type='submit']"));

        // Click Login
        loginButton.click();

        System.out.println("Username and password entered.");
        System.out.println("Login button clicked.");

        driver.quit();
    }
}