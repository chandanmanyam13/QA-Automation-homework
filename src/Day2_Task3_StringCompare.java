public class Day2_Task3_StringCompare {
    public static void main(String[] args) {
        String s1 = "QA";
        String s2 = "QA";
        String s3 = new String("QA");

        System.out.println("s1 == s2 (same pool reference): " + (s1 == s2));
        System.out.println("s1 == s3 (new object, different reference): " + (s1 == s3));
        System.out.println("s1.equals(s3) (content comparison): " + s1.equals(s3));
        // == compares object references, equals() compares actual string content
    }

}
