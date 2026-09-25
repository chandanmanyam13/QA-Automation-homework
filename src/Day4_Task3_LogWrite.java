import java.io.*;
public class Day4_Task3_LogWrite {

    public static void main(String[] args) {
        String logFile = "execution_log.txt";
        String status = "PASSED";

        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write("Test Execution Status: " + status + "\n");
            writer.write("Timestamp: " + System.currentTimeMillis() + "\n");
            System.out.println("Execution log written.");
        } catch (IOException e) {
            System.out.println("Error writing log: " + e.getMessage());
        }
    }
}

