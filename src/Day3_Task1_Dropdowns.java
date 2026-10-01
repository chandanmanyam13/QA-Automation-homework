import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Task1_Dropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Testing a standard dropdown
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement basicDropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(basicDropdown);
        select.selectByVisibleText("Option 2");



        driver.quit();
    }
}

