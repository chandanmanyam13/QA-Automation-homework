public class  Day1_Task1_ExceptionHandling {

        public static void main(String[] args) {
        // Divide by zero
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Invalid array index
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
    }
    }



