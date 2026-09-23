import java.util.ArrayList;
public class Day2_Task3_ListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(45);
        scores.add(92);
        scores.add(38);

        System.out.println("All scores:");
        for (int score : scores) {
            String status = (score >= 40) ? "Pass" : "Fail";
            System.out.println(score + " -> " + status);
        }
    }
}
