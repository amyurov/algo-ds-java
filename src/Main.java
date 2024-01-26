import Arrays.Array;
import Arrays.SimpleArray;
import Arrays.SimpleArrayNoDoubles;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int maxCapacity = 16;
        SimpleArray arr = new SimpleArrayNoDoubles(maxCapacity);
        arr.print();

        for (int i = 0; i < 10; i++) {
            arr.insert(i + 10);
        }
        arr.print();
        arr.insert(333);
        arr.print();
        arr.insert(14);
        System.out.println(arr.find(15));
        arr.delete(14);
        arr.print();
    }
}