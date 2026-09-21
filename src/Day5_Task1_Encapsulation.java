class LoginData {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Day5_Task1_Encapsulation {
    public static void main(String[] args) {
        LoginData data = new LoginData();
        data.setUsername("qauser");
        data.setPassword("securePass123");

        System.out.println("Username: " + data.getUsername());
        System.out.println("Password: " + data.getPassword());
    }
}

// Day5_Task2: QA Scenario Class Design
class TestCase {
    String testCaseId;
    String description;
    String status;

    TestCase(String testCaseId, String description, String status) {
        this.testCaseId = testCaseId;
        this.description = description;
        this.status = status;
    }
}

class TestData {
    String username;
    String password;
    String environment;

    TestData(String username, String password, String environment) {
        this.username = username;
        this.password = password;
        this.environment = environment;
    }
}

class BugReport {
    String bugId;
    String severity;
    String description;

    BugReport(String bugId, String severity, String description) {
        this.bugId = bugId;
        this.severity = severity;
        this.description = description;
    }

    void printReport() {
        System.out.println("Bug " + bugId + " [" + severity + "]: " + description);
    }
}

class Day5_Task2_QAClasses {
    public static void main(String[] args) {
        TestCase tc = new TestCase("TC001", "Verify login with valid credentials", "Pass");
        System.out.println("TestCase: " + tc.testCaseId + " - " + tc.description + " -> " + tc.status);

        TestData data = new TestData("qauser", "pass123", "QA");
        System.out.println("TestData Env: " + data.environment);

        BugReport bug = new BugReport("BUG101", "High", "Login button unresponsive on Safari");
        bug.printReport();
    }
}
