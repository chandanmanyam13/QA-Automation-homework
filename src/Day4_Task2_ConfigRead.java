import java.io.*;
import java.util.*;
public class Day4_Task2_ConfigRead
{
    public static void main(String[] args) {
        String configFile = "config.properties";
        try (FileWriter writer = new FileWriter(configFile)) {
            writer.write("browser=chrome\n");
            writer.write("url=https://example.com\n");
            writer.write("username=qauser\n");
        } catch (IOException e) {
            System.out.println("Error creating config: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(configFile))) {
            String line;
            HashMap<String, String> config = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    config.put(parts[0].trim(), parts[1].trim());
                }
            }
            System.out.println("Loaded config: " + config);
        } catch (IOException e) {
            System.out.println("Error reading config: " + e.getMessage());
        }
    }
}


