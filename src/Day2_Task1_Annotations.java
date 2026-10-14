import org.testng.annotations.*;

public class Day2_Task1_Annotations {
@BeforeClass
public void setUpClass() {
    System.out.println("BeforeClass: runs once before all tests in this class.");
}

@BeforeMethod
public void setUp() {
    System.out.println("BeforeMethod: runs before each test method.");
}

@Test
public void sampleTest1() {
    System.out.println("Running sampleTest1");
}

@Test
public void sampleTest2() {
    System.out.println("Running sampleTest2");
}

@AfterMethod
public void tearDown() {
    System.out.println("AfterMethod: runs after each test method.");
}

@AfterClass
public void tearDownClass() {
    System.out.println("AfterClass: runs once after all tests in this class.");
}
}
