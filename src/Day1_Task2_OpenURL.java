import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Task2_OpenURL {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        System.out.println("Page title: " + driver.getTitle());
        driver.quit();
    }
}


