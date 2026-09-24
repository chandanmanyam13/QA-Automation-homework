import java.util.HashMap;
public class Day3_Task1_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("tester", "test@123");

        HashMap<String, String> config = new HashMap<>();
        config.put("browser", "chrome");
        config.put("environment", "QA");

        System.out.println("Credentials: " + credentials);
        System.out.println("Config: " + config);
    }
}


