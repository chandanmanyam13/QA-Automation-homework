import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.time.Duration;

// Day1_Task1: TestNG Setup
class Day1_Task1_TestNGSetup {

    @Test
    public void firstTestNGTest() {
        System.out.println("This is my first TestNG test.");
    }
}

// Day1_Task2: Assertions in TestNG
class Day1_Task2_Assertions {

    @Test
    public void testAddition() {
        int result = 5 + 3;
        assertEquals(result, 8, "Addition result should be 8");
    }

    @Test
    public void testLoginFlag() {
        boolean isLoggedIn = true;
        assertTrue(isLoggedIn, "User should be logged in");
    }
}