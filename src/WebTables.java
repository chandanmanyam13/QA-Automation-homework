
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import java.util.List;

public class WebTables {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(
                "https://the-internet.herokuapp.com/tables"
        );
    }

    @Test
    public void readWebTable() {

        List<String> rows =
                driver.findElements(
                                By.cssSelector("#table1 tbody tr")
                        )
                        .stream()
                        .map(row -> row.getText())
                        .toList();

        for (String row : rows) {
            System.out.println(row);
        }

        String tableText =
                driver.findElement(By.id("table1"))
                        .getText();

        Assert.assertTrue(
                tableText.contains("Smith")
        );
    }

    @Test
    public void verifySpecificValue() {

        String value =
                driver.findElement(
                                By.xpath(
                                        "//table[@id='table1']//tr[2]/td[3]"
                                )
                        )
                        .getText();

        System.out.println("Value: " + value);

        Assert.assertEquals(value, "jsmith@gmail.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}