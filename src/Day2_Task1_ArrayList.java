import java.util.ArrayList;
public class Day2_Task1_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        ArrayList<String> urls = new ArrayList<>();
        urls.add("https://example.com");
        urls.add("https://test.com");

        ArrayList<String> roles = new ArrayList<>();
        roles.add("Admin");
        roles.add("Tester");

        System.out.println("Browsers: " + browsers);
        System.out.println("URLs: " + urls);
        System.out.println("Roles: " + roles);
    }
}

