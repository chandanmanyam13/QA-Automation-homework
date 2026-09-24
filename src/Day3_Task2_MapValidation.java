import java.util.HashMap;
 public class Day3_Task2_MapValidation {
         public static void main (String[]args){
             HashMap<String, String> credentials = new HashMap<>();
             credentials.put("admin", "admin123");

             String userToCheck = "admin";
             if (credentials.containsKey(userToCheck)) {
                 System.out.println("Password for " + userToCheck + ": " + credentials.get(userToCheck));
             } else {
                 System.out.println("Error: user '" + userToCheck + "' not found");
             }

             String missingUser = "guest";
             if (credentials.containsKey(missingUser)) {
                 System.out.println("Password for " + missingUser + ": " + credentials.get(missingUser));
             } else {
                 System.out.println("Error: user '" + missingUser + "' not found");
             }
         }

     }
