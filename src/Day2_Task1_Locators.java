import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day2_Task1_Locators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        // 1. ID
        WebElement byId = driver.findElement(By.id("username"));

        // 2. Name
        WebElement byName = driver.findElement(By.name("password"));

        // 3. Class Name
        WebElement byClass = driver.findElement(By.className("radius"));

        // 4. XPath
        WebElement byXpath =
                driver.findElement(By.xpath("//button[@type='submit']"));

        // 5. CSS Selector
        WebElement byCss =
                driver.findElement(By.cssSelector("#username"));

        System.out.println("Located elements using:");
        System.out.println("ID");
        System.out.println("Name");
        System.out.println("Class Name");
        System.out.println("XPath");
        System.out.println("CSS Selector");

        driver.quit();
    }
}
