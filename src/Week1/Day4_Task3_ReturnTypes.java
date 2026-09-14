package Week1;

class  Day4_Task3_ReturnTypes {
    static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    static int calculateAge(int birthYear, int currentYear) {
        return currentYear - birthYear;
    }

    static String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to QA Automation.";
    }

    public static void main(String[] args) {
        System.out.println("Valid email? " + isValidEmail("test@example.com"));
        System.out.println("Age: " + calculateAge(2000, 2026));
        System.out.println(getGreeting("Priya"));
    }
}

