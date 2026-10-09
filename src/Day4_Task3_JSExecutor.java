import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Day4_Task3_JSExecutor {
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://example.com/form");
    JavascriptExecutor js = (JavascriptExecutor) driver;

    WebElement hiddenButton = driver.findElement(By.id("submitBtn"));
    js.executeScript("arguments[0].click();", hiddenButton);
    System.out.println("Clicked element using JavaScript.");

    WebElement inputField = driver.findElement(By.id("comments"));
    js.executeScript("arguments[0].value=arguments[1];", inputField, "Automated via JS");
    System.out.println("Set value using JavaScript.");

    driver.quit();
}
}

