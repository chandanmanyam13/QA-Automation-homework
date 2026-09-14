package Week1;
   class Day3_Task2_WhileLoop {
    public static void main(String[] args) {
        // Repeated login attempts
        int maxAttempts = 3;
        int attempt = 1;
        String correctPassword = "qa123";
        String[] attemptedPasswords = {"wrong1", "wrong2", "qa123"};

        while (attempt <= maxAttempts) {
            String entered = attemptedPasswords[attempt - 1];
            System.out.println("Attempt " + attempt + ": entered '" + entered + "'");
            if (entered.equals(correctPassword)) {
                System.out.println("Login successful on attempt " + attempt);
                break;
            }
            attempt++;
        }
        if (attempt > maxAttempts) {
            System.out.println("Account locked - too many failed attempts");
        }

        // Counter-based execution
        int counter = 0;
        while (counter < 5) {
            System.out.println("Executing task " + (counter + 1));
            counter++;
        }
    }
}

