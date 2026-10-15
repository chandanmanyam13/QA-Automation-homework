import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class Day3_Task1_DataProvider {
    @DataProvider(name = "numbers")
    public Object[][] getNumbers() {
        return new Object[][]{
                {1, 1}, {2, 4}, {3, 9}, {4, 16}
        };
    }

    @Test(dataProvider = "numbers")
    public void testSquare(int input, int expected) {
        int actual = input * input;
        assertEquals(actual, expected, "Square of " + input + " should be " + expected);
    }
}
