package _20_Hashing;
import java.util.*;
import java.util.HashSet;

public class Hazset {
     public static void main(String[] args) {
         HashSet<Integer>set=new HashSet<>();
         set.add(1);
         set.add(2);
         set.add(4);
         set.add(2);
         set.add(1);
         
         System.out.println(set);

         Iterator it=set.iterator();
         while(it.hasNext()){
            System.out.println(it.next());
         }

         for(int i:set){
            System.out.println(i);
         }
         
         set.remove(2);
         if(set.contains(2)){
            System.out.println("present");
         }
         System.out.println(set.size());
         set.clear();
         System.out.println(set.isEmpty());
     }
}
