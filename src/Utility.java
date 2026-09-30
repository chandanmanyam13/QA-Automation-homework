
public class Utility {
    static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    static void waitFor(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static boolean isValidEmail(String email) {
        return !isNullOrEmpty(email) && email.contains("@") && email.contains(".");
    }
}


class Day5_Task1_UtilityClass {
    public static void main(String[] args) {
        System.out.println("Is empty? " + Utility.isNullOrEmpty("  "));
        System.out.println("Valid email? " + Utility.isValidEmail("qa@test.com"));
        System.out.println("Waiting 500ms...");
        Utility.waitFor(500);
        System.out.println("Done waiting.");
    }
}
