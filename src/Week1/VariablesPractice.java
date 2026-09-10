package Week1;

public class VariablesPractice {
    public static void main(String[] args) {
        int testCases = 20;
        double passPercentage = 95.5;
        char testGrade = 'A';
        boolean testPassed = true;
        String testerName = "John";

        System.out.println("Tester Name: " + testerName);
        System.out.println("Number of Test Cases: " + testCases);
        System.out.println("Pass Percentage: " + passPercentage);
        System.out.println("Grade: " + testGrade);
        System.out.println("Test Passed: " + testPassed);

        testCases = 25;
        System.out.println("Updated Test Cases: " + testCases);
    }
}