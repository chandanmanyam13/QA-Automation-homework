class BaseBrowser {
void openBrowser() {
    System.out.println("Opening a generic browser...");
}

void closeBrowser() {
    System.out.println("Closing browser...");
}
}

class ChromeBrowser extends BaseBrowser {
    void openChromeSpecificFeature() {
        System.out.println("Chrome-specific feature enabled.");
    }
}

class Day4_Task1_Inheritance {
    public static void main(String[] args) {
        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();          // inherited method
        chrome.openChromeSpecificFeature();
        chrome.closeBrowser();         // inherited method
    }
}

// Day4_Task2: Method Overriding
class ParentBrowser {
    void launch() {
        System.out.println("Launching generic browser.");
    }
}

class FirefoxBrowser extends ParentBrowser {
    @Override
    void launch() {
        System.out.println("Launching Firefox browser with custom profile.");
    }
}

class Day4_Task2_Overriding {
    public static void main(String[] args) {
        ParentBrowser generic = new ParentBrowser();
        generic.launch();

        FirefoxBrowser firefox = new FirefoxBrowser();
        firefox.launch();
    }
}

// Day4_Task3: Polymorphism Introduction
class Day4_Task3_Polymorphism {
    public static void main(String[] args) {
        ParentBrowser browser1 = new ParentBrowser();
        ParentBrowser browser2 = new FirefoxBrowser(); // parent reference, child object

        browser1.launch(); // calls ParentBrowser's version
        browser2.launch(); // calls FirefoxBrowser's overridden version (runtime polymorphism)
    }
}
 