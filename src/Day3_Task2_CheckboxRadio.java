import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Task2_CheckboxRadio {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(
                By.xpath("(//input[@type='checkbox'])[1]")
        );

        WebElement checkbox2 = driver.findElement(
                By.xpath("(//input[@type='checkbox'])[2]")
        );

        // Select checkbox 1 if it is not already selected
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

        // Unselect checkbox 2 if it is already selected
        if (checkbox2.isSelected()) {
            checkbox2.click();
        }

        System.out.println("Checkbox 1 selected: " + checkbox1.isSelected());
        System.out.println("Checkbox 2 selected: " + checkbox2.isSelected());

        driver.quit();
    }
}

