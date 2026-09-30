public class Day5_Task2_CodeReuse {
public static void main(String[] args) {
    // Refactored: reuse Utility class instead of duplicating validation logic
    String[] emails = {"test@qa.com", "invalid-email", ""};
    for (String email : emails) {
        System.out.println(email + " -> valid: " + Utility.isValidEmail(email));
    }
}

}
