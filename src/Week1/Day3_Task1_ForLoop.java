package Week1;
class Day3_Task1_ForLoop {
    public static void main(String[] args) {
        System.out.println("Numbers 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Even numbers 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Odd numbers 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();

        int table = 5;
        System.out.println("Multiplication table of " + table + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        System.out.println("Reverse sequence 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
