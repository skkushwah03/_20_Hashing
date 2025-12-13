package _20_Hashing;
import java.util.*;
public interface Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",150);//baed on key sort

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("china",150);
        hm.put("Us",50);

        System.out.println(hm);
        System.out.println(tm);
        
    }
}
