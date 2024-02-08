import Arrays.OrderedArray;
import Arrays.SimpleArray;

import java.util.Random;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {

        int cap = 15;
//        SimpleArray unordered = new SimpleArray(cap);
//        SimpleArray ordered = new SimpleArray(cap);
//
//        unordered.insert(5);
//        unordered.insert(3);
//        unordered.insert(8);
//        unordered.insert(6);
//        unordered.insert(9);
//        unordered.insert(2);
//        unordered.insert(4);
//        unordered.insert(1);
//        unordered.insert(7);
//        unordered.insert(0);
//
//        unordered.print();
//
//        for (int i = 0; i < cap; i++) {
//            ordered.insert(unordered.removeMax());
//        }
//
//        ordered.print();

//        OrderedArray orderedArray = new OrderedArray(cap);
//
//        orderedArray.insert(5);
//        orderedArray.insert(3);
//        orderedArray.insert(8);
//        orderedArray.insert(6);
//        orderedArray.insert(9);
//        orderedArray.insert(2);
//        orderedArray.insert(4);
//        orderedArray.insert(1);
//        orderedArray.insert(7);
//        orderedArray.insert(0);
//        orderedArray.print();
//
//        System.out.println(orderedArray.find(4));
//        System.out.println(orderedArray.find(20));

        OrderedArray arrToM1 = new OrderedArray(15);
        OrderedArray arrToM2 = new OrderedArray(12);

        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            arrToM1.insert(random.nextInt(30));
            arrToM2.insert(random.nextInt(30));
        }

        arrToM1.print();
        arrToM2.print();

        OrderedArray.merge(arrToM1, arrToM2).print();

    }
}