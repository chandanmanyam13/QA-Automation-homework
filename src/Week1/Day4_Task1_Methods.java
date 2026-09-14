package Week1;



class Day4_Task1_Methods {
    static int sum(int a, int b) {
        return a + b;
    }

    static boolean validateUsername(String username) {
        return username != null && username.length() >= 5;
    }

    static void printBrowserMessage() {
        System.out.println("Browser launched successfully.");
    }

    static String checkTestResult(int marks) {
        return marks >= 40 ? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(10, 20));
        System.out.println("Is 'qa_tester' valid? " + validateUsername("qa_tester"));
        printBrowserMessage();
        System.out.println("Result: " + checkTestResult(55));
    }
}