1. isNullOrEmpty(String str)
   java
   public static boolean isNullOrEmpty(String str) {
   return str == null || str.trim().isEmpty();
   }
   Use code with caution.
   • Purpose: Safely verifies whether test data, UI text, or API response values are present and usable.
   • Why str == null comes first: Java uses short-circuit evaluation (||). If str is null, Java returns true immediately and never calls .trim(), preventing a NullPointerException.
   • Why .trim().isEmpty(): If a field contains only spaces (e.g., "   "), raw .isEmpty() would evaluate to false. Trimming ensures purely blank input is treated as empty.
2. waitFor(long millis)
   java
   public static void waitFor(long millis) {
   if (millis <= 0) {
   return;
   }
   try {
   Thread.sleep(millis);
   } catch (InterruptedException e) {
   Thread.currentThread().interrupt();
   }
   }
   Use code with caution.
   • Purpose: Pauses execution for a set duration without forcing test classes to handle InterruptedException repeatedly.
   • Guard clause (millis <= 0): Avoids unnecessary calls to Thread.sleep() if zero or negative time is passed.
   • Preserving interrupt status: When InterruptedException is caught, Java clears the thread's interrupt flag. Calling Thread.currentThread().interrupt() restores that flag so upper-level test runners (like Surefire or test orchestrators) know the thread was interrupted and can shut down cleanly.
3. isValidEmail(String email)
   java
   private static final Pattern EMAIL_PATTERN = Pattern.compile(
   "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
   );

public static boolean isValidEmail(String email) {
if (isNullOrEmpty(email)) {
return false;
}
return EMAIL_PATTERN.matcher(email.trim()).matches();
}
Use code with caution.
• Purpose: Validates input strings in UI form tests, registration workflows, or API payloads.
• Pre-compiled Pattern: Compiling regex is computationally expensive. Declaring it as a private static final constant ensures it compiles once at class load time rather than on every method invocation.
• Regex breakdown:
• ^[A-Za-z0-9+_.-]+: Starts with valid username characters (letters, numbers, and common symbols like +, _, ., -).
• @: Requires exactly one @ symbol.
• [A-Za-z0-9.-]+: Domain name allowing letters, digits, dots, and hyphens.
• \\.[A-Za-z]{2,}$: Requires a dot followed by a top-level domain of at least 2 characters (e.g., .com, .org, .io).
• Reusing isNullOrEmpty(): Reuses the first helper method to reject null or empty values immediately before regex evaluation.
4. Class Design Choices
   • public final class Utility: Marking the class final prevents unnecessary subclassing.
   • private Utility() constructor: Prevents developers from accidentally using new Utility(), since helper methods are all static.
