

    class  Day2_Task1_Strings {
        public static void main(String[] args) {
            String text = "QA Automation Testing";

            System.out.println("Length: " + text.length());
            System.out.println("Equals 'qa automation testing'? " + text.equals("qa automation testing"));
            System.out.println("EqualsIgnoreCase? " + text.equalsIgnoreCase("qa automation testing"));
            System.out.println("Contains 'Automation'? " + text.contains("Automation"));
            System.out.println("Substring(0,2): " + text.substring(0, 2));
            System.out.println("Uppercase: " + text.toUpperCase());
            System.out.println("Lowercase: " + text.toLowerCase());
        }
    }
