package Week1;

public class LoginValidation {
    public static void main(String[] args) {
        String enteredUsername = "admin";
        String enteredPassword = "Admin@123";

        String correctUsername = "admin";
        String correctPassword = "Admin@123";

        if (enteredUsername.equals(correctUsername)
                && enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
