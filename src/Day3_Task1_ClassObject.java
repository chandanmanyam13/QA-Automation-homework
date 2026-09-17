class Employee {
    String name;
    int id;
}

class Browser {
    String browserName;
    String version;
}

class LoginPage {
    String url;
    String title;
}

class Day3_Task1_ClassObject {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Browser browser = new Browser();
        LoginPage loginPage = new LoginPage();
        System.out.println("Classes created: Employee, Browser, LoginPage");
    }
}
