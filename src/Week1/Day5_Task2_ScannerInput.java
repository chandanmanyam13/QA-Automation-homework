package Week1;

class Day5_Task2_ScannerInput {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }
        scanner.close();
    }
}
