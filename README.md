# QA-Automation-homework
1. Arrays
   3 important points
   An array stores multiple values of the same data type.
   Array size is fixed after creation.
   Index starts from 0.
   Where to use

Use arrays when you know you need a fixed group of values, such as browser names, test data, employee IDs, or expected results.

How to use in coding
String[] browsers = {"Chrome", "Firefox", "Edge"};

System.out.println(browsers[0]);  // Chrome
System.out.println(browsers[2]);  // Edge

QA example:

String[] testUsers = {"admin", "manager", "customer"};

You can use this to run the same test for multiple users.

2. Array Traversal
   3 important points
   Traversal means going through each element of an array.
   Usually done with a for loop or enhanced for-each loop.
   Useful when you want to perform the same operation on every element.
   Where to use

Use traversal when executing tests for multiple test data values or checking every expected result.

How to use
String[] browsers = {"Chrome", "Firefox", "Edge"};

for (String browser : browsers) {
System.out.println(browser);
}

Output:

Chrome
Firefox
Edge

QA example:

String[] users = {"admin", "user1", "user2"};

for (String user : users) {
login(user);
}

This is useful in data-driven testing.

3. Array Search
   3 important points
   Searching means checking whether a particular value exists.
   You can use a loop or methods such as Arrays.asList().
   Usually returns a boolean or the position/index of the value.
   Where to use

Use it when checking whether expected test data, browser names, user IDs, or error messages exist.

How to use
String[] browsers = {"Chrome", "Firefox", "Edge"};

String search = "Firefox";
boolean found = false;

for (String browser : browsers) {
if (browser.equals(search)) {
found = true;
break;
}
}

System.out.println(found);

Output:

true

QA example:

String[] expectedMessages = {
"Login successful",
"Invalid password",
"User not found"
};

Search for the message returned by the application.

4. Strings
   3 important points
   String is used to store text.
   Strings are objects in Java.
   Strings have many useful methods such as length(), contains(), toUpperCase(), and substring().
   Where to use

Strings are everywhere in QA automation:

Usernames
Passwords
URLs
Error messages
API responses
Page titles
How to use
String username = "admin";

System.out.println(username.length());
System.out.println(username.toUpperCase());
System.out.println(username.contains("min"));
5. String Validation
   3 important points
   Validation checks whether a string meets an expected condition.
   Common checks include isEmpty(), contains(), startsWith(), and endsWith().
   Validation is extremely common in automated testing.
   Where to use

Use it to validate:

Page titles
Error messages
URLs
API responses
User input
How to use
String message = "Login successful";

if (message.contains("successful")) {
System.out.println("Test Passed");
} else {
System.out.println("Test Failed");
}

Another example:

String url = "https://example.com/login";

if (url.startsWith("https")) {
System.out.println("Secure URL");
}
6. String Comparison
   3 important points
   Use .equals() to compare string content.
   Use .equalsIgnoreCase() when uppercase/lowercase should not matter.
   Do not normally use == for comparing String content.
   Where to use

Very important in QA when comparing:

Expected vs actual text
API response values
User roles
Page titles
Status messages
How to use
String expected = "Login Successful";
String actual = "Login Successful";

if (expected.equals(actual)) {
System.out.println("Pass");
}

Case-insensitive:

if (expected.equalsIgnoreCase(actual)) {
System.out.println("Pass");
}
Important
expected == actual

is not the correct way to compare String content in normal Java QA code.

7. Classes and Objects
   3 important points
   A class is a blueprint.
   An object is an instance of a class.
   Classes help organize data and behavior together.
   Where to use

Almost every real Java automation framework uses classes.

For example:

class LoginPage {
String username;
String password;

    void login() {
        System.out.println("Logging in");
    }
}

Create an object:

LoginPage page = new LoginPage();

page.username = "admin";
page.password = "12345";

page.login();
QA usage

You might have:

LoginPage
HomePage
SearchPage
CheckoutPage
TestData
ApiUtils
DatabaseUtils

This is the basic foundation of Page Object Model (POM).

8. Constructors
   3 important points
   A constructor runs when an object is created.
   Constructor has the same name as the class.
   It is commonly used to initialize object data.
   Where to use

