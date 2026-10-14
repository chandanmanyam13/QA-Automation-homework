import org.testng.annotations.Test;

public class Day2_Task3_PriorityGroups {
@Test(priority = 1, groups = "smoke")
public void loginTest() {
    System.out.println("Running loginTest (priority 1, smoke)");
}

@Test(priority = 2, groups = "regression")
public void searchTest() {
    System.out.println("Running searchTest (priority 2, regression)");
}

@Test(priority = 3, enabled = false)
public void skippedTest() {
    System.out.println("This test is disabled and will not run.");
}
}
