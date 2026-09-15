public class Day1_Task2_ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34, 2, 67};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}

