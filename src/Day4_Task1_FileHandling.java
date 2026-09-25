import java.io.*;
public class Day4_Task1_FileHandling
{
    public static void main(String[] args) {
        String fileName = "sample_log.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("QA Automation Log\n");
            writer.write("Test execution started.\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

