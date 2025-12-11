package _20_Hashing;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class Linkgashp {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        System.out.println(map);

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");
        map2.put(4, "Four");
        System.out.println(map2);
    }
}
