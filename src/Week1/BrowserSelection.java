package Week1;

public class BrowserSelection {
    public static void main(String[] args) {
        String browser = "chrome";

        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("Launching Chrome browser.");
                break;

            case "firefox":
                System.out.println("Launching Firefox browser.");
                break;

            case "edge":
                System.out.println("Launching Edge browser.");
                break;

            default:
                System.out.println("Unsupported browser.");
        }
    }
}
