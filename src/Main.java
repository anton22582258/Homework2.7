import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Задача №1

        System.out.println(" Задача №1 ");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }


        // Задача №2

        System.out.println(" Задача №2 ");

        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new HashSet<>(nums1);
        for (Integer num1 : set) {
            if (num1 % 2 == 0) {
                System.out.println(num1);

            }
        }

        // Задача №3

        System.out.println(" Задача №3 ");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> set1 = new HashSet<>(strings);
        System.out.println(set1);

        // Задача №4

        System.out.println(" Задача №4 ");

        List<String> strings1 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string1 : strings1) {
            if (map.containsKey(string1)) {
                Integer volume = map.get(string1);
                map.put(string1, volume + 1);
            } else {
                map.put(string1, 1);
            }
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}



