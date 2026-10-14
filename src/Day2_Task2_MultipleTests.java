import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class Day2_Task2_MultipleTests {
static boolean login(String username, String password) {
    return username.equals("admin") && password.equals("admin123");
}

@Test
public void validLoginTest() {
    assertTrue(login("admin", "admin123"), "Valid login should succeed");
}

@Test
public void invalidLoginTest() {
    assertFalse(login("admin", "wrongpass"), "Invalid login should fail");
}

@Test
public void emptyFieldTest() {
    assertFalse(login("", ""), "Empty fields should fail login");
}
}