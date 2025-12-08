package _20_Hashing;
import java.util.*;

public class Comparison_table {
    public static void main(String[] args) {
        // Sample data
        int[] keys = {5, 2, 8, 1, 10};

        // HashMap (no order)
        Map<Integer, String> hashMap = new HashMap<>();
        for (int k : keys) {
            hashMap.put(k, "Value" + k);
        }

        // LinkedHashMap (insertion order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (int k : keys) {
            linkedHashMap.put(k, "Value" + k);
        }

        // TreeMap (sorted order)
        Map<Integer, String> treeMap = new TreeMap<>();
        for (int k : keys) {
            treeMap.put(k, "Value" + k);
        }

        // Print comparison table
        System.out.println("=== Comparison of Map Implementations ===");
        System.out.println("HashMap:        " + hashMap);
        System.out.println("LinkedHashMap:  " + linkedHashMap);
        System.out.println("TreeMap:        " + treeMap);
    }
}
