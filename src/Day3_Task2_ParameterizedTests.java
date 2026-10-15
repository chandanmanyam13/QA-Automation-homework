import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class Day3_Task2_ParameterizedTests {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"admin", "admin123", true},
                {"admin", "wrongpass", false},
                {"guest", "guest123", false}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLoginCombinations(String username, String password, boolean expectedResult) {
        boolean actualResult = username.equals("admin") && password.equals("admin123");
        assertEquals(actualResult, expectedResult,
                "Login result mismatch for " + username + "/" + password);
    }

}