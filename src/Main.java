import Arrays.Array;
import Arrays.SimpleArray;
import Arrays.SimpleArrayNoDoubles;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int maxCapacity = 16;
        SimpleArray arr = new SimpleArrayNoDoubles(maxCapacity);
        arr.print();

        arr.insert(10);
        arr.insert(15);
        arr.insert(25);
        arr.insert(11);
        arr.insert(12);
        arr.insert(20);
//        arr.insert(31);

        arr.print();
        System.out.println(arr.removeMax());
        arr.print();
    }
}