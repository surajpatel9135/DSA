package CollectionFrameworks.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // get() : this method helps us to access an element from a particular inedex.
        System.out.println(list.get(2));
        // Print : 3

        // set() : this method use to set element at particular index.
        list.set(4, 6);
        System.out.println(list);
        // list : [1, 2, 3, 4, 6]

        // addAll() this method use to add more than one elements at a particular index.
        list.addAll(0, List.of(9, 8, 7));
        System.out.println(list);
        // list: [9, 8, 7, 1, 2, 3, 4, 6]

        // remove() : this method use to remove element
        list.remove(0);
        System.out.println(list);
        // list : [8, 7, 1, 2, 3, 4, 6]

        // indexOf(): this method use to find the element's position
        System.out.println(list.indexOf(4));
        // index : 5  

        // lastIndexOf() : this method use to find last index of element
        System.out.println(list.lastIndexOf(6));
        // last idex is: 6

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 8, 7, 1, 2, 3, 4, 6
        

        // while (it.hasPrevious()) {
        //     System.out.println(it.previous());
        // }
        // 6, 4, 3, 2, 1, 7, 8


        // for index
        // while (it.hasNext()) {
        //     System.out.println(it.nextIndex());
        // }
        // 0, 1, 2, 3, 4, 5, 6

        // list.of() : this method use to create immutable list
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // this list is immutable
        // we cannot add or remove elements from in this list

        List<Integer> l2 = List.copyOf(l);
        System.out.println(l2);
        // list : [1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
