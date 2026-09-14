package Week1;

class Day5_Task1_Validations {
    static boolean isPasswordLengthValid(String password) {
        return password.length() >= 8;
    }

    static boolean isAgeEligible(int age) {
        return age >= 18;
    }

    static String getResultStatus(int marks) {
        return marks >= 40 ? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        System.out.println("Password 'abc123' valid length? " + isPasswordLengthValid("abc123"));
        System.out.println("Password 'abcdefgh' valid length? " + isPasswordLengthValid("abcdefgh"));
        System.out.println("Age 16 eligible? " + isAgeEligible(16));
        System.out.println("Marks 30 result: " + getResultStatus(30));
    }
}

