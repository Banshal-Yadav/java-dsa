// arraylist increase the size dynamically as we add elements
// internally it has fixed size, it copies oldarray element to a new bigger size array
// increase size by 1.5x times (50%)

import java.util.*;

public class arrayList {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // syntax
        // ArrayList<Wrapper-class> (no primitive data types here eg. int)
        ArrayList<Integer> list = new ArrayList<>(10);

        // add elements
        // we can add as many elemts as we want
        list.add(44);
        list.add(276);
        list.add(8752);
        
        // other array functions
        // add
        list.contains(33); // output true if present

        // change
        list.set(0, 99); // change 0th index to 99
        
        // remove index
        list.remove(1); // remove element at index 1

        
        // input
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        // output method 01:  we can print alllist items directly
        System.err.println(list);

        // output method 02: print till given index
        for(int i = 0; i < 3; i++){
            System.out.println(list.get(i)); // syntax: list.get(i) not list[i]
        }

        System.out.println(list.size());
        sc.close();
    }
}
