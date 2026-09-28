import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class W4_Day1_Test {
    public static void main(String[] args) {
        // Collections
        java.util.List<String> browsers = java.util.Arrays.asList("Chrome", "Firefox");
        System.out.println("Browsers: " + browsers);

        // Exception handling
        try {
            int x = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // File handling
        try (java.io.FileWriter fw = new java.io.FileWriter("test_output.txt")) {
            fw.write("Weekly Test 4 output");
            System.out.println("File written.");
        } catch (java.io.IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

