public class Day1_Task3_ArraySearch {
    static boolean contains(String[] arr, String target) {
        for (String item : arr) {
            if (item.equalsIgnoreCase(target)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] browsers = {"Chrome", "Firefox", "Edge"};
        System.out.println("Contains 'Firefox'? " + contains(browsers, "Firefox"));
        System.out.println("Contains 'Safari'? " + contains(browsers, "Safari"));
    }
}

