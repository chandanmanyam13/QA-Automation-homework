public class Day1_Task2_ValidationExceptions {
    static void validateInput(String input) {
        try {
            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Input cannot be empty");
            }
            int value = Integer.parseInt(input);
            System.out.println("Valid input: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input - not a number: " + input);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        validateInput("123");
        validateInput("");
        validateInput("abc");
    }

}
