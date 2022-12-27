package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// No dulicate are allowed in set
// It represents unordered list
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(34);
        s.add(78);
        s.add(80);
        s.add(80);
        for(int i:s){
            System.out.println(i);
        }

        //Unigue elements are allowed
        // stored values with ascending order.
        System.out.println("Using Treeset");
        Set<Integer> s1 = new TreeSet<>();
        s1.add(34);
        s1.add(78);
        s1.add(80);
        s1.add(80);
        for(int i:s1){
            System.out.println(i);
        }
    }
}
