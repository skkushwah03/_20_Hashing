package _20_Hashing;
import java.util.*;
public class Hash {
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();

        //Insert
        hm.put("India", 120);
        hm.put("US", 30);
        hm.put("China", 150);
        System.err.println(hm);

        int population=hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));//null

        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.get("Indonesia"));//false

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //iteration
        for(String key:hm.keySet()){
            System.out.println(key+" "+hm.get(key));
        }

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());

        //

    }
}
