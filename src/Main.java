import Arrays.OrderedArray;
import Arrays.SimpleArray;

public class Main {
    public static void main(String[] args) {

        int cap = 10;
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

        OrderedArray orderedArray = new OrderedArray(cap);

        orderedArray.insert(0);
        orderedArray.insert(2);
        orderedArray.insert(4);
        orderedArray.insert(6);
        orderedArray.insert(8);
        orderedArray.insert(10);
        orderedArray.insert(12);
        orderedArray.insert(14);

        System.out.println(orderedArray.biSearch(11));


    }
}