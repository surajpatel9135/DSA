package CollectionFrameworks.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        // this is for collection size() method
        System.out.println(c.size());
        // output : 5

        // checks collection is Empty using isEmpty() method
        System.out.println(c.isEmpty());
        // output : false

        // checks an element is present in this collection or not
        System.out.println(c.contains(2)); 
        // true

        // converts collection in the form of array using toArray() method
        // there is two ways:
        // first way
        Object[] obj = c.toArray();
        for (Object o : obj) {
            System.out.println(o);
        }
        // print : 1 2 3 4 5

        // second way
        Integer[] arr = c.toArray(new Integer[0]);
        for (Integer i : arr) {
            System.out.println(i);
        }
        // Print : 1 2 3 4 5

        // boolean add(E e) this method use to add element in the collection
        System.out.println(c.add(6));
        // true

        // remove() method use for remove an element from collection
        System.out.println(c.remove(4));
        // true

        // addAll method use for adding more elements in the collection
        c.addAll(List.of(7, 8, 9));
        System.out.println(c);
        // [1, 2, 3, 5, 6, 7, 8, 9]

        // containsAll() method use to check the elements are present in the collection or not
        System.out.println(c.containsAll(List.of(1, 2, 3, 4, 5)));
        // false because the element 4 are not in the collection

        System.out.println(c.containsAll(List.of(1, 2, 3, 5)));
        // true

        // removeAll() mehtod use to remove more than one element from the collection
        System.out.println(c.removeAll(List.of(2, 3, 5, 6)));
        // true and collection is: [1, 7, 8, 9]

        // retainAll () method use to retain more elements at a time 
        System.out.println(c.retainAll(List.of(1, 8, 9)));
        // true and the collection is: [1, 8, 9]

        System.out.println(c);
        
        // removeAll() method use to remove more than one element from the collection at a time
        System.out.println(c.removeAll(List.of(1, 9)));
        // true
        System.out.println(c);
        // [8]

        // clear() this method use to clear the collection
        c.clear();
        System.out.println(c);
        // []
    }
}