Use constructors when a test object needs initial values.

How to use
class User {
String username;
String role;

    User(String username, String role) {
        this.username = username;
        this.role = role;
    }
}

Create object:

User user1 = new User("admin", "Manager");

System.out.println(user1.username);
System.out.println(user1.role);
QA example
LoginPage loginPage = new LoginPage(driver);

Here the constructor can receive the Selenium WebDriver.

9. Inheritance
   3 important points
   Inheritance allows one class to reuse another class's properties and methods.
   Java uses extends.
   It reduces duplicate code.
   Where to use

Useful when several test classes share common functionality.

How to use
class BaseTest {

    void openBrowser() {
        System.out.println("Browser opened");
    }
}

Child class:

class LoginTest extends BaseTest {

    void loginTest() {
        System.out.println("Login test");
    }
}

Now:

LoginTest test = new LoginTest();

test.openBrowser();
test.loginTest();
QA framework example
BaseTest
↓
LoginTest
SearchTest
CheckoutTest

BaseTest can contain common setup and teardown.

10. Method Overriding
    3 important points
    A child class can provide its own implementation of a parent method.
    Method name and parameters stay the same.
    Use @Override.
    Where to use

Use it when different types of tests or pages need different behavior for the same method.

How to use
class Browser {
void start() {
System.out.println("Starting browser");
}
}

Child:

class Chrome extends Browser {

    @Override
    void start() {
        System.out.println("Starting Chrome");
    }
}

Another:

class Firefox extends Browser {

    @Override
    void start() {
        System.out.println("Starting Firefox");
    }
}

Now:

Chrome chrome = new Chrome();
chrome.start();

Firefox firefox = new Firefox();
firefox.start();
11. Polymorphism
    3 important points
    Polymorphism means one reference can represent different objects.
    It is commonly achieved through method overriding.
    It makes frameworks flexible and easier to extend.
    Where to use

Very useful when your framework supports different browsers, APIs, payment methods, environments, etc.

How to use
Browser browser;

browser = new Chrome();
browser.start();

browser = new Firefox();
browser.start();

Although the variable is:

Browser browser;

the actual behavior depends on the object:

Chrome → Chrome start
Firefox → Firefox start
QA example

You could write:

WebDriver driver;

and assign:

driver = new ChromeDriver();

or:

driver = new FirefoxDriver();

This is one of the practical examples of polymorphic behavior you'll encounter in Selenium.

12. Encapsulation
    3 important points
    Encapsulation means hiding internal data.
    Usually done using private variables.
    Access is provided through methods such as getters/setters.
    Where to use

Use it to protect test data, configuration values, user information, and object state.

How to use
class User {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

Use:

User user = new User();

user.setUsername("admin");

System.out.println(user.getUsername());

You cannot directly do:

user.username = "admin";

because username is private.

QA usage

This is common in Page Objects:

private String username;
private String password;

and controlled methods are provided for interacting with them.

13. QA Scenario Class Design

This is where all the concepts above come together.

Suppose you need to automate a login test.

Step 1 — Create a User class
class User {

    private String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

Here you are using:

Class
Object
Constructor
Encapsulation
Step 2 — Create LoginPage
class LoginPage {

    void openPage() {
        System.out.println("Opening login page");
    }

    void login(User user) {
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}

Now your page class handles login behavior.

Step 3 — Create LoginTest
class LoginTest {

    public static void main(String[] args) {

        User user = new User("admin", "Admin123");

        LoginPage loginPage = new LoginPage();

        loginPage.openPage();
        loginPage.login(user);
    }
}

The structure is:

User
├── username
└── password

LoginPage
├── openPage()
└── login()

LoginTest
└── uses User + LoginPage

This is the beginning of good object-oriented test automation design.

How all 13 concepts connect

A typical QA automation framework might look like this:

                BaseTest
                   ↑
          -------------------
          ↑        ↑        ↑
      LoginTest SearchTest ApiTest

           Page Objects
               ↓
        LoginPage
        HomePage
        SearchPage

           Test Data
               ↓
             User
             Product
             Order