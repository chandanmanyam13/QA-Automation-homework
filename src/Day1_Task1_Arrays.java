public class Day1_Task1_Arrays {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        String[] browsers = {"Chrome", "Firefox", "Edge", "Safari"};

        System.out.println("Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        System.out.println("Browsers:");
        for (String browser : browsers) {
            System.out.println(browser);
        }
    }
}
