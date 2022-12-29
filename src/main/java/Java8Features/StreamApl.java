package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApl {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<Product>();
        product.add(new Product(1,"HP",23000f));
        product.add(new Product(2,"Dell",24000f));
        product.add(new Product(3,"Acer",24000f));
        product.add(new Product(4,"Apple",50000f));
        List<Float> productPriceList2 =product.stream().filter(p -> p.price > 23000).map(p->p.price).collect(Collectors.toList());
        System.out.println(productPriceList2);


        List<Integer> values= Arrays.asList(1,2,4,5,6,2);

        for (int i=0;i<6;i++){
            System.out.println(values.get(i));
        }
        System.out.println("******************************");

        Iterator<Integer> i = values.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("******************************");
        for (int k : values){
            System.out.println(k);
        }
    }

}
