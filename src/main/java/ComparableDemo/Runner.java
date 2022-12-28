package ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell",16,600));
        laps.add(new Laptop("acer",12,500));
        laps.add(new Laptop("apple",16,1000));

        Comparator<Laptop> com = new Comparator<Laptop>(){

            @Override
            public int compare(Laptop l1, Laptop l2) {
                if(l1.getRam()>l2.getRam())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(laps);

        for(Laptop l :laps ){
            System.out.println(l);
        }
    }
}
