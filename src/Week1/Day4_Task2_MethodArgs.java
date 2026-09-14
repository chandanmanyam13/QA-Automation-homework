package week1;
class Day4_Task2_MethodArgs {
    static void validateUser(String username, String password) {
        if (username.length() >= 5 && password.length() >= 8) {
            System.out.println("User details are valid.");
        } else {
            System.out.println("User details are invalid.");
        }
    }

    static void printBrowserInfo(String browserName) {
        System.out.println("Selected browser: " + browserName);
    }

    static int calculateScore(int correctAnswers, int totalQuestions) {
        return (int) (((double) correctAnswers / totalQuestions) * 100);
    }

    public static void main(String[] args) {
        validateUser("qauser", "password123");
        printBrowserInfo("Firefox");
        System.out.println("Score: " + calculateScore(18, 20) + "%");
    }
}
