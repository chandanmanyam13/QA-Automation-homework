class BrowserConfig {
    String browserName;
    String version;

    BrowserConfig(String browserName, String version) {
        this.browserName = browserName;
        this.version = version;
    }

    void printInfo() {
        System.out.println("Browser: " + browserName + ", Version: " + version);
    }
}

class Day3_Task3_Constructors {
    public static void main(String[] args) {
        BrowserConfig config = new BrowserConfig("Firefox", "130.0");
        config.printInfo();
    }
}
