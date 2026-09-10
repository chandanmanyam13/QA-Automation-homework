package Week1;

public class OperatorsProgram {
    public static void main(String[] args) {
        int obtainedMarks = 75;
        int totalMarks = 100;
        int age = 25;

        double percentage =
                (double) obtainedMarks / totalMarks * 100;

        boolean ageEligible = age >= 18;
        boolean marksEligible = percentage >= 60;
        boolean loginEligible = ageEligible && marksEligible;

        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Age Eligible: " + ageEligible);
        System.out.println("Marks Eligible: " + marksEligible);
        System.out.println("Login Eligible: " + loginEligible);
    }
}