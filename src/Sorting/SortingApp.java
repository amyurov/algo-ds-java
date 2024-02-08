package Sorting;

import java.util.Random;

public class SortingApp {
    public static void main(String[] args) {
        Random random = new Random();
        BubbleSortArray sortArray = new BubbleSortArray(10);

//        for (int i = 0; i < 10; i++) {
//            sortArray.insert(random.nextInt(100));
//        }

        sortArray.insert(50);
        sortArray.insert(48);
        sortArray.insert(69);
        sortArray.insert(11);
        sortArray.insert(46);
        sortArray.insert(40);
        sortArray.insert(17);
        sortArray.insert(61);
        sortArray.insert(54);
        sortArray.insert(1);

        sortArray.print();
        sortArray.bubbleSort();
//        sortArray.print();

    }
}
