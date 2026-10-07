

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

class Day1_Task1_Alerts {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();

            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

            Alert confirmAlert = driver.switchTo().alert();
            confirmAlert.dismiss();

            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

            Alert promptAlert = driver.switchTo().alert();
            promptAlert.sendKeys("QA Test");
            promptAlert.accept();

            driver.quit();
        }
    }

