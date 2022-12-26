package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Sanjay");
        a.add("krishna");
        a.add("vamsi");
        //Sorting the list
        Collections.sort(a);
        //Traversing list through the for-each loop
        for(String names:a)
            System.out.println(names);
        System.out.println(a);
        //Traversing list through for-each loop
        for (String names : a)
            System.out.println(names);
        System.out.println("***************");

        //Traversing list through Iterator
        Iterator itr = a.iterator();//getting the Iterator
        while (itr.hasNext()) {//check if iterator has the elements
            System.out.println(itr.next());

        }
    }
}