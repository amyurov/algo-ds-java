import Arrays.Array;
import Arrays.OrderedArray;
import Arrays.SimpleArray;
import Arrays.SimpleArrayNoDoubles;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int maxCapacity = 16;
        OrderedArray ordArr = new OrderedArray(maxCapacity);

        Random random = new Random();
//        for (int i = 0; i <12; i++) {
//            ordArr.insert(random.nextInt(20));
//            ordArr.print();
//        }

        ordArr.insert(5);
        ordArr.print();
        ordArr.insert(15);
        ordArr.print();
        ordArr.insert(4);
        ordArr.print();
        ordArr.insert(27);
        ordArr.print();
    }
}