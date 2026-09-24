import java.util.HashMap;
public class Day3_Task3_TestDataMap {

        public static void main(String[] args) {
            HashMap<String, String> testData = new HashMap<>();
            testData.put("browser", "Chrome");
            testData.put("url", "https://example.com/login");
            testData.put("username", "qauser01");

            for (String key : testData.keySet()) {
                System.out.println(key + " = " + testData.get(key));
            }
        }
    }
