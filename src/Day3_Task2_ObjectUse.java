class Day3_Task2_ObjectUse {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John Doe";
        emp.id = 101;
        System.out.println("Employee: " + emp.name + " (ID: " + emp.id + ")");

        Browser browser = new Browser();
        browser.browserName = "Chrome";
        browser.version = "128.0";
        System.out.println("Browser: " + browser.browserName + " v" + browser.version);
    }
}
