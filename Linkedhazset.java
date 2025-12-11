package _20_Hashing;
import java.util.*;
public class Linkedhazset {
    public static void main(String[] args) {
        HashSet<String>cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");

        System.out.println(cities);

        
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(5);
        ts.add(3);
        ts.add(1);
        ts.add(4);
        System.out.println(ts);

        int num[]={5,3,1,4,2,3,1,5,2};
        HashSet<Integer>set2=new HashSet<>();
        for(int i=0;i<num.length;i++){
            set2.add(num[i]);
        }
        System.out.println(set2.size());
    }
}
