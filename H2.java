package _20_Hashing;
import java.util.HashMap;
import java.util.Set;
public class H2 {
    public static void main(String[] args) {
        HashMap< String,Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        map.put("Indonesia", 20);
        map.put("Nepal", 10);   

        //iterate
        Set<String> keys = map.keySet();    
        System.out.println(keys);

        for(String key: map.keySet()){
            System.out.println("Key"+key + " " + map.get(key));
        }

        for(String key: keys){
            System.out.println("Key"+key + " " + map.get(key));
        }   



    }
}
