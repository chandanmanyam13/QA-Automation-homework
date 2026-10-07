import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Task2_Frames {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");
        System.out.println("Switched to top frame.");

        driver.switchTo().frame("frame-middle");
        System.out.println("Switched to middle frame.");

        driver.switchTo().defaultContent();
        System.out.println("Switched back to default content.");

        driver.quit();
    }
}