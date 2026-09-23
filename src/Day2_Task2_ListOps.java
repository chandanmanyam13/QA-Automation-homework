
import java.util.ArrayList;
public class Day2_Task2_ListOps {

        public static void main(String[] args) {
            ArrayList<String> browsers = new ArrayList<>();
            browsers.add("Chrome");
            browsers.add("Firefox");
            browsers.add("Edge");

            System.out.println("Initial list: " + browsers);
            System.out.println("Size: " + browsers.size());
            System.out.println("Contains 'Firefox'? " + browsers.contains("Firefox"));
            System.out.println("Get index 0: " + browsers.get(0));

            browsers.remove("Edge");
            System.out.println("After removing Edge: " + browsers);
            System.out.println("New size: " + browsers.size());
        }
    }