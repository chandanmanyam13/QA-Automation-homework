
class Day2_Task2_StringValidation {
    static boolean isValidEmail(String email) {

        return email.contains("@");
    }

    static boolean isPasswordLengthValid(String password) {
        return password.length() >= 8;
    }

    static boolean isValidUrl(String url) {
        return url.startsWith("http://") || url.startsWith("https://");
    }

    public static void main(String[] args) {
        System.out.println("Valid email 'user@test.com'? " + isValidEmail("user@test.com"));
        System.out.println("Valid password 'abc12345'? " + isPasswordLengthValid("abc12345"));
        System.out.println("Valid URL 'https://example.com'? " + isValidUrl("https://example.com"));
        System.out.println("Valid URL 'example.com'? " + isValidUrl("example.com"));
    }
}
