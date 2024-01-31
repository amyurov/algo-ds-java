import Arrays.Array;
import Arrays.OrderedArray;
import Arrays.SimpleArray;
import Arrays.SimpleArrayNoDoubles;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        OrderedArray ordArr = new OrderedArray(16);

        ordArr.print();
        ordArr.insert(5);
        ordArr.insert(8);
        ordArr.insert(12);
        ordArr.insert(3);
//        ordArr.insert(7);
//        ordArr.insert(15);
//        ordArr.insert(11);
        ordArr.print();
    }
}